package com.nearlam.datamodels.note;

import java.time.LocalDateTime;

import com.earlam.datamodels.contact.ContactAttachModel;

public class NoteResponseModel {
	private int id;
	private String reason;
	private String details;
	private LocalDateTime dateOfNote;
	private int contactId;
	private ContactAttachModel contact;
	
	public int getId() {
		return id;
	}
	public String getReason() {
		return reason;
	}
	public String getDetails() {
		return details;
	}
	public LocalDateTime getDateOfNote() {
		return dateOfNote;
	}
	public int getContactId() {
		return contactId;
	}
	public ContactAttachModel getContact() {
		return contact;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public void setDateOfNote(LocalDateTime dateOfNote) {
		this.dateOfNote = dateOfNote;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public void setContact(ContactAttachModel contact) {
		this.contact = contact;
	}
	
	public NoteResponseModel() {
		this(0, "", "", LocalDateTime.now(), 0, new ContactAttachModel());
	}
	public NoteResponseModel(int id, String reason, String details, LocalDateTime dateOfNote, int contactId,
			ContactAttachModel contact) {
		super();
		this.id = id;
		this.reason = reason;
		this.details = details;
		this.dateOfNote = dateOfNote;
		this.contactId = contactId;
		this.contact = contact;
	}
}
