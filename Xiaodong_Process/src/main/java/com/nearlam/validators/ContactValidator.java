package com.nearlam.validators;

import java.util.ArrayList;
import java.util.List;

import com.nearlam.models.Contact;

public class ContactValidator implements IValidate<Contact>
{
	private List<String> errors;
	private Contact contact;
	
	public ContactValidator()
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
	public void setEntity(Contact entity)
	{
		this.contact = entity;
	}

	@Override
	public void validate()
	{
		// VALIDATE STUFF GOES HERE USING REGEX	
	}
}
