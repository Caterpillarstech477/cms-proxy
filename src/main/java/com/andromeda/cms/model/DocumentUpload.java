package com.andromeda.cms.model;

import com.andromeda.commons.model.BaseModel;

public class DocumentUpload extends BaseModel
{
	private int id;
	private String name;
	private String alternativeText;
	private String caption;
	private String url;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlternativeText() {
		return alternativeText;
	}
	public void setAlternativeText(String alternativeText) {
		this.alternativeText = alternativeText;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
