package com.andromeda.cms.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.andromeda.cms.model.Category;
import com.andromeda.commons.dao.BaseDAO;

public class CategoryDao extends BaseDAO
{
	public List<Category> getAll() 
	{
		return sqlSessionTemplate.selectList("com.andromeda.cms.model.Category.GetAll");
	}

	public int add(Category sitemapCategory) 
	{
		Map<String, Object> params = new HashMap<>();
		params.put("p", sitemapCategory);
		return sqlSessionTemplate.insert("com.andromeda.cms.model.Category.Add", params);
	}
	
	public Category getById(int id)
	{
		Map<String, Object> params = new HashMap<>();
		params.put("id", id);
		return sqlSessionTemplate.selectOne("com.andromeda.cms.model.Category.GetById", params);
	}
	
	public Category getByName(String name)
	{
		Map<String, Object> params = new HashMap<>();
		params.put("name", name);
		return sqlSessionTemplate.selectOne("com.andromeda.cms.model.Category.GetByName", params);
	}

	public int update(Category sitemapCategory) {
		Map<String, Object> params = new HashMap<>();
		params.put("p", sitemapCategory);
		return sqlSessionTemplate.update("com.andromeda.cms.model.Category.Update", params);
		
	}
}
