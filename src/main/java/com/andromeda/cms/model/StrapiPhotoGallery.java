package com.andromeda.cms.model;

import java.sql.Timestamp;
import java.util.List;

import com.andromeda.commons.model.BaseModel;

public class StrapiPhotoGallery extends BaseModel
{
	private String url;
	private int id;
	private String author;
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
	private String imageCaption;
	private String imageUrl;
	private int imageWidth;
	private int imageHeight;
	private String thumbnailPrimaryImageUrl;
	private PhotoBulkUpload photoBulkUpload;
	private List<ImageWithDescription> imageWithDescription;
	private StoryGeographicLocation photoLocation;
	private StrapiCategory category;
	private StrapiSubCategory subCategory;
	private List<StrapiTag> tags;
	private String locale;
	private Boolean published;
	private String source;
	private Boolean prioritiseInPhotoLanding;
	private String publishedAtSm;
	private String updatedAtSm;
	private boolean deleted;
	private List<String> photoSlider;
	
	
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
	public StoryGeographicLocation getPhotoLocation() {
		return photoLocation;
	}
	public void setPhotoLocation(StoryGeographicLocation photoLocation) {
		this.photoLocation = photoLocation;
	}
	public StrapiSubCategory getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(StrapiSubCategory subCategory) {
		this.subCategory = subCategory;
	}
	public List<StrapiTag> getTags() {
		return tags;
	}
	public void setTags(List<StrapiTag> tags) {
		this.tags = tags;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public List<ImageWithDescription> getImageWithDescription() {
		return imageWithDescription;
	}
	public void setImageWithDescription(List<ImageWithDescription> imageWithDescription) {
		this.imageWithDescription = imageWithDescription;
	}
	public StrapiCategory getCategory() {
		return category;
	}
	public void setCategory(StrapiCategory category) {
		this.category = category;
	}
	public PhotoBulkUpload getPhotoBulkUpload() {
		return photoBulkUpload;
	}
	public void setPhotoBulkUpload(PhotoBulkUpload photoBulkUpload) {
		this.photoBulkUpload = photoBulkUpload;
	}
	public Boolean getPrioritiseInPhotoLanding() {
		return prioritiseInPhotoLanding;
	}
	public void setPrioritiseInPhotoLanding(Boolean prioritiseInPhotoLanding) {
		this.prioritiseInPhotoLanding = prioritiseInPhotoLanding;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<String> getPhotoSlider() {
		return photoSlider;
	}
	public void setPhotoSlider(List<String> photoSlider) {
		this.photoSlider = photoSlider;
	}
	
	
	
	
}
