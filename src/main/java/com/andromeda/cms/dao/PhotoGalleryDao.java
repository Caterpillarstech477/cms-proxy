package com.andromeda.cms.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.andromeda.cms.commons.dao.CmsBaseDao;
import com.andromeda.cms.defs.StrapiConstants;
import com.andromeda.cms.model.Article;
import com.andromeda.cms.model.Category;
import com.andromeda.cms.model.PhotoGallery;
import com.andromeda.commons.dao.BaseDAO;

public class PhotoGalleryDao extends CmsBaseDao{
	
	private static String MASTER_TABLE = "cms_proxy.photoGallery";
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

	public List<PhotoGallery> getLatestBySubCategoryId(int categoryId, int subCategoryId, Integer limit, Integer offset) {
		if(subCategoryId != 0)
		{
			Map<String, Object> params = new HashMap<>();
			params.put("categoryId", categoryId);
			params.put("subCategoryId", subCategoryId);
			params.put("limit", limit);
			params.put("offset", offset);
			return sqlSessionTemplate.selectList("com.andromeda.cms.model.PhotoGallery.GetLatestBySubCategoryId", params);
		}
		else
		{
			return null;
		}
	}
	
	public List<PhotoGallery> getLatestBySubCategoryIdOnCreated(int categoryId, int subCategoryId, Integer limit, Integer offset) {
		if(subCategoryId != 0)
		{
			Map<String, Object> params = new HashMap<>();
			params.put("categoryId", categoryId);
			params.put("subCategoryId", subCategoryId);
			params.put("limit", limit);
			params.put("offset", offset);
			return sqlSessionTemplate.selectList("com.andromeda.cms.model.PhotoGallery.GetLatestBySubCategoryIdOnCreated", params);
		}
		else
		{
			return null;
		}
	}

	/*public List<PhotoGallery> getLatestByCategoryId(int categoryId, Integer limit, Integer offset) {
		Map<String, Object> params = new HashMap<>();
		params.put("categoryId", categoryId);
		params.put("limit", limit);
		params.put("offset", offset);
		return sqlSessionTemplate.selectList("com.andromeda.cms.model.PhotoGallery.GetLatestByCategoryId", params);
	}*/
	
	public List<PhotoGallery> getLatestByCategoryIdOnCreated(int categoryId, Integer limit, Integer offset) 
	{
		if(categoryId != 0)
		{
			List<PhotoGallery> latestVideos = new ArrayList<>();
			Map<String, Object> params = new HashMap<>();
			params.put("limit", StrapiConstants.PRIORITY_LIMIT);
			params.put("categoryId", categoryId);
			List<PhotoGallery> latestInPriority =  sqlSessionTemplate.selectList("com.andromeda.cms.model.PhotoGallery.GetLatestPhotosInPriorityOnCreated", params);
			
			latestVideos.addAll(latestInPriority);
			
			List<Integer> latestInPriorityIds = new ArrayList<>();
			if(latestInPriority != null)
			{
				for (PhotoGallery photoGallery : latestInPriority) {
					latestInPriorityIds.add(photoGallery.getId());
				}	
			}
			
			params.put("limit", limit);
			params.put("offset", offset);
			if(latestInPriorityIds.size() > 0)
				params.put("latestInPriorityIds", latestInPriorityIds);
			else
				params.put("latestInPriorityIds", null);
			List<PhotoGallery> latestOTPriority = sqlSessionTemplate.selectList("com.andromeda.cms.model.PhotoGallery.GetLatestByCategoryIdOnCreated", params);
			
			latestVideos.addAll(latestOTPriority);
			return latestVideos;
			
		}
		return null;
	}
	
	public List<PhotoGallery> getLatestByCategoryId(int categoryId, Integer limit, Integer offset) 
	{
		if(categoryId != 0)
		{
			List<PhotoGallery> latestVideos = new ArrayList<>();
			Map<String, Object> params = new HashMap<>();
			params.put("limit", StrapiConstants.PRIORITY_LIMIT);
			params.put("categoryId", categoryId);
			List<PhotoGallery> latestInPriority =  sqlSessionTemplate.selectList("com.andromeda.cms.model.PhotoGallery.GetLatestPhotosInPriority", params);
			
			latestVideos.addAll(latestInPriority);
			
			List<Integer> latestInPriorityIds = new ArrayList<>();
			if(latestInPriority != null)
			{
				for (PhotoGallery photoGallery : latestInPriority) {
					latestInPriorityIds.add(photoGallery.getId());
				}	
			}
			
			params.put("limit", limit);
			params.put("offset", offset);
			if(latestInPriorityIds.size() > 0)
				params.put("latestInPriorityIds", latestInPriorityIds);
			else
				params.put("latestInPriorityIds", null);
			List<PhotoGallery> latestOTPriority = sqlSessionTemplate.selectList("com.andromeda.cms.model.PhotoGallery.GetLatestByCategoryId", params);
			
			latestVideos.addAll(latestOTPriority);
			return latestVideos;
			
		}
		return null;
	}
	

