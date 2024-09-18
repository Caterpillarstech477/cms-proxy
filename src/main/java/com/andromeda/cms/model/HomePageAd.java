package com.andromeda.cms.model;

import java.sql.Timestamp;

import com.andromeda.commons.model.BaseModel;

public class HomePageAd extends BaseModel {
	int id;
	String adUrl;
	int timer;
	String htmlCode;
	Timestamp createdAt;
	String publishedAtSm;
	Timestamp publishedAt;
	Timestamp updatedAt;
	String updatedAtSm;
	String locale;
	boolean enableHomepageAd;
	StrapiImage adImage;
	boolean published;

	
	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean published) {
		this.published = published;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdUrl() {
		return adUrl;
	}

	public void setAdUrl(String adUrl) {
		this.adUrl = adUrl;
	}

	public int getTimer() {
		return timer;
	}

	public void setTimer(int timer) {
		this.timer = timer;
	}

	public String getHtmlCode() {
		return htmlCode;
	}

	public void setHtmlCode(String htmlCode) {
		this.htmlCode = htmlCode;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getPublishedAt() {
		return publishedAt;
	}

	public void setPublishedAt(Timestamp publishedAt) {
		this.publishedAt = publishedAt;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public boolean isEnableHomepageAd() {
		return enableHomepageAd;
	}

	public void setEnableHomepageAd(boolean enableHomepageAd) {
		this.enableHomepageAd = enableHomepageAd;
	}

	public StrapiImage getAdImage() {
		return adImage;
	}

	public void setAdImage(StrapiImage adImage) {
		this.adImage = adImage;
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

}
