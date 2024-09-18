package com.andromeda.cms.model;

import java.sql.Timestamp;
import java.util.List;

import com.andromeda.commons.model.BaseModel;

public class StrapiCartoon extends BaseModel {
	private int id;
	private String cartoonId;
	private String abnStoryId;
	private String imageURL;
	private String title;
	private String englishTitle;
	private StrapiImage image;
	private String newsKeywords;
	private List<StrapiTag> tags;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Timestamp publishedAt;
	private String locale;
	private String source;
	private StrapiCategory category;
	private Boolean published;
	private String publishedAtSm;
	private String updatedAtSm;
	private boolean deleted;
	
	
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
	public List<StrapiTag> getTags() {
		return tags;
	}
	public void setTags(List<StrapiTag> tags) {
		this.tags = tags;
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
	public StrapiImage getImage() {
		return image;
	}
	public void setImage(StrapiImage image) {
		this.image = image;
	}

	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public StrapiCategory getCategory() {
		return category;
	}
	public void setCategory(StrapiCategory category) {
		this.category = category;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAbnStoryId() {
		return abnStoryId;
	}
	public void setAbnStoryId(String abnStoryId) {
		this.abnStoryId = abnStoryId;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	
	
}