	/*
	 * public List<PhotoGallery> getLatestPhotos(Integer limit) { Map<String,
	 * Object> params = new HashMap<>(); params.put("limit", limit); return
	 * sqlSessionTemplate.selectList(
	 * "com.andromeda.cms.model.PhotoGallery.GetLatestPhotos", params);
	 * 
	 * }
	 */
	
	
	public List<PhotoGallery> getLatestPhotosOnCreated(Integer limit)
	{
		List<PhotoGallery> latestPhotos = new ArrayList<>();
		Map<String, Object> params = new HashMap<>();
		params.put("limit", StrapiConstants.PRIORITY_LIMIT);
		List<PhotoGallery> latestInPriority =  sqlSessionTemplate.selectList("com.andromeda.cms.model.PhotoGallery.GetLatestPhotosInPriorityOnCreated", params);
		
		List<Integer> latestInPriorityIds = new ArrayList<>();
		if(latestInPriority != null)
		{
			for (PhotoGallery photo : latestInPriority) {
				latestInPriorityIds.add(photo.getId());
			}	
		}
		
		latestPhotos.addAll(latestInPriority);
		
		params.put("limit", limit);
		if(latestInPriorityIds.size() > 0)
			params.put("latestInPriorityIds", latestInPriorityIds);
		else
			params.put("latestInPriorityIds", null);
		List<PhotoGallery> latestOTPriority = sqlSessionTemplate.selectList("com.andromeda.cms.model.PhotoGallery.GetLatestPhotosOnCreated", params);
		
		latestPhotos.addAll(latestOTPriority);
		return latestPhotos;
		
	}
	
	public List<PhotoGallery> getLatestPhotos(Integer limit)
	{
		List<PhotoGallery> latestPhotos = new ArrayList<>();
		Map<String, Object> params = new HashMap<>();
		params.put("limit", StrapiConstants.PRIORITY_LIMIT);
		List<PhotoGallery> latestInPriority =  sqlSessionTemplate.selectList("com.andromeda.cms.model.PhotoGallery.GetLatestPhotosInPriority", params);
		
		List<Integer> latestInPriorityIds = new ArrayList<>();
		if(latestInPriority != null)
		{
			for (PhotoGallery photo : latestInPriority) {
				latestInPriorityIds.add(photo.getId());
			}	
		}
		
		latestPhotos.addAll(latestInPriority);
		
		params.put("limit", limit);
		if(latestInPriorityIds.size() > 0)
			params.put("latestInPriorityIds", latestInPriorityIds);
		else
			params.put("latestInPriorityIds", null);
		List<PhotoGallery> latestOTPriority = sqlSessionTemplate.selectList("com.andromeda.cms.model.PhotoGallery.GetLatestPhotos", params);
		
		latestPhotos.addAll(latestOTPriority);
		return latestPhotos;
		
	}
	
	
	public PhotoGallery getByIdWOPublished(int id) {
		Map<String, Object> params = new HashMap<>();
		params.put("id", id);
		return sqlSessionTemplate.selectOne("com.andromeda.cms.model.PhotoGallery.GetByIdWOPublished", params);
	}
	
	public PhotoGallery getById(int id) {
		Map<String, Object> params = new HashMap<>();
		params.put("id", id);
		return sqlSessionTemplate.selectOne("com.andromeda.cms.model.PhotoGallery.GetById", params);
	}

	public void add(PhotoGallery photoGallery) {
		int publishedYear = photoGallery.getPublishedYear();
		String tableName = getPartitionTableName(publishedYear);
		System.out.println("tableName: " + tableName);
		Map<String, Object> params = new HashMap<>();
		params.put("tableName", tableName);
		params.put("p", photoGallery);
		sqlSessionTemplate.insert("com.andromeda.cms.model.PhotoGallery.Add", params);
		
	}

	public void update(PhotoGallery photoGallery) {
		Map<String, Object> params = new HashMap<>();
		params.put("p", photoGallery);
		sqlSessionTemplate.update("com.andromeda.cms.model.PhotoGallery.Update", params);
		
	}

	public List<PhotoGallery> getSubCategoryRelatedPhotos(int subCategoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<PhotoGallery> getByCategoryId(Integer subCategoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<PhotoGallery> getAll() {
		return sqlSessionTemplate.selectList("com.andromeda.cms.model.PhotoGallery.GetAll");
	}

	public List<PhotoGallery> getByPublishedYear(int publishedYear) {
		Map<String, Object> params = new HashMap<>();
		params.put("publishedYear", publishedYear);
		return sqlSessionTemplate.selectList("com.andromeda.cms.model.PhotoGallery.GetByPublishedYear", params);
	}

	public List<PhotoGallery> getLatestPhotosWithoutPriority(int categoryId, Integer limit) {
		Map<String, Object> params = new HashMap<>();
		params.put("categoryId", categoryId);
		params.put("limit", limit);
		return sqlSessionTemplate.selectList("com.andromeda.cms.model.PhotoGallery.GetLatestPhotosWithoutPriority", params);
	}

	public List<PhotoGallery> getLatestPhotosBySubCategoryWithoutPriority(int categoryId, int subCategoryId, Integer limit, int offset) {
		if(subCategoryId != 0)
		{
			List<PhotoGallery> latestPhotos = new ArrayList<>();
			Map<String, Object> params = new HashMap<>();
			params.put("subCategoryId", subCategoryId);
			params.put("categoryId", categoryId);
			params.put("limit", limit);
			params.put("offset", offset);
			
			List<PhotoGallery> latestOTPriority = sqlSessionTemplate.selectList("com.andromeda.cms.model.PhotoGallery.GetLatestPhotosBySubCategoryWithoutPriority", params);
			
			latestPhotos.addAll(latestOTPriority);
			return latestPhotos;
		}
		return null;
	}

	public void deleteById(int id) 
		{
			Map<String, Object> params = new HashMap<>();
			params.put("id", id);
			sqlSessionTemplate.delete("com.andromeda.cms.model.PhotoGallery.DeleteById", params);
		}

}
