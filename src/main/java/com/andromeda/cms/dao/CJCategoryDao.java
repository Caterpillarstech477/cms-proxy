package com.andromeda.cms.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.andromeda.cms.model.CJCategory;
import com.andromeda.commons.dao.BaseDAO;

public class CJCategoryDao extends BaseDAO{
	public List<CJCategory> getAll() 
	{
		return sqlSessionTemplate.selectList("com.andromeda.cms.model.CJCategory.GetAll");
	}

	public int add(CJCategory CJCategory) 
	{
		Map<String, Object> params = new HashMap<>();
		params.put("p", CJCategory);
		return sqlSessionTemplate.insert("com.andromeda.cms.model.CJCategory.Add", params);
	}
	
	public CJCategory getById(int id)
	{
		Map<String, Object> params = new HashMap<>();
		params.put("id", id);
		return sqlSessionTemplate.selectOne("com.andromeda.cms.model.CJCategory.GetById", params);
	}
	
	public CJCategory getByName(String name)
	{
		Map<String, Object> params = new HashMap<>();
		params.put("name", name);
		return sqlSessionTemplate.selectOne("com.andromeda.cms.model.CJCategory.GetByName", params);
	}

	public int update(CJCategory sitemapCategory) {
		Map<String, Object> params = new HashMap<>();
		params.put("p", sitemapCategory);
		return sqlSessionTemplate.update("com.andromeda.cms.model.CJCategory.Update", params);
		
	}
}
