package com.earlam.validators;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.nearlam.models.Region;

public class RegionValidator implements IValidate<Region> 
{
	private List<String> errors;
	private Region region;
	
	public RegionValidator()
	{
		errors = new ArrayList<String>();
	}
	
	@Override
	public List<String> getErrors() {
		return errors;
	}

	@Override
	public int getErrorCount() {
		return errors.size();
	}

	@Override
	public void setEntity(Region entity) {
		this.region = entity;
	}

	@Override
	public void validate() {
		if(isAlphaOnly(region.getName()) == false)
			errors.add("Name");
		if(isAlphaOnly(region.getCountry()) == false)
			errors.add("Country");
		
	}
	
	private boolean isAlphaOnly(String details)
	{
		String regex = "^[\\\\p{L} .'-]{256}$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(details);
		return matcher.find();
	}

}
