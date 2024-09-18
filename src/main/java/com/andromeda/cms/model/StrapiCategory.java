package com.andromeda.cms.model;

import java.util.List;

import com.andromeda.commons.model.BaseModel;

public class StrapiCategory extends BaseModel
{
	private int id;
	private String categoryId;
	private String name;
	private String description;
	private String metaTitle;
	private String keywords;
	private String teluguLabel;
	private String seoSlug;
	private String metaDescription;
	private List<StrapiSubCategory> subCategories;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMetaTitle() {
		return metaTitle;
	}
	public void setMetaTitle(String metaTitle) {
		this.metaTitle = metaTitle;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getTeluguLabel() {
		return teluguLabel;
	}
	public void setTeluguLabel(String teluguLabel) {
		this.teluguLabel = teluguLabel;
	}
	public List<StrapiSubCategory> getSubCategories() {
		return subCategories;
	}
	public void setSubCategories(List<StrapiSubCategory> subCategories) {
		this.subCategories = subCategories;
	}
	public String getSeoSlug() {
		return seoSlug;
	}
	public void setSeoSlug(String seoSlug) {
		this.seoSlug = seoSlug;
	}
	public String getMetaDescription() {
		return metaDescription;
	}
	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

}
