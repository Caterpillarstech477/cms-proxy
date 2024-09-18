package com.andromeda.cms.model;

import com.andromeda.commons.model.BaseModel;

public class CJCategory extends BaseModel{
	private int id;
	private String categoryId;
	private String name;
	private String description;
	private String url;
	private String metaTitle;
	private String metaDescription;
	private String keywords;
	private String teluguLabel;
	private String seoSlug;
	private String subCategories; // comma separated string of subCategories
	private int priority;
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMetaTitle() {
		return metaTitle;
	}
	public void setMetaTitle(String metaTitle) {
		this.metaTitle = metaTitle;
	}
	public String getMetaDescription() {
		return metaDescription;
	}
	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
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
	public String getSeoSlug() {
		return seoSlug;
	}
	public void setSeoSlug(String seoSlug) {
		this.seoSlug = seoSlug;
	}
	public String getSubCategories() {
		return subCategories;
	}
	public void setSubCategories(String subCategories) {
		this.subCategories = subCategories;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
}
