package com.nearlam.datamodels.contact;

public class ContactUpdateModel {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private int companyId;
	
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public int getCompanyId() {
		return companyId;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	
	public ContactUpdateModel() {
		this(0, "", "", "", "", 0);
	}
	public ContactUpdateModel(int id, String firstName, String lastName, String email, String phoneNumber,
			int companyId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.companyId = companyId;
	}
}
