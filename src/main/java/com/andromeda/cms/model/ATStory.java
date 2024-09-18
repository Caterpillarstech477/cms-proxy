package com.andromeda.cms.model;

public class ATStory
{
	private int storyId;
	private String englishTitle;
	private int superCategoryId;
	private int subCategoryId;
	private int categoryId;

	public int getStoryId()
	{
		return storyId;
	}

	public void setStoryId(int storyId)
	{
		this.storyId = storyId;
	}

	public String getEnglishTitle()
	{
		return englishTitle;
	}

	public void setEnglishTitle(String englishTitle)
	{
		this.englishTitle = englishTitle;
	}

	public int getSuperCategoryId()
	{
		return superCategoryId;
	}

	public void setSuperCategoryId(int superCategoryId)
	{
		this.superCategoryId = superCategoryId;
	}

	public int getSubCategoryId()
	{
		return subCategoryId;
	}

	public void setSubCategoryId(int subCategoryId)
	{
		this.subCategoryId = subCategoryId;
	}

	public int getCategoryId()
	{
		return categoryId;
	}

	public void setCategoryId(int categoryId)
	{
		this.categoryId = categoryId;
	}

}
