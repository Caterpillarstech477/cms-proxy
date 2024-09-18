package com.andromeda.cms.model;

import java.sql.Timestamp;


import com.andromeda.commons.model.BaseModel;

public class Cartoon extends BaseModel
{
	private int id;
	private String cartoonId;
	private String abnStoryId;
	private String title;
	private String englishTitle;
	private String imageUrl;
	private String imageCaption;
	private String imageAlternativeText;
	private String newsKeywords;
	private String tags;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Timestamp publishedAt;
	private int imageWidth;
	private int imageHeight;
	private String source;
	private int primaryCategoryId;
	private String primaryCategoryName;
	private String primaryCategoryTeluguLabel;
	private String primaryCategorySeoSlug;
	private String primaryCategoryUrl;
	private Boolean published;
	private String publishedAtSm;
	private String updatedAtSm;
	private boolean deleted;
	
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public int getPrimaryCategoryId() {
		return primaryCategoryId;
	}
	public void setPrimaryCategoryId(int primaryCategoryId) {
		this.primaryCategoryId = primaryCategoryId;
	}
	public String getPrimaryCategoryName() {
		return primaryCategoryName;
	}
	public void setPrimaryCategoryName(String primaryCategoryName) {
		this.primaryCategoryName = primaryCategoryName;
	}
	public String getPrimaryCategoryTeluguLabel() {
		return primaryCategoryTeluguLabel;
	}
	public void setPrimaryCategoryTeluguLabel(String primaryCategoryTeluguLabel) {
		this.primaryCategoryTeluguLabel = primaryCategoryTeluguLabel;
	}
	public String getPrimaryCategorySeoSlug() {
		return primaryCategorySeoSlug;
	}
	public void setPrimaryCategorySeoSlug(String primaryCategorySeoSlug) {
		this.primaryCategorySeoSlug = primaryCategorySeoSlug;
	}
	public String getPrimaryCategoryUrl() {
		return primaryCategoryUrl;
	}
	public void setPrimaryCategoryUrl(String primaryCategoryUrl) {
		this.primaryCategoryUrl = primaryCategoryUrl;
	}
	public String getCartoonId() {
		return cartoonId;
	}
	public void setCartoonId(String cartoonId) {
		this.cartoonId = cartoonId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEnglishTitle() {
		return englishTitle;
	}
	public void setEnglishTitle(String englishTitle) {
		this.englishTitle = englishTitle;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getImageCaption() {
		return imageCaption;
	}
	public void setImageCaption(String imageCaption) {
		this.imageCaption = imageCaption;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	public Timestamp getPublishedAt() {
		return publishedAt;
	}
	public void setPublishedAt(Timestamp publishedAt) {
		this.publishedAt = publishedAt;
	}
	
	public int getImageWidth() {
		return imageWidth;
	}
	public void setImageWidth(int imageWidth) {
		this.imageWidth = imageWidth;
	}
	public int getImageHeight() {
		return imageHeight;
	}
	public void setImageHeight(int imageHeight) {
		this.imageHeight = imageHeight;
	}
	public String getImageAlternativeText() {
		return imageAlternativeText;
	}
	public void setImageAlternativeText(String imageAlternativeText) {
		this.imageAlternativeText = imageAlternativeText;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNewsKeywords() {
		return newsKeywords;
	}
	public void setNewsKeywords(String newsKeywords) {
		this.newsKeywords = newsKeywords;
	}
	public Boolean getPublished() {
		return published;
	}
	public void setPublished(Boolean published) {
		this.published = published;
	}
	public String getPublishedAtSm() {
		return publishedAtSm;
	}
	public void setPublishedAtSm(String publishedAtSm) {
		this.publishedAtSm = publishedAtSm;
	}
	public String getUpdatedAtSm() {
		return updatedAtSm;
	}
	public void setUpdatedAtSm(String updatedAtSm) {
		this.updatedAtSm = updatedAtSm;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	public String getAbnStoryId() {
		return abnStoryId;
	}
	public void setAbnStoryId(String abnStoryId) {
		this.abnStoryId = abnStoryId;
	}

}
