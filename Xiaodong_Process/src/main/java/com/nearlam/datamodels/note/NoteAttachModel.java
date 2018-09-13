package com.nearlam.datamodels.note;

import java.time.LocalDateTime;

public class NoteAttachModel {
	private int id;
	private String reason;
	private String details;
	private LocalDateTime dateOfNote;
	
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
	
	public NoteAttachModel() {
		this(0, "", "", LocalDateTime.now());
	}
	public NoteAttachModel(int id, String reason, String details, LocalDateTime dateOfNote) {
		super();
		this.id = id;
		this.reason = reason;
		this.details = details;
		this.dateOfNote = dateOfNote;
	}
}
