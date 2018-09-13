package com.nearlam.datamodels.contact;

public class ContactAddModel {
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private int companyId;
	
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
	
	public ContactAddModel() {
		this("", "", "", "", 0);
	}
	public ContactAddModel(String firstName, String lastName, String email, 
			String phoneNumber, int companyId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
}
