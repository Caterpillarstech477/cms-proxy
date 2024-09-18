package com.andromeda.cms.model;

import com.andromeda.commons.model.BaseModel;

/**
 * 
 * @author Prakash K
 * @date 2020-10-04
 *
 */
public class UrlPattern extends BaseModel
{
	private String pattern;
	private long min;
	private long max;

	public UrlPattern(String pattern, long min, long max)
	{
		super();
		this.pattern = pattern;
		this.min = min;
		this.max = max;
	}

	public String getPattern()
	{
		return pattern;
	}

	public void setPattern(String pattern)
	{
		this.pattern = pattern;
	}

	public long getMin()
	{
		return min;
	}

	public void setMin(long min)
	{
		this.min = min;
	}

	public long getMax()
	{
		return max;
	}

	public void setMax(long max)
	{
		this.max = max;
	}
}
