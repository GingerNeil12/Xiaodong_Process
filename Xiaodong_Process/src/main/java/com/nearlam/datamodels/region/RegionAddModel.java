package com.nearlam.datamodels.region;

public class RegionAddModel
{
	private String name;
	private String country;
	
	public String getName()
	{
		return name;
	}
	public String getCountry()
	{
		return country;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setCountry(String country)
	{
		this.country = country;
	}
	
	public RegionAddModel()
	{
		this("", "");
	}
	public RegionAddModel(String name, String country)
	{
		this.name = name;
		this.country = country;
	}
}
