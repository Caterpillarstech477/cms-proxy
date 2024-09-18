package com.andromeda.cms.model;

import com.andromeda.commons.model.BaseModel;

public class StrapiImage extends BaseModel
{
	private int id;
	private String name;
	private String alternativeText;
	private String caption;
	private String url;
	private String smallImageUrl;
	private String mediumImageUrl;
	private String largeImageUrl;
	private String thumbnailImageUrl;
	private String ext;
	private int width;
	private int height;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
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

	public String getSmallImageUrl() {
		return smallImageUrl;
	}
	public void setSmallImageUrl(String smallImageUrl) {
		this.smallImageUrl = smallImageUrl;
	}
	public String getMediumImageUrl() {
		return mediumImageUrl;
	}
	public void setMediumImageUrl(String mediumImageUrl) {
		this.mediumImageUrl = mediumImageUrl;
	}
	public String getLargeImageUrl() {
		return largeImageUrl;
	}
	public void setLargeImageUrl(String largeImageUrl) {
		this.largeImageUrl = largeImageUrl;
	}
	public String getThumbnailImageUrl() {
		return thumbnailImageUrl;
	}
	public void setThumbnailImageUrl(String thumbnailImageUrl) {
		this.thumbnailImageUrl = thumbnailImageUrl;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
