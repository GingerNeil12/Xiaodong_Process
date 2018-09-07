package com.nearlam.models;

import java.util.ArrayList;
import java.util.List;

public class Region 
{
	private int id;
	private String name;
	private String country;	
	private List<Company> companies = new ArrayList<Company>();
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String getCountry()
	{
		return country;
	}
	public List<Company> getCompanies()
	{
		return companies;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setCountry(String country)
	{
		this.country = country;
	}
	public void setCompanies(List<Company> companies)
	{
		this.companies = companies;
	}
	
	public Region()
	{
		this(0, "", "", new ArrayList<Company>());
	}
	public Region(int id, String name, String country, List<Company> companies)
	{
		this.id = id;
		this.name = name;
		this.country = country;
		this.companies = companies;
	}
}
