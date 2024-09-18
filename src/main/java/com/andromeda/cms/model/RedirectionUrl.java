package com.andromeda.cms.model;

import com.andromeda.commons.model.BaseModel;

public class RedirectionUrl extends BaseModel {

	int id;
	String url;
	String ampUrl;
	int year;
	
	public RedirectionUrl(int id, String url, String ampUrl,int year) {
		super();
		this.id = id;
		this.url = url;
		this.ampUrl = ampUrl;
		this.year = year;
	}

	public String getAmpUrl() {
		return ampUrl;
	}

	public void setAmpUrl(String ampUrl) {
		this.ampUrl = ampUrl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
