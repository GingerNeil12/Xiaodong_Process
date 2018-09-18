package com.nearlam.JSON;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nearlam.models.Company;

public class CompanyJsonMapper implements IJsonMapper<Company>
{
	private ObjectMapper mapper;
	
	public CompanyJsonMapper() 
	{
		mapper = new ObjectMapper();
		mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
	}

	@Override
	public Company deserialize(String json)
	{
		try
		{
			return mapper.readValue(json, Company.class);
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<Company> deserializeList(String json)
	{
		try
		{
			return mapper.readValue(json, new TypeReference<List<Company>>(){});
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}

	@Override
	public String serialize(Company obj)
	{
		try
		{
			return mapper.writeValueAsString(obj);
		} 
		catch (Exception e)
		{
			throw new RuntimeException(e);
		}
	}
}
