package com.andromeda.cms.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.andromeda.cms.model.Cartoon;
import com.andromeda.commons.dao.BaseDAO;

public class CartoonDao extends BaseDAO
{
	public List<Cartoon> getAll() 
	{
		return sqlSessionTemplate.selectList("com.andromeda.cms.model.Cartoon.GetAll");
	}
	
	public int add(Cartoon sitemapCartoon) 
	{
		Map<String, Object> params = new HashMap<>();
		params.put("p", sitemapCartoon);
		return sqlSessionTemplate.insert("com.andromeda.cms.model.Cartoon.Add", params);
	}
	
	public int update(Cartoon sitemapCartoon) 
	{
		Map<String, Object> params = new HashMap<>();
		params.put("p", sitemapCartoon);
		return sqlSessionTemplate.insert("com.andromeda.cms.model.Cartoon.Update", params);
	}
	
	public List<Cartoon> getLatestCartoons(Integer limit, Integer offset)
	{
		Map<String, Object> params = new HashMap<>();
		params.put("limit", limit);
		params.put("offset", offset);
		return sqlSessionTemplate.selectList("com.andromeda.cms.model.Cartoon.GetLatestCartoons", params);
	}
	
	public List<Cartoon> getLatestCartoonsOnCreated(Integer limit, Integer offset)
	{
		Map<String, Object> params = new HashMap<>();
		params.put("limit", limit);
		params.put("offset", offset);
		return sqlSessionTemplate.selectList("com.andromeda.cms.model.Cartoon.GetLatestCartoonsOnCreated", params);
	}
	
	public Cartoon getById(int id) 
	{
		Map<String, Object> params = new HashMap<>();
		params.put("id", id);
		return sqlSessionTemplate.selectOne("com.andromeda.cms.model.Cartoon.GetById", params);
	}
	
	public Cartoon getByCartoonId(String cartoonId) 
	{
		Map<String, Object> params = new HashMap<>();
		params.put("cartoonId", cartoonId);
		return sqlSessionTemplate.selectOne("com.andromeda.cms.model.Cartoon.GetByCartoonId", params);
	}
	
	public List<Cartoon> getCartoonsBtwDates(String fromDateStr, String toDateStr)
	{
		Map<String, Object> params = new HashMap<>();
		params.put("fromDateStr", fromDateStr);
		params.put("toDateStr", toDateStr);
		return sqlSessionTemplate.selectOne("com.andromeda.cms.model.Cartoon.GetCartoonsBtwDates", params);
	}


	public Cartoon getByIdWOPublished(int id) {
		Map<String, Object> params = new HashMap<>();
		params.put("id", id);
		return sqlSessionTemplate.selectOne("com.andromeda.cms.model.Cartoon.GetByIdWOPublished", params);
	}
	
	
	
}
