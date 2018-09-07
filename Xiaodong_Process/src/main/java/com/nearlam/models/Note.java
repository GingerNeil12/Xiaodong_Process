package com.nearlam.models;

import java.time.LocalDateTime;

public class Note
{
	private int id;
	private String reason;
	private String details;
	private LocalDateTime dateOfNote;
	private int contactId;
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
