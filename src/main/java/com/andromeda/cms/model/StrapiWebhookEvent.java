package com.andromeda.cms.model;

import java.sql.Timestamp;
import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StrapiWebhookEvent
{
	@JsonProperty("event")
	private String event;
	
	@JsonProperty("createdAt")
	private Timestamp createdAt;
	
	@JsonProperty("model")
	private String model;
	
	@JsonProperty("entry")
	private HashMap<String, Object> entry;

	public String getEvent()
	{
		return event;
	}

	public void setEvent(String event)
	{
		this.event = event;
	}

	public Timestamp getCreatedAt()
	{
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt)
	{
		this.createdAt = createdAt;
	}

	
	public HashMap<String, Object> getEntry() {
		return entry;
	}

	public void setEntry(HashMap<String, Object> entry) {
		this.entry = entry;
	}

	public String getModel()
	{
		return model;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	
}
