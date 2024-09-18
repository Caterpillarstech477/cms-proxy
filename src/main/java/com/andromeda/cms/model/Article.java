package com.andromeda.cms.model;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

import com.andromeda.commons.dao.BaseDAO;
import com.andromeda.commons.model.BaseModel;

public class Article extends BaseModel
{
	private int id;
	private String url;
	private String ampUrl;
	private String abnStoryId;
	private String author;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Timestamp publishedAt; //(format May 23, 2022 / 12:17 PM IST)
	private int publishedYear;
	private String contentType;
	private String headline;
	private String shortHeadline;
	private String articleText;
	private String englishTitle;
	private String summary;
	private String imageMediumUrl; //deleted
	private String imageSmallUrl;// deleted
	private String imageThumbUrl;
	private String imageUrl;
	private String imageCaption;
	private int imageWidth;
	private int imageHeight;
	private int primaryCategoryId;
	private String primaryCategoryName;
	private String primaryCategoryTeluguLabel;
	private String primaryCategorySeoSlug;
	private String primaryCategoryUrl;
	private String primarySubCategoryTeluguLabel;
	private int primarySubCategoryId;
	private String primarySubCategoryName;
	private String primarySubCategorySeoSlug;
	private String primarySubCategoryUrl;
	private String seoSlug;
	private String newsKeywords;
	private String metaTitle;
	private String metaDescription;
	private String tags;
	private String tagUrls;
	private String relatedArticles; // comma seperated list of related articles
	private String photos;
	private String videos;
	private Boolean prioritiseInLatestNews;
	private Boolean prioritiseInPrimarySection;
	private Boolean displayModifiedDate;
	private Boolean published;
	private String source;
	private String publishedAtSm;
	private String updatedAtSm;
	private boolean deleted;
	private boolean hideAuthorName;
	private String locale;
	private String ampArticleText;
	private Set<String> ampHeaders;


	public Boolean isPrioritiseInLatestNews() {
		return prioritiseInLatestNews;
	}
	public void setPrioritiseInLatestNews(Boolean prioritiseInLatestNews) {
		this.prioritiseInLatestNews = prioritiseInLatestNews;
	}
	public Boolean isPrioritiseInPrimarySection() {
		return prioritiseInPrimarySection;
	}
	public void setPrioritiseInPrimarySection(Boolean prioritiseInPrimarySection) {
		this.prioritiseInPrimarySection = prioritiseInPrimarySection;
	}
	public Boolean isDisplayModifiedDate() {
		return displayModifiedDate;
	}
	public void setDisplayModifiedDate(Boolean displayModifiedDate) {
		this.displayModifiedDate = displayModifiedDate;
	}
	public String getPrimaryCategorySeoSlug() {
		return primaryCategorySeoSlug;
	}
	public void setPrimaryCategorySeoSlug(String primaryCategorySeoSlug) {
		this.primaryCategorySeoSlug = primaryCategorySeoSlug;
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
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getHeadline() {
		return headline;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	public String getShortHeadline() {
		return shortHeadline;
	}
	public void setShortHeadline(String shortHeadline) {
		this.shortHeadline = shortHeadline;
	}
	public String getArticleText() {
		return articleText;
	}
	public void setArticleText(String articleText) {
		this.articleText = articleText;
	}
	public String getEnglishTitle() {
		return englishTitle;
	}
	public void setEnglishTitle(String englishTitle) {
		this.englishTitle = englishTitle;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getImageMediumUrl() {
		return imageMediumUrl;
	}
	public void setImageMediumUrl(String imageMediumUrl) {
		this.imageMediumUrl = imageMediumUrl;
	}
	public String getImageSmallUrl() {
		return imageSmallUrl;
	}
	public void setImageSmallUrl(String imageSmallUrl) {
		this.imageSmallUrl = imageSmallUrl;
	}
	public String getImageThumbUrl() {
		return imageThumbUrl;
	}
	public void setImageThumbUrl(String imageThumbUrl) {
		this.imageThumbUrl = imageThumbUrl;
	}
	public String getImageCaption() {
		return imageCaption;
	}
	public void setImageCaption(String imageCaption) {
		this.imageCaption = imageCaption;
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
	public String getAbnStoryId() {
		return abnStoryId;
	}
	public void setAbnStoryId(String abnStoryId) {
		this.abnStoryId = abnStoryId;
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
	
	public String getPrimaryCategoryTeluguLabel() {
		return primaryCategoryTeluguLabel;
	}
	public void setPrimaryCategoryTeluguLabel(String primaryCategoryTeluguLabel) {
		this.primaryCategoryTeluguLabel = primaryCategoryTeluguLabel;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPrimaryCategoryName() {
		return primaryCategoryName;
	}
	public void setPrimaryCategoryName(String primaryCategoryName) {
		this.primaryCategoryName = primaryCategoryName;
	}
	public String getPrimarySubCategoryName() {
		return primarySubCategoryName;
	}
	public void setPrimarySubCategoryName(String primarySubCategoryName) {
		this.primarySubCategoryName = primarySubCategoryName;
	}
	public String getRelatedArticles() {
		return relatedArticles;
	}
	public void setRelatedArticles(String relatedArticles) {
		this.relatedArticles = relatedArticles;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getPhotos() {
		return photos;
	}
	public void setPhotos(String photos) {
		this.photos = photos;
	}
	public String getVideos() {
		return videos;
	}
	public void setVideos(String videos) {
		this.videos = videos;
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
	public String getPrimaryCategoryUrl() {
		return primaryCategoryUrl;
	}
	public void setPrimaryCategoryUrl(String primaryCategoryUrl) {
		this.primaryCategoryUrl = primaryCategoryUrl;
	}
	public String getPrimarySubCategoryUrl() {
		return primarySubCategoryUrl;
	}
	public void setPrimarySubCategoryUrl(String primarySubCategoryUrl) {
		this.primarySubCategoryUrl = primarySubCategoryUrl;
	}
	public int getPrimaryCategoryId() {
		return primaryCategoryId;
	}
	public void setPrimaryCategoryId(int primaryCategoryId) {
		this.primaryCategoryId = primaryCategoryId;
	}
	public int getPrimarySubCategoryId() {
		return primarySubCategoryId;
	}
	public void setPrimarySubCategoryId(int primarySubCategoryId) {
		this.primarySubCategoryId = primarySubCategoryId;
	}
	public int getPublishedYear() {
		return publishedYear;
	}
	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
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
	public boolean isHideAuthorName() {
		return hideAuthorName;
	}
	public void setHideAuthorName(boolean hideAuthorName) {
		this.hideAuthorName = hideAuthorName;
	}
	public String getTagUrls() {
		return tagUrls;
	}
	public void setTagUrls(String tagUrls) {
		this.tagUrls = tagUrls;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public String getAmpArticleText() {
		return ampArticleText;
	}
	public void setAmpArticleText(String ampArticleText) {
		this.ampArticleText = ampArticleText;
	}
	public Set<String> getAmpHeaders() {
		return ampHeaders;
	}
	public void setAmpHeaders(Set<String> ampHeaders) {
		this.ampHeaders = ampHeaders;
	}
	
}
