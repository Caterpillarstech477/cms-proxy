package com.andromeda.cms.model;

import java.sql.Timestamp;
import java.util.HashMap;

import com.andromeda.commons.model.BaseModel;

public class ElectionVote extends BaseModel {
	private int id;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Timestamp publishedAt;
	int roundsCompleted;
	HashMap<String, Integer> votes;
	boolean published;
	String publishedAtSm;
	String updatedAtSm;

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

	public int getRoundsCompleted() {
		return roundsCompleted;
	}

	public void setRoundsCompleted(int roundsCompleted) {
		this.roundsCompleted = roundsCompleted;
	}

	public HashMap<String, Integer> getVotes() {
		return votes;
	}

	public void setVotes(HashMap<String, Integer> votes) {
		this.votes = votes;
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
