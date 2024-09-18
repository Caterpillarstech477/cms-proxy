package com.andromeda.cms.model;

import com.andromeda.commons.model.BaseModel;

public class ImageWithDescription extends BaseModel
{
	int id;
	String photoDescription;
	StrapiImage strapiImage;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhotoDescription() {
		return photoDescription;
	}
	public void setPhotoDescription(String photoDescription) {
		this.photoDescription = photoDescription;
	}
	public StrapiImage getStrapiImage() {
		return strapiImage;
	}
	public void setStrapiImage(StrapiImage strapiImage) {
		this.strapiImage = strapiImage;
	}
	
	
}
