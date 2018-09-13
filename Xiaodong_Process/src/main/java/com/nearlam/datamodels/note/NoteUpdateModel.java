package com.nearlam.datamodels.note;

public class NoteUpdateModel {
	private int id;
	private String reason;
	private String details;
	
	public int getId() {
		return id;
	}
	public String getReason() {
		return reason;
	}
	public String getDetails() {
		return details;
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
	
	public NoteUpdateModel() {
		this(0, "", "");
	}
	public NoteUpdateModel(int id, String reason, String details) {
		super();
		this.id = id;
		this.reason = reason;
		this.details = details;
	}
}
