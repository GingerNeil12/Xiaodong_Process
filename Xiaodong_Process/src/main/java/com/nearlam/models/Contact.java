package com.nearlam.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Contact
{
	@JsonProperty("Id")
	private int id;
	@JsonProperty("FirstName")
	private String firstName;
	@JsonProperty("LastName")
	private String lastName;
	@JsonProperty("Email")
	private String email;
	@JsonProperty("PhoneNumber")
	private String phoneNumber;
	@JsonProperty("CompanyId")
	private int companyId;
	@JsonProperty("Company")
	private Company company;
	@JsonProperty("Notes")
	private List<Note> note = new ArrayList<Note>();
	
	public int getId()
	{
		return id;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String getEmail()
	{
		return email;
	}
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	public int getCompanyId()
	{
		return companyId;
	}
	public Company getCompany()
	{
		return company;
	}
	public List<Note> getNote()
	{
		return note;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	public void setCompanyId(int companyId)
	{
		this.companyId = companyId;
	}
	public void setCompany(Company company)
	{
		this.company = company;
	}
	public void setNote(List<Note> note)
	{
		this.note = note;
	}
	
	public Contact()
	{
		super();
	}
	public Contact(int id, String firstName, String lastName, String email, String phoneNumber, int companyId,
			Company company, List<Note> note)
	{
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.companyId = companyId;
		this.company = company;
		this.note = note;
	}
}
