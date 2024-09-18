package com.andromeda.cms.model;

import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class StrapiResponse {
	@JsonProperty("data")
	public Entry entry;
	@JsonProperty("meta")
	public StrapiMetadata strapiMeta;

	public Entry getEntry() {
		return entry;
	}

	public void setEntry(Entry entry) {
		this.entry = entry;
	}

	public StrapiMetadata getStrapiMeta() {
		return strapiMeta;
	}

	public void setStrapiMeta(StrapiMetadata strapiMeta) {
		this.strapiMeta = strapiMeta;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Entry
	{
		private Integer id;
		private HashMap<String, Object> attributes;

		public Integer getId()
		{
			return id;
		}

		public void setId(Integer id)
		{
			this.id = id;
		}

		public HashMap<String, Object> getAttributes()
		{
			return attributes;
		}

		public void setAttributes(HashMap<String, Object> attributes)
		{
			this.attributes = attributes;
		}

	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class StrapiMetadata
	{
		private HashMap<String, String> meta;

		public HashMap<String, String> getMeta()
		{
			return meta;
		}

		public void setMeta(HashMap<String, String> meta)
		{
			this.meta = meta;
		}

	}
}
