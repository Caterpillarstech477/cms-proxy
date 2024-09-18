package com.andromeda.cms.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.andromeda.cms.commons.dao.CmsBaseDao;
import com.andromeda.cms.defs.StrapiConstants;
import com.andromeda.cms.model.CJPhotoGallery;

public class CJPhotoGalleryDao extends CmsBaseDao
{
	private static String MASTER_TABLE = "cms_proxy.cj_photoGallery";
	private static String PARTITION_ID_COLUMN = "publishedYear";
	private static String UNIQUE_COLUMN = "id";
	private static String INDEX_COLUMN_1 = "publishedAt";
	private static String INDEX_COLUMN_2 = "primaryCategoryId";
	private static String INDEX_COLUMN_3 = "primarySubCategoryId";

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
	public String getUniqueColumn()
	{
		return UNIQUE_COLUMN;
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
	
	@Override
	public String getIndexColumn2()
	{
		return INDEX_COLUMN_2;
	}
	
	@Override
	public String getIndexColumn3()
	{
		return INDEX_COLUMN_3;
	}
	
	public List<CJPhotoGallery> getLatestBySubCategoryIdOnCreated(int categoryId, int subCategoryId, Integer limit, Integer offset) {
		if(subCategoryId != 0)
		{
			Map<String, Object> params = new HashMap<>();
			params.put("categoryId", categoryId);
			params.put("subCategoryId", subCategoryId);
			params.put("limit", limit);
			params.put("offset", offset);
			return sqlSessionTemplate.selectList("com.andromeda.cms.model.CJPhotoGallery.GetLatestBySubCategoryIdOnCreated", params);
		}
		else
		{
			return null;
		}
	}

	public List<CJPhotoGallery> getLatestBySubCategoryId(int categoryId, int subCategoryId, Integer limit, Integer offset) {
		if(subCategoryId != 0)
		{
			Map<String, Object> params = new HashMap<>();
			params.put("categoryId", categoryId);
			params.put("subCategoryId", subCategoryId);
			params.put("limit", limit);
			params.put("offset", offset);
			return sqlSessionTemplate.selectList("com.andromeda.cms.model.CJPhotoGallery.GetLatestBySubCategoryId", params);
		}
		else
		{
			return null;
		}
	}
	
	
	public List<CJPhotoGallery> getLatestByCategoryIdOnCreated(int categoryId, Integer limit, Integer offset) 
	{
		if(categoryId != 0)
		{
			List<CJPhotoGallery> latestPhotos = new ArrayList<>();
			Map<String, Object> params = new HashMap<>();
			params.put("limit", StrapiConstants.PRIORITY_LIMIT);
			params.put("categoryId", categoryId);
			List<CJPhotoGallery> latestInPriority =  sqlSessionTemplate.selectList("com.andromeda.cms.model.CJPhotoGallery.GetLatestPhotosInPriorityOnCreated", params);
			
			latestPhotos.addAll(latestInPriority);
			
			List<Integer> latestInPriorityIds = new ArrayList<>();
			if(latestInPriority != null)
			{
				for (CJPhotoGallery photoGallery : latestInPriority) {
					latestInPriorityIds.add(photoGallery.getId());
				}	
			}
			
			params.put("limit", limit);
			params.put("offset", offset);
			if(latestInPriorityIds.size() > 0)
				params.put("latestInPriorityIds", latestInPriorityIds);
			else
				params.put("latestInPriorityIds", null);
			List<CJPhotoGallery> latestOTPriority = sqlSessionTemplate.selectList("com.andromeda.cms.model.CJPhotoGallery.GetLatestByCategoryIdOnCreated", params);
			
			latestPhotos.addAll(latestOTPriority);
			return latestPhotos;
			
		}
		return null;
	}
	
	public List<CJPhotoGallery> getLatestByCategoryId(int categoryId, Integer limit, Integer offset) 
	{
		if(categoryId != 0)
		{
			List<CJPhotoGallery> latestPhotos = new ArrayList<>();
			Map<String, Object> params = new HashMap<>();
			params.put("limit", StrapiConstants.PRIORITY_LIMIT);
			params.put("categoryId", categoryId);
			List<CJPhotoGallery> latestInPriority =  sqlSessionTemplate.selectList("com.andromeda.cms.model.CJPhotoGallery.GetLatestPhotosInPriority", params);
			
			latestPhotos.addAll(latestInPriority);
			
			List<Integer> latestInPriorityIds = new ArrayList<>();
			if(latestInPriority != null)
			{
				for (CJPhotoGallery photoGallery : latestInPriority) {
					latestInPriorityIds.add(photoGallery.getId());
				}	
			}
			
			params.put("limit", limit);
			params.put("offset", offset);
			if(latestInPriorityIds.size() > 0)
				params.put("latestInPriorityIds", latestInPriorityIds);
			else
				params.put("latestInPriorityIds", null);
			List<CJPhotoGallery> latestOTPriority = sqlSessionTemplate.selectList("com.andromeda.cms.model.CJPhotoGallery.GetLatestByCategoryId", params);
			
			latestPhotos.addAll(latestOTPriority);
			return latestPhotos;
			
		}
		return null;
	}
	

	
	public List<CJPhotoGallery> getLatestPhotos(Integer limit)
	{
		List<CJPhotoGallery> latestPhotos = new ArrayList<>();
		Map<String, Object> params = new HashMap<>();
		params.put("limit", StrapiConstants.PRIORITY_LIMIT);
		List<CJPhotoGallery> latestInPriority =  sqlSessionTemplate.selectList("com.andromeda.cms.model.CJPhotoGallery.GetLatestPhotosInPriority", params);
		
		List<Integer> latestInPriorityIds = new ArrayList<>();
		if(latestInPriority != null)
		{
			for (CJPhotoGallery photo : latestInPriority) {
				latestInPriorityIds.add(photo.getId());
			}	
		}
		
		latestPhotos.addAll(latestInPriority);
		
		params.put("limit", limit);
		if(latestInPriorityIds.size() > 0)
			params.put("latestInPriorityIds", latestInPriorityIds);
		else
			params.put("latestInPriorityIds", null);
		List<CJPhotoGallery> latestOTPriority = sqlSessionTemplate.selectList("com.andromeda.cms.model.CJPhotoGallery.GetLatestPhotos", params);
		
		latestPhotos.addAll(latestOTPriority);
		return latestPhotos;
		
	}
	
	public List<CJPhotoGallery> getLatestPhotosOnCreated(Integer limit)
	{
		List<CJPhotoGallery> latestPhotos = new ArrayList<>();
		Map<String, Object> params = new HashMap<>();
		params.put("limit", StrapiConstants.PRIORITY_LIMIT);
		List<CJPhotoGallery> latestInPriority =  sqlSessionTemplate.selectList("com.andromeda.cms.model.CJPhotoGallery.GetLatestPhotosInPriorityOnCreated", params);
		
		List<Integer> latestInPriorityIds = new ArrayList<>();
		if(latestInPriority != null)
		{
			for (CJPhotoGallery photo : latestInPriority) {
				latestInPriorityIds.add(photo.getId());
			}	
		}
		
		latestPhotos.addAll(latestInPriority);
		
		params.put("limit", limit);
		if(latestInPriorityIds.size() > 0)
			params.put("latestInPriorityIds", latestInPriorityIds);
		else
			params.put("latestInPriorityIds", null);
		List<CJPhotoGallery> latestOTPriority = sqlSessionTemplate.selectList("com.andromeda.cms.model.CJPhotoGallery.GetLatestPhotosOnCreated", params);
		
		latestPhotos.addAll(latestOTPriority);
		return latestPhotos;
		
	}
	
	
	public CJPhotoGallery getByIdWOPublished(int id) {
		Map<String, Object> params = new HashMap<>();
		params.put("id", id);
		return sqlSessionTemplate.selectOne("com.andromeda.cms.model.CJPhotoGallery.GetByIdWOPublished", params);
	}
	
	public CJPhotoGallery getById(int id) {
		Map<String, Object> params = new HashMap<>();
		params.put("id", id);
		return sqlSessionTemplate.selectOne("com.andromeda.cms.model.CJPhotoGallery.GetById", params);
	}

	public void add(CJPhotoGallery photoGallery) {
		int publishedYear = photoGallery.getPublishedYear();
		String tableName = getPartitionTableName(publishedYear);
		System.out.println("tableName: " + tableName);
		Map<String, Object> params = new HashMap<>();
		params.put("tableName", tableName);
		params.put("p", photoGallery);
		sqlSessionTemplate.insert("com.andromeda.cms.model.CJPhotoGallery.Add", params);
		
	}

	public void update(CJPhotoGallery photoGallery) {
		Map<String, Object> params = new HashMap<>();
		params.put("p", photoGallery);
		sqlSessionTemplate.update("com.andromeda.cms.model.CJPhotoGallery.Update", params);
		
	}


	public List<CJPhotoGallery> getAll() {
		return sqlSessionTemplate.selectList("com.andromeda.cms.model.CJPhotoGallery.GetAll");
	}

	public List<CJPhotoGallery> getByPublishedYear(int publishedYear) {
		Map<String, Object> params = new HashMap<>();
		params.put("publishedYear", publishedYear);
		return sqlSessionTemplate.selectList("com.andromeda.cms.model.CJPhotoGallery.GetByPublishedYear", params);
	}

	public List<CJPhotoGallery> getLatestPhotosWithoutPriority(int categoryId, Integer limit) {
		Map<String, Object> params = new HashMap<>();
		params.put("categoryId", categoryId);
		params.put("limit", limit);
		return sqlSessionTemplate.selectList("com.andromeda.cms.model.CJPhotoGallery.GetLatestPhotosWithoutPriority", params);
	}

	public List<CJPhotoGallery> getLatestPhotosBySubCategoryWithoutPriority(int categoryId, int subCategoryId, Integer limit, int offset) {
		if(subCategoryId != 0)
		{
			List<CJPhotoGallery> latestPhotos = new ArrayList<>();
			Map<String, Object> params = new HashMap<>();
			params.put("subCategoryId", subCategoryId);
			params.put("categoryId", categoryId);
			params.put("limit", limit);
			params.put("offset", offset);
			
			List<CJPhotoGallery> latestOTPriority = sqlSessionTemplate.selectList("com.andromeda.cms.model.CJPhotoGallery.GetLatestPhotosBySubCategoryWithoutPriority", params);
			
			latestPhotos.addAll(latestOTPriority);
			return latestPhotos;
		}
		return null;
	}

	public void deleteById(int id) 
		{
			Map<String, Object> params = new HashMap<>();
			params.put("id", id);
			sqlSessionTemplate.delete("com.andromeda.cms.model.CJPhotoGallery.DeleteById", params);
		}

}
