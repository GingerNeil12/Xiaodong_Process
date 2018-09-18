package com.nearlam.JSON;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.nearlam.models.Company;
import com.nearlam.models.Contact;

public class ContactJsonMapper implements IJsonMapper<Contact>
{
	private ObjectMapper mapper;
	
	public ContactJsonMapper()
	{
		mapper = new ObjectMapper();
		mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
	}
	
	@Override
	public Contact deserialize(String json)
	{
		try
		{
			return mapper.readValue(json, Contact.class);
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<Contact> deserializeList(String json)
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
	public String serialize(Contact obj)
	{
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
