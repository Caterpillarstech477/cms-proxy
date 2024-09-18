package com.andromeda.cms.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.andromeda.cms.model.Cartoon;
import com.andromeda.cms.model.Horoscope;
import com.andromeda.commons.dao.BaseDAO;

public class HoroscopeDao extends BaseDAO
{
	public List<Horoscope> getAll() 
	{
		return sqlSessionTemplate.selectList("com.andromeda.cms.model.Horoscope.GetAll");
	}
	
	public int add(Horoscope horoscope) 
	{
		Map<String, Object> params = new HashMap<>();
		params.put("p", horoscope);
		return sqlSessionTemplate.insert("com.andromeda.cms.model.Horoscope.Add", params);
	}
	
	public List<Horoscope> getLatestHoroscopes(Integer limit)
	{
		Map<String, Object> params = new HashMap<>();
		params.put("limit", limit);
		return sqlSessionTemplate.selectList("com.andromeda.cms.model.Horoscope.GetLatestByType", params);
	}
	
	
	public Horoscope getById(int id) 
	{
		Map<String, Object> params = new HashMap<>();
		params.put("horoscopeId", id);
		return sqlSessionTemplate.selectOne("com.andromeda.cms.model.Horoscope.GetById", params);
	}
	
	public Cartoon getByType(String type) 
	{
		Map<String, Object> params = new HashMap<>();
		params.put("type", type);
		return sqlSessionTemplate.selectOne("com.andromeda.cms.model.Horoscope.GetType", params);
	}

	public Horoscope getByIdWOPublished(int id) {
		Map<String, Object> params = new HashMap<>();
		params.put("id", id);
		return sqlSessionTemplate.selectOne("com.andromeda.cms.model.Horoscope.GetByIdWOPublished", params);

	}

	public void update(Horoscope horoscope) {
		Map<String, Object> params = new HashMap<>();
		params.put("p", horoscope);
		sqlSessionTemplate.update("com.andromeda.cms.model.Horoscope.Update", params);
		
	}
	
}
