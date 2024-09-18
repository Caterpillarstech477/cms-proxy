package com.andromeda.cms.model;

import java.sql.Timestamp;
import java.util.List;

import com.andromeda.commons.model.BaseModel;

public class StrapiArticle extends BaseModel 
{
	private int id;
	private String author;
	private String metaTitle;
	private String metaDescription;
	private String imageCaption;
	private String imageUrl;
	private String smallPrimaryImageUrl;
	private int imageWidth;
	private int imageHeight;
	private String mediumPrimaryImageUrl;
	private String thumbnailPrimaryImageUrl;
	private String largePrimaryImageUrl;
	private String headline;
	private String englishTitle;
	private String summary;
	private String shortHeadline;
	private String newsKeywords;
	private String seoSlug;
	private String contentType;
	private List<ArticleTextEditor> articleTextEditors;
	private StoryGeographicLocation storyGeographicLocation;
	private String abnStoryId;
	private StrapiCategory primaryCategory;
	private StrapiSubCategory primarySubCategory;
	private List<StrapiCategory> secondaryCategories;
	private List<StrapiSubCategory> secondarySubCategories;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Timestamp publishedAt; //(format May 23, 2022 / 12:17 PM IST)
	private List<StrapiTag> tags;
	private List<StrapiArticle> articles;
	private Boolean prioritiseInLatestNews;
	private Boolean prioritiseInPrimarySection;
	private Boolean displayModifiedDate;
	private Boolean published;
	private String source;
	private String publishedAtSm;
	private String updatedAtSm;
	private boolean deleted;
	private String url;
	private boolean hideAuthorName;
	private String locale;
	
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}	
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getSmallPrimaryImageUrl() {
		return smallPrimaryImageUrl;
	}
	public void setSmallPrimaryImageUrl(String smallPrimaryImageUrl) {
		this.smallPrimaryImageUrl = smallPrimaryImageUrl;
	}
	public String getMediumPrimaryImageUrl() {
		return mediumPrimaryImageUrl;
	}
	public void setMediumPrimaryImageUrl(String mediumPrimaryImageUrl) {
		this.mediumPrimaryImageUrl = mediumPrimaryImageUrl;
	}
	public String getThumbnailPrimaryImageUrl() {
		return thumbnailPrimaryImageUrl;
	}
	public void setThumbnailPrimaryImageUrl(String thumbnailPrimaryImageUrl) {
		this.thumbnailPrimaryImageUrl = thumbnailPrimaryImageUrl;
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
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getShortHeadline() {
		return shortHeadline;
	}
	public void setShortHeadline(String shortHeadline) {
		this.shortHeadline = shortHeadline;
	}
	public String getNewsKeywords() {
		return newsKeywords;
	}
	public void setNewsKeywords(String newsKeywords) {
		this.newsKeywords = newsKeywords;
	}
	public String getSeoSlug() {
		return seoSlug;
	}
	public void setSeoSlug(String seoSlug) {
		this.seoSlug = seoSlug;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public List<ArticleTextEditor> getArticleTextEditors() {
		return articleTextEditors;
	}
	public void setArticleTextEditors(List<ArticleTextEditor> articleTextEditors) {
		this.articleTextEditors = articleTextEditors;
	}
	public StoryGeographicLocation getStoryGeographicLocation() {
		return storyGeographicLocation;
	}
	public void setStoryGeographicLocation(StoryGeographicLocation storyGeographicLocation) {
		this.storyGeographicLocation = storyGeographicLocation;
	}
	public String getAbnStoryId() {
		return abnStoryId;
	}
	public void setAbnStoryId(String abnStoryId) {
		this.abnStoryId = abnStoryId;
	}
	public StrapiCategory getPrimaryCategory() {
		return primaryCategory;
	}
	public void setPrimaryCategory(StrapiCategory primaryCategory) {
		this.primaryCategory = primaryCategory;
	}
	public StrapiSubCategory getPrimarySubCategory() {
		return primarySubCategory;
	}
	public void setPrimarySubCategory(StrapiSubCategory primarySubCategory) {
		this.primarySubCategory = primarySubCategory;
	}
	public List<StrapiCategory> getSecondaryCategories() {
		return secondaryCategories;
	}
	public void setSecondaryCategories(List<StrapiCategory> secondaryCategories) {
		this.secondaryCategories = secondaryCategories;
	}
	public List<StrapiSubCategory> getSecondarySubCategories() {
		return secondarySubCategories;
	}
	public void setSecondarySubCategories(List<StrapiSubCategory> secondarySubCategories) {
		this.secondarySubCategories = secondarySubCategories;
	}
	public String getLargePrimaryImageUrl() {
		return largePrimaryImageUrl;
	}
	public void setLargePrimaryImageUrl(String largePrimaryImageUrl) {
		this.largePrimaryImageUrl = largePrimaryImageUrl;
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
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public List<StrapiTag> getTags() {
		return tags;
	}
	public void setTags(List<StrapiTag> tags) {
		this.tags = tags;
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
	public List<StrapiArticle> getArticles() {
		return articles;
	}
	public void setArticles(List<StrapiArticle> articles) {
		this.articles = articles;
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public boolean isHideAuthorName() {
		return hideAuthorName;
	}
	public void setHideAuthorName(boolean hideAuthorName) {
		this.hideAuthorName = hideAuthorName;
	}


	
	
	
}
