package com.nearlam.validators;

import java.util.ArrayList;
import java.util.List;

import com.nearlam.models.Company;

public class CompanyValidator implements IValidate<Company>
{
	private List<String> errors;
	private Company company;
	
	public CompanyValidator()
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
	public void setEntity(Company entity)
	{
		this.company = entity;
	}

	@Override
	public void validate()
	{

		// VALIDATE STUFF GOES HERE USING REGEX	
	}
}
