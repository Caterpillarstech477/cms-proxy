package com.andromeda.cms.model;

import java.sql.Timestamp;
import com.andromeda.commons.model.BaseModel;

public class PhotoGallery extends BaseModel
{
	private int id;
	private String url;
	private String ampUrl;
	private String headline;
	private String englishTitle;
	private String seoSlug;
	private String newsKeywords;
	private String metaTitle;
	private String metaDescription;
	private String contentType;
	private String summary;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Timestamp publishedAt; //(format May 23, 2022 / 12:17 PM IST)
	private String abnStoryId;
	private String bulkImageUpload; // Java List of hashmaps - saved in DB as JSONB
	private String imageWithDescription; // Java List of hashmaps - saved in DB as JSONB
	private String photoLocation;
	private int primaryCategoryId;
	private String primaryCategoryName;
	private String primaryCategoryTeluguLabel;
	private String primaryCategorySeoSlug;
	private String primaryCategoryUrl;
	private int primarySubCategoryId;
	private String primarySubCategoryName;
	private String primarySubCategoryTeluguLabel;
	private String primarySubCategorySeoSlug;
	private String primarySubCategoryUrl;
	private String tags; // comma seperated list of tags
	private String tagUrls; // comma seperated list of tag urls
	private String locale;
	private Boolean published;
	private String source;
	private int publishedYear;
	private String author;
	private String imageCaption;
	private String imageUrl;
	private int imageWidth;
	private int imageHeight;
	private String thumbnailPrimaryImageUrl;
	private Boolean prioritiseInPhotoLanding;
	private String publishedAtSm;
	private String updatedAtSm;
	private boolean deleted;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHeadline() {
		return headline;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	public String getEnglishTitle() {
		return englishTitle;
	}
	public void setEnglishTitle(String englishTitle) {
		this.englishTitle = englishTitle;
	}
	public String getSeoSlug() {
		return seoSlug;
	}
	public void setSeoSlug(String seoSlug) {
		this.seoSlug = seoSlug;
	}
	public String getNewsKeywords() {
		return newsKeywords;
	}
	public void setNewsKeywords(String newsKeywords) {
		this.newsKeywords = newsKeywords;
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
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
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
	public String getAbnStoryId() {
		return abnStoryId;
	}
	public void setAbnStoryId(String abnStoryId) {
		this.abnStoryId = abnStoryId;
	}
	public String getBulkImageUpload() {
		return bulkImageUpload;
	}
	public void setBulkImageUpload(String bulkImageUpload) {
		this.bulkImageUpload = bulkImageUpload;
	}
	public String getPhotoLocation() {
		return photoLocation;
	}
	public void setPhotoLocation(String photoLocation) {
		this.photoLocation = photoLocation;
	}
	
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public Boolean getPublished() {
		return published;
	}
	public void setPublished(Boolean published) {
		this.published = published;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getImageWithDescription() {
		return imageWithDescription;
	}
	public void setImageWithDescription(String imageWithDescription) {
		this.imageWithDescription = imageWithDescription;
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
	
	public int getPublishedYear() {
		return publishedYear;
	}
	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getPrimarySubCategoryId() {
		return primarySubCategoryId;
	}
	public void setPrimarySubCategoryId(int primarySubCategoryId) {
		this.primarySubCategoryId = primarySubCategoryId;
	}
	public String getPrimarySubCategoryName() {
		return primarySubCategoryName;
	}
	public void setPrimarySubCategoryName(String primarySubCategoryName) {
		this.primarySubCategoryName = primarySubCategoryName;
	}
	public String getPrimarySubCategoryTeluguLabel() {
		return primarySubCategoryTeluguLabel;
	}
	public void setPrimarySubCategoryTeluguLabel(String primarySubCategoryTeluguLabel) {
		this.primarySubCategoryTeluguLabel = primarySubCategoryTeluguLabel;
	}
	public String getPrimarySubCategorySeoSlug() {
		return primarySubCategorySeoSlug;
	}
	public void setPrimarySubCategorySeoSlug(String primarySubCategorySeoSlug) {
		this.primarySubCategorySeoSlug = primarySubCategorySeoSlug;
	}
	public String getPrimarySubCategoryUrl() {
		return primarySubCategoryUrl;
	}
	public void setPrimarySubCategoryUrl(String primarySubCategoryUrl) {
		this.primarySubCategoryUrl = primarySubCategoryUrl;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getImageCaption() {
		return imageCaption;
	}
	public void setImageCaption(String imageCaption) {
		this.imageCaption = imageCaption;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
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
	public String getThumbnailPrimaryImageUrl() {
		return thumbnailPrimaryImageUrl;
	}
	public void setThumbnailPrimaryImageUrl(String thumbnailPrimaryImageUrl) {
		this.thumbnailPrimaryImageUrl = thumbnailPrimaryImageUrl;
	}
	public Boolean getPrioritiseInPhotoLanding() {
		return prioritiseInPhotoLanding;
	}
	public void setPrioritiseInPhotoLanding(Boolean prioritiseInPhotoLanding) {
		this.prioritiseInPhotoLanding = prioritiseInPhotoLanding;
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
	public String getAmpUrl() {
		return ampUrl;
	}
	public void setAmpUrl(String ampUrl) {
		this.ampUrl = ampUrl;
	}
	public String getTagUrls() {
		return tagUrls;
	}
	public void setTagUrls(String tagUrls) {
		this.tagUrls = tagUrls;
	}
	
}
