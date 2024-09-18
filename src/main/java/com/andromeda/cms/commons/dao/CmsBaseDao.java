
package com.andromeda.cms.commons.dao;

import java.util.HashMap;
import java.util.Map;

import com.andromeda.commons.dao.BaseDAO;

/**
 *
 * @author Prakash K
 * @date 2020-04-19
 *
 */
abstract public class CmsBaseDao extends BaseDAO
{
	protected Map<String, String> partitionTableNames;

	abstract public String getTableName();

	/**
	 * Default implementation
	 * 
	 * @return
	 */
	public String getMasterTable()
	{
		return null;
	}

	/**
	 * Default implementation
	 * 
	 * @return
	 */
	public String getUniqueColumn()
	{
		return null;
	}

	/**
	 * Default implementation
	 * 
	 * @return
	 */
	public String getPartitionIdColumn()
	{
		return null;
	}

	public String getIndexColumn1()
	{
		return null;
	}

	public String getIndexColumn2()
	{
		return null;
	}

	public String getIndexColumn3()
	{
		return null;
	}
	
		
	protected String getPartitionTableNameFromDatabase(int partitionIdValue)
	{
		System.out.println("=====>getPartitionTableNameFromDatabase(): Called");
		Map<String, Object> params = new HashMap<>();
		params.put("masterTableName", getMasterTable());
		params.put("uniqueColumn", getUniqueColumn());
		params.put("partitionIdColumn", getPartitionIdColumn());
		params.put("partitionIdValue", partitionIdValue);
		params.put("indexColumn1", getIndexColumn1());
		params.put("indexColumn2", getIndexColumn2());
		params.put("indexColumn3", getIndexColumn3());
		return sqlSessionTemplate
				.selectOne("com.andromeda.cms.commons.model.CommonQueries.GetTableName", params);
	}

	public String getPartitionTableName(int publishedYear)
	{
		if (partitionTableNames == null)
		{
			partitionTableNames = new HashMap<>();
		}

		String tableName = partitionTableNames.get("" + publishedYear);
		if (tableName == null)
		{
			tableName = getPartitionTableNameFromDatabase(publishedYear);
			partitionTableNames.put("" + publishedYear, tableName);
		}

		return tableName;
	}
}
