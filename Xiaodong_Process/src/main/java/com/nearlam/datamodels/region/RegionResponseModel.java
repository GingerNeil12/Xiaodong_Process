package com.nearlam.datamodels.region;

import java.util.ArrayList;
import java.util.List;

import com.nearlam.datamodels.company.CompanyAttachModel;

public class RegionResponseModel
{
	private int id;
	private String name;
	private String country;
	private List<CompanyAttachModel> companies;
	
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
	public List<CompanyAttachModel> getCompanies()
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
	public void setCompanies(List<CompanyAttachModel> companies)
	{
		this.companies = companies;
	}
	
	public RegionResponseModel()
	{
		this(0, "", "", new ArrayList<CompanyAttachModel>());
	}
	public RegionResponseModel(int id, String name, String country, List<CompanyAttachModel> companies)
	{
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.companies = companies;
	}
	
	
}
