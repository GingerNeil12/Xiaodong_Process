package com.nearlam.models;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Note
{
	@JsonProperty("Id")
	private int id;
	@JsonProperty("Reason")
	private String reason;
	@JsonProperty("Details")
	private String details;
	@JsonProperty("DateOfNote")
	private LocalDateTime dateOfNote;
	@JsonProperty("ContactId")
	private int contactId;
	@JsonProperty("Contact")
	private Contact contact;
	
	public int getId()
	{
		return id;
	}
	public String getReason()
	{
		return reason;
	}
	public String getDetails()
	{
		return details;
	}
	public LocalDateTime getDateOfNote()
	{
		return dateOfNote;
	}
	public int getContactId()
	{
		return contactId;
	}
	public Contact getContact()
	{
		return contact;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	public void setReason(String reason)
	{
		this.reason = reason;
	}
	public void setDetails(String details)
	{
		this.details = details;
	}
	public void setDateOfNote(LocalDateTime dateOfNote)
	{
		this.dateOfNote = dateOfNote;
	}
	public void setContactId(int contactId)
	{
		this.contactId = contactId;
	}
	public void setContact(Contact contact)
	{
		this.contact = contact;
	}
	
	public Note()
	{
		super();
	}
	public Note(int id, String reason, String details, LocalDateTime dateOfNote, int contactId, Contact contact)
	{
		super();
		this.id = id;
		this.reason = reason;
		this.details = details;
		this.dateOfNote = dateOfNote;
		this.contactId = contactId;
		this.contact = contact;
	}
}
