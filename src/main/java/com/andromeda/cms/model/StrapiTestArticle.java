package com.andromeda.cms.model;

import java.sql.Timestamp;

import com.andromeda.commons.model.BaseModel;

public class StrapiTestArticle extends BaseModel
{
	private int id;
	private String heading;
	private String url;
	private String author;
	private String content;
	private Timestamp publishedAt;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getHeading()
	{
		return heading;
	}

	public void setHeading(String heading)
	{
		this.heading = heading;
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public Timestamp getPublishedAt()
	{
		return publishedAt;
	}

	public void setPublishedAt(Timestamp publishedAt)
	{
		this.publishedAt = publishedAt;
	}

}
