package com.nearlam.validators;

import java.util.ArrayList;
import java.util.List;

import com.nearlam.models.Note;

public class NoteValidator implements IValidate<Note>
{
	private List<String> errors;
	private Note note;
	
	public NoteValidator()
	{
		errors = new ArrayList<String>();
	}
	
	@Override
	public List<String> getErrors()
	{
		return errors;
	}

	@Override
	public int getErrorCount()
	{
		return errors.size();
	}

	@Override
	public void setEntity(Note entity)
	{
		this.note = entity;
	}

	@Override
	public void validate()
	{
		// VALIDATE STUFF GOES HERE USING REGEX	
	}
}
