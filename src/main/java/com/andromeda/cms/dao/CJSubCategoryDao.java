package com.andromeda.cms.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.andromeda.cms.model.CJSubCategory;
import com.andromeda.commons.dao.BaseDAO;

public class CJSubCategoryDao extends BaseDAO{
	public List<CJSubCategory> getAll() 
	{
		return sqlSessionTemplate.selectList("com.andromeda.cms.model.CJSubCategory.GetAll");
	}

	public int add(CJSubCategory CJSubCategory) 
	{
		Map<String, Object> params = new HashMap<>();
		params.put("p", CJSubCategory);
		return sqlSessionTemplate.insert("com.andromeda.cms.model.CJSubCategory.Add", params);
	}
	
	public int update(CJSubCategory CJSubCategory) 
	{
		Map<String, Object> params = new HashMap<>();
		params.put("p", CJSubCategory);
		return sqlSessionTemplate.insert("com.andromeda.cms.model.CJSubCategory.Update", params);
	}
	
	public CJSubCategory getById(int id)
	{
		Map<String, Object> params = new HashMap<>();
		params.put("id", id);
		return sqlSessionTemplate.selectOne("com.andromeda.cms.model.CJSubCategory.GetById", params);
	}
}
