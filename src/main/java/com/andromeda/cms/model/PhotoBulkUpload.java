package com.andromeda.cms.model;

import java.util.List;

import com.andromeda.commons.model.BaseModel;

public class PhotoBulkUpload extends BaseModel
{
	private int id;
	private StrapiImage primaryImage;
	private List<StrapiImage> photoBulkUpload;
	public StrapiImage getPrimaryImage() {
		return primaryImage;
	}
	public void setPrimaryImage(StrapiImage primaryImage) {
		this.primaryImage = primaryImage;
	}
	public List<StrapiImage> getPhotoBulkUpload() {
		return photoBulkUpload;
	}
	public void setPhotoBulkUpload(List<StrapiImage> photoBulkUpload) {
		this.photoBulkUpload = photoBulkUpload;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
