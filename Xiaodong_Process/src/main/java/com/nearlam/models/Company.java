package com.nearlam.models;

import java.util.ArrayList;
import java.util.List;

public class Company
{
	private int id;
	private String name;
	private String address;
	private String city;
	private int regionId;
	private Region region;
	private List<Contact> contacts = new ArrayList<Contact>();
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public String getCity()
	{
		return city;
	}
	public int getRegionId()
	{
		return regionId;
	}
	public Region getRegion()
	{
		return region;
	}
	public List<Contact> getContacts()
	{
		return contacts;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public void setRegionId(int regionId)
	{
		this.regionId = regionId;
	}
	public void setRegion(Region region)
	{
		this.region = region;
	}
	public void setContacts(List<Contact> contacts)
	{
		this.contacts = contacts;
	}
	
	public Company()
	{
		super();
	}
	public Company(int id, String name, String address, String city, int regionId, Region region,
			List<Contact> contacts)
	{
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
