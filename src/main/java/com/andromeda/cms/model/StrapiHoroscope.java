package com.andromeda.cms.model;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.andromeda.commons.model.BaseModel;

public class StrapiHoroscope extends BaseModel
{
	private int id;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Timestamp publishedAt;
	private String horoscopeId;
	private String title;
	private String englishTitle;
	private List<StrapiTag> tags;
	private String horoscopeType;
	private String keywords;
	private String locale;
	private String meshamAries;
	private String vrushabamTaurus;
	private String mithunamGemini;
	private String karkatakamCancer;
	private String simhaLeo;
	private String kanyaVirgo;
	private String tulaLibra;
	private String vruschikamScorpio;
	private String dhanassuSagittarius;
	private String makaramCapricorn;
	private String kumbhamAquarius;
	private String meenamPisces;
	private String panchangam;
	private Date startDate;
	private Date endDate;
	private String source;
	private StrapiCategory category;
	private Boolean published;
	private String publishedAtSm;
	private String updatedAtSm;
	private boolean deleted;
	
	
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
	public Timestamp getPublishedAt() {
		return publishedAt;
	}
	public void setPublishedAt(Timestamp publishedAt) {
		this.publishedAt = publishedAt;
	}
	public String getHoroscopeId() {
		return horoscopeId;
	}
	public void setHoroscopeId(String horoscopeId) {
		this.horoscopeId = horoscopeId;
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
	public List<StrapiTag> getTags() {
		return tags;
	}
	public void setTags(List<StrapiTag> tags) {
		this.tags = tags;
	}
	public String getHoroscopeType() {
		return horoscopeType;
	}
	public void setHoroscopeType(String horoscopeType) {
		this.horoscopeType = horoscopeType;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public String getMeshamAries() {
		return meshamAries;
	}
	public void setMeshamAries(String meshamAries) {
		this.meshamAries = meshamAries;
	}
	public String getVrushabamTaurus() {
		return vrushabamTaurus;
	}
	public void setVrushabamTaurus(String vrushabamTaurus) {
		this.vrushabamTaurus = vrushabamTaurus;
	}
	public String getMithunamGemini() {
		return mithunamGemini;
	}
	public void setMithunamGemini(String mithunamGemini) {
		this.mithunamGemini = mithunamGemini;
	}
	public String getKarkatakamCancer() {
		return karkatakamCancer;
	}
	public void setKarkatakamCancer(String karkatakamCancer) {
		this.karkatakamCancer = karkatakamCancer;
	}
	public String getSimhaLeo() {
		return simhaLeo;
	}
	public void setSimhaLeo(String simhaLeo) {
		this.simhaLeo = simhaLeo;
	}
	public String getKanyaVirgo() {
		return kanyaVirgo;
	}
	public void setKanyaVirgo(String kanyaVirgo) {
		this.kanyaVirgo = kanyaVirgo;
	}
	public String getTulaLibra() {
		return tulaLibra;
	}
	public void setTulaLibra(String tulaLibra) {
		this.tulaLibra = tulaLibra;
	}
	public String getVruschikamScorpio() {
		return vruschikamScorpio;
	}
	public void setVruschikamScorpio(String vruschikamScorpio) {
		this.vruschikamScorpio = vruschikamScorpio;
	}
	public String getDhanassuSagittarius() {
		return dhanassuSagittarius;
	}
	public void setDhanassuSagittarius(String dhanassuSagittarius) {
		this.dhanassuSagittarius = dhanassuSagittarius;
	}
	public String getMakaramCapricorn() {
		return makaramCapricorn;
	}
	public void setMakaramCapricorn(String makaramCapricorn) {
		this.makaramCapricorn = makaramCapricorn;
	}
	public String getKumbhamAquarius() {
		return kumbhamAquarius;
	}
	public void setKumbhamAquarius(String kumbhamAquarius) {
		this.kumbhamAquarius = kumbhamAquarius;
	}
	public String getMeenamPisces() {
		return meenamPisces;
	}
	public void setMeenamPisces(String meenamPisces) {
		this.meenamPisces = meenamPisces;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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
	public String getPanchangam() {
		return panchangam;
	}
	public void setPanchangam(String panchangam) {
		this.panchangam = panchangam;
	}
	
}
