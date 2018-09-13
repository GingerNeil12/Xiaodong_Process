package com.nearlam.datamodels.note;

public class NoteAddModel {
	private String reason;
	private String details;
	private int contactId;
	
	public String getReason() {
		return reason;
	}
	public String getDetails() {
		return details;
	}
	public int getContactId() {
		return contactId;
	}
	
	public void setReason(String reason) {
		this.reason = reason;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	
	public NoteAddModel() {
		this("", "", 0);
	}
	public NoteAddModel(String reason, String details, int contactId) {
		super();
		this.reason = reason;
		this.details = details;
		this.contactId = contactId;
	}
	
	
}
