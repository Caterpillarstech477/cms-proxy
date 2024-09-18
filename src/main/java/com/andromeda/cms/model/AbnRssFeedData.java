package com.andromeda.cms.model;

import java.sql.Timestamp;
import java.util.List;

import com.andromeda.commons.model.BaseModel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AbnRssFeedData extends BaseModel
{
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class AbnRssFeed
	{
		private String title;
		private String link;
		private String description;
		private String content;
		private String thumbImage;
		private String guid;
		private Timestamp pubDate;
		private String status;
		public String getTitle()
		{
			return title;
		}
		public void setTitle(String title)
		{
			this.title = title;
		}
		public String getLink()
		{
			return link;
		}
		public void setLink(String link)
		{
			this.link = link;
		}
		public String getDescription()
		{
			return description;
		}
		public void setDescription(String description)
		{
			this.description = description;
		}
		public String getContent()
		{
			return content;
		}
		public void setContent(String content)
		{
			this.content = content;
		}
		public String getThumbImage()
		{
			return thumbImage;
		}
		public void setThumbImage(String thumbImage)
		{
			this.thumbImage = thumbImage;
		}
		public String getGuid()
		{
			return guid;
		}
		public void setGuid(String guid)
		{
			this.guid = guid;
		}
		public Timestamp getPubDate()
		{
			return pubDate;
		}
		public void setPubDate(Timestamp pubDate)
		{
			this.pubDate = pubDate;
		}
		public String getStatus()
		{
			return status;
		}
		public void setStatus(String status)
		{
			this.status = status;
		}
		
	}
	
	@JsonProperty("channel")
	private List<AbnRssFeed> abnRssFeeds;
}
