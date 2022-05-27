package com.WebExperiment.HairdressingAppointmentPlatform.entity;

public class DataDict {
	private Integer id;
	private String value;
	private String title;
	private String type;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public DataDict(Integer id, String value, String title, String type) {
		super();
		this.id = id;
		this.value = value;
		this.title = title;
		this.type = type;
	}
	public DataDict() {
		super();
	}
	@Override
	public String toString() {
		return "DataDict [id=" + id + ", value=" + value + ", title=" + title + ", type=" + type + "]";
	}
	
}
