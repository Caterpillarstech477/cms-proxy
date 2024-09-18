package com.andromeda.cms.model;

public class StrapiSubCategory 
{
	private int id;
	private String subCategoryId;
	private String name;
	private StrapiCategory category;
	private String description;
	private String metaTitle;
	private String metaDescription;
	private String keywords;
	private String teluguLabel;
	private String seoSlug;

	
	public String getSubCategoryId() {
		return subCategoryId;
	}
	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public StrapiCategory getCategory() {
		return category;
	}
	public void setCategory(StrapiCategory category) {
		this.category = category;
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
	public String getSeoSlug() {
		return seoSlug;
	}
	public void setSeoSlug(String seoSlug) {
		this.seoSlug = seoSlug;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMetaDescription() {
		return metaDescription;
	}
	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}
	

}
