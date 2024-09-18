package com.andromeda.cms.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.andromeda.cms.model.SubCategory;
import com.andromeda.commons.dao.BaseDAO;

public class SubCategoryDao extends BaseDAO
{
	public List<SubCategory> getAll() 
	{
		return sqlSessionTemplate.selectList("com.andromeda.cms.model.SubCategory.GetAll");
	}

	public int add(SubCategory sitemapSubCategory) 
	{
		Map<String, Object> params = new HashMap<>();
		params.put("p", sitemapSubCategory);
		return sqlSessionTemplate.insert("com.andromeda.cms.model.SubCategory.Add", params);
	}
	
	public int update(SubCategory sitemapSubCategory) 
	{
		Map<String, Object> params = new HashMap<>();
		params.put("p", sitemapSubCategory);
		return sqlSessionTemplate.insert("com.andromeda.cms.model.SubCategory.Update", params);
	}
	
	public SubCategory getById(int id)
	{
		Map<String, Object> params = new HashMap<>();
		params.put("id", id);
		return sqlSessionTemplate.selectOne("com.andromeda.cms.model.SubCategory.GetById", params);
	}
}
