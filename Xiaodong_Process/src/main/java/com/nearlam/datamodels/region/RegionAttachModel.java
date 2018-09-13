package com.nearlam.datamodels.region;

public class RegionAttachModel {
	private int id;
	private String name;
	private String country;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public RegionAttachModel()
	{
		this(0, "", "");
	}
	public RegionAttachModel(int id, String name, String country)
	{
		this.id = id;
		this.name = name;
		this.country = country;
	}
}
