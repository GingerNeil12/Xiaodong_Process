package com.nearlam.datamodels.company;

public class CompanyAddModel {
	private String name;
	private String address;
	private String city;
	private int regionId;
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public int getRegionId() {
		return regionId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}
	
	public CompanyAddModel()
	{
		this("", "", "", 0);
	}
	public CompanyAddModel(String name, String address, String city, int regionId) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.regionId = regionId;
	}
	
	
}
