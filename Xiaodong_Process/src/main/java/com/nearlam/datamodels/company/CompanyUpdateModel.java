package com.nearlam.datamodels.company;

public class CompanyUpdateModel {
	private int id;
	private String name;
	private String address;
	private String city;
	private int regionId;
	
	public int getId() {
		return id;
	}
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
	
	public void setId(int id) {
		this.id = id;
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
	
	public CompanyUpdateModel(){
		this(0, "", "","", 0);
	}
	public CompanyUpdateModel(int id, String name, String address, String city, int regionId) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.regionId = regionId;
	}
	
	
}
