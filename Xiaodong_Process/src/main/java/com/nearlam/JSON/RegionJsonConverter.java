package com.nearlam.JSON;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nearlam.models.Region;

public class RegionJsonConverter
{	
	public static Region getRegionFromJson(String json)
	{
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
		try
		{
			Region region = mapper.readValue(json, Region.class);
			return region;
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}
	
	public static List<Region> getRegionListFromJson(String json)
	{
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
		try
		{
			List<Region> regions = mapper.readValue(json, new TypeReference<List<Region>>() {});
			return regions;
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}
}
