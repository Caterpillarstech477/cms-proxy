package com.andromeda.cms.model;

import java.util.List;

import com.andromeda.commons.model.BaseModel;

public class ArticleTextEditor extends BaseModel
{
	private int id;
	private String articleText;
	private StrapiImage contentImage;
	private String videoType;
	private String videoUrl;
	private String imageType;
	private String imageUrl;
	private String imageDescription;
	private List<StrapiArticle> articles;
	private DocumentUpload documentUpload;
	
	public String getArticleText() {
		return articleText;
	}
	public void setArticleText(String articleText) {
		this.articleText = articleText;
	}
	public StrapiImage getContentImage() {
		return contentImage;
	}
	public void setContentImage(StrapiImage contentImage) {
		this.contentImage = contentImage;
	}
	public String getVideoType() {
		return videoType;
	}
	public void setVideoType(String videoType) {
		this.videoType = videoType;
	}
	public String getVideoUrl() {
		return videoUrl;
	}
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	public List<StrapiArticle> getArticles() {
		return articles;
	}
	public void setArticles(List<StrapiArticle> articles) {
		this.articles = articles;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public DocumentUpload getDocumentUpload() {
		return documentUpload;
	}
	public void setDocumentUpload(DocumentUpload documentUpload) {
		this.documentUpload = documentUpload;
	}
	public String getImageType() {
		return imageType;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getImageDescription() {
		return imageDescription;
	}
	public void setImageDescription(String imageDescription) {
		this.imageDescription = imageDescription;
	}
	

}
