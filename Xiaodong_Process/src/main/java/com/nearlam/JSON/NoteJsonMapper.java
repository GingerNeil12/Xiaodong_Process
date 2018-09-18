package com.nearlam.JSON;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.nearlam.models.Note;

public class NoteJsonMapper implements IJsonMapper<Note>
{
	private ObjectMapper mapper;
	
	public NoteJsonMapper()
	{
		mapper = new ObjectMapper();
		mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
	}
	
	@Override
	public Note deserialize(String json)
	{
		try
		{
			return mapper.readValue(json, Note.class);
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<Note> deserializeList(String json)
	{
		try
		{
			return mapper.readValue(json, new TypeReference<List<Note>>() {});
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}

	@Override
	public String serialize(Note obj)
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
