package com.andromeda.cms.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.andromeda.cms.commons.dao.CmsBaseDao;
import com.andromeda.cms.model.RedirectionUrl;

public class RedirectionUrlDao extends CmsBaseDao
{
	private static String MASTER_TABLE = "cms_proxy.redirection_urls";
	private static String PARTITION_ID_COLUMN = "year";
	private static String INDEX_COLUMN_1 = "id";
	
	@Override
	public String getTableName()
	{
		return MASTER_TABLE;
	}

	@Override
	public String getMasterTable()
	{
		return MASTER_TABLE;
	}
	
	@Override
	public String getPartitionIdColumn()
	{
		return PARTITION_ID_COLUMN;
	}

	@Override
	public String getIndexColumn1()
	{
		return INDEX_COLUMN_1;
	}
	
	public void add(RedirectionUrl redirectionUrl)
	{
		int year = redirectionUrl.getYear();
		String tableName = getPartitionTableName(year);
		System.out.println("tableName: " + tableName);
		Map<String, Object> params = new HashMap<>();
		params.put("tableName", tableName);
		params.put("p", redirectionUrl);
		sqlSessionTemplate.insert("com.andromeda.cms.model.RedirectionUrl.Add", params);
	}
	
	public List<RedirectionUrl> getById(int id) {
		Map<String, Object> params = new HashMap<>();
		params.put("id", id);
		return sqlSessionTemplate.selectList("com.andromeda.cms.model.RedirectionUrl.GetById", params);
	}
}
