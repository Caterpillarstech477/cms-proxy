package com.andromeda.cms.model;

import java.util.HashMap;
import java.util.List;

import com.andromeda.cms.model.StrapiResponse.StrapiMetadata;
import com.andromeda.commons.model.BaseModel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author Chaithanya V
 * @date 04-Jul-2022
 *
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class StrapiResponseArray extends BaseModel
{
	@JsonProperty("data")
	public List<StrapiResponse.Entry> entries;
	@JsonProperty("meta")
	public StrapiMetadata strapiMeta;

	public List<StrapiResponse.Entry> getEntries() {
		return entries;
	}

	public void setEntries(List<StrapiResponse.Entry> entries) {
		this.entries = entries;
	}

	public StrapiMetadata getStrapiMeta() {
		return strapiMeta;
	}

	public void setStrapiMeta(StrapiMetadata strapiMeta) {
		this.strapiMeta = strapiMeta;
	}

	

	/*@JsonIgnoreProperties(ignoreUnknown = true)
	public	static class StrapiMetadata
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

	}*/
}
