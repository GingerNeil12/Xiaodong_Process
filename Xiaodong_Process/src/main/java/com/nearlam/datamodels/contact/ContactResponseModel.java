package com.nearlam.datamodels.contact;

import java.util.ArrayList;
import java.util.List;

import com.nearlam.datamodels.company.CompanyAttachModel;
import com.nearlam.datamodels.note.NoteAttachModel;

public class ContactResponseModel {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private int companyId;
	private CompanyAttachModel company;
	private List<NoteAttachModel> notes;
	
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
	public CompanyAttachModel getCompany() {
		return company;
	}
	public List<NoteAttachModel> getNotes() {
		return notes;
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
	public void setCompany(CompanyAttachModel company) {
		this.company = company;
	}
	public void setNotes(List<NoteAttachModel> notes) {
		this.notes = notes;
	}
	
	public ContactResponseModel() {
		this(0, "", "", "", "", 0, new CompanyAttachModel(), new ArrayList<NoteAttachModel>());
	}
	public ContactResponseModel(int id, String firstName, String lastName, String email, String phoneNumber,
			int companyId, CompanyAttachModel company, List<NoteAttachModel> notes) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.companyId = companyId;
		this.company = company;
		this.notes = notes;
	}
	
	
}
