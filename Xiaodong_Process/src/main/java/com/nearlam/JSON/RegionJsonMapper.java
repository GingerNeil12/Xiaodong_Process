package com.nearlam.JSON;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nearlam.models.Region;

public class RegionJsonMapper implements IJsonMapper<Region> {

	private ObjectMapper mapper;
	
	public RegionJsonMapper()
	{
		mapper = new ObjectMapper();
		mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
	}
	
	@Override
	public Region deserialize(String json) {
		try
		{
			return mapper.readValue(json, Region.class);
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<Region> deserializeList(String json) {
		try
		{
			return mapper.readValue(json, new TypeReference<List<Region>>() {});
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}

	@Override
	public String serialize(Region obj) {
		try
		{
			return mapper.writeValueAsString(obj);
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}

}
