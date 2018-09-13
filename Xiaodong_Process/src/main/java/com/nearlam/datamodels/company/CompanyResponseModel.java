package com.nearlam.datamodels.company;

import java.util.ArrayList;
import java.util.List;

import com.nearlam.datamodels.contact.ContactAttachModel;
import com.nearlam.datamodels.region.RegionAttachModel;

public class CompanyResponseModel {
	private int id;
	private String name;
	private String address;
	private String city;
	private int regionId;
	private RegionAttachModel region;
	private List<ContactAttachModel> contacts;
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
	public RegionAttachModel getRegion() {
		return region;
	}
	public List<ContactAttachModel> getContacts() {
		return contacts;
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
	public void setRegion(RegionAttachModel region) {
		this.region = region;
	}
	public void setContacts(List<ContactAttachModel> contacts) {
		this.contacts = contacts;
	}
	
	public CompanyResponseModel(){
		this(0, "", "", "", 0, new RegionAttachModel(), new ArrayList<ContactAttachModel>());
	}
	public CompanyResponseModel(int id, String name, String address, String city, int regionId,
			RegionAttachModel region, List<ContactAttachModel> contacts) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.regionId = regionId;
		this.region = region;
		this.contacts = contacts;
	}
}
