package com.andromeda.cms.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.andromeda.cms.commons.dao.CmsBaseDao;
import com.andromeda.cms.defs.StrapiConstants;
import com.andromeda.cms.model.CJArticle;

public class CJArticleDao extends CmsBaseDao{

	private static String MASTER_TABLE = "cms_proxy.cj_articles";
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
		
		
		public void add(CJArticle cjArticle)
		{
			int publishedYear = cjArticle.getPublishedYear();
			String tableName = getPartitionTableName(publishedYear);
			System.out.println("tableName: " + tableName);
			Map<String, Object> params = new HashMap<>();
			params.put("tableName", tableName);
			params.put("p", cjArticle);
			sqlSessionTemplate.insert("com.andromeda.cms.model.CJArticle.Add", params);
		}
		
	
		public int update(CJArticle cjArticle) 
		{
			Map<String, Object> params = new HashMap<>();
			params.put("p", cjArticle);
			return sqlSessionTemplate.update("com.andromeda.cms.model.CJArticle.Update", params);
		}

		
		public List<CJArticle> getLatestArticlesWithoutPriority(String contentType, Integer limit)
		{
			List<CJArticle> latestArticles = new ArrayList<>();
			
			Map<String, Object> params = new HashMap<>();
			params.put("contentType", contentType);
			params.put("limit", limit);
			
			List<CJArticle> latestOTPriority =  sqlSessionTemplate.selectList("com.andromeda.cms.model.CJArticle.GetLatestArticlesWithoutPriority", params);
			
			latestArticles.addAll(latestOTPriority);
			return latestArticles;
		}
		
		
		public List<CJArticle> getLatestArticles(String contentType, Integer limit)
		{
			List<CJArticle> latestArticles = new ArrayList<>();
			Map<String, Object> params = new HashMap<>();
			params.put("limit", StrapiConstants.PRIORITY_LIMIT);
			params.put("contentType", contentType);
			List<CJArticle> latestInPriority =  sqlSessionTemplate.selectList("com.andromeda.cms.model.CJArticle.GetLatestArticlesInPriority", params);
			
			latestArticles.addAll(latestInPriority);
			
			List<Integer> latestInPriorityIds = new ArrayList<>();
			if(latestInPriority != null)
			{
				for (CJArticle article : latestInPriority) {
					latestInPriorityIds.add(article.getId());
				}	
			}
			
			params.put("limit", limit);
			if(latestInPriorityIds.size() > 0)
				params.put("latestInPriorityIds", latestInPriorityIds);
			else
				params.put("latestInPriorityIds", null);
			List<CJArticle> latestOTPriority =  sqlSessionTemplate.selectList("com.andromeda.cms.model.CJArticle.GetLatestArticles", params);
			
			latestArticles.addAll(latestOTPriority);
			return latestArticles;
		}
		
		public List<CJArticle> getLatestArticlesOnCreated(String contentType, Integer limit)
		{
			List<CJArticle> latestArticles = new ArrayList<>();
			Map<String, Object> params = new HashMap<>();
			params.put("contentType", contentType);
			/*params.put("limit", StrapiConstants.PRIORITY_LIMIT);
			List<CJArticle> latestInPriority =  sqlSessionTemplate.selectList("com.andromeda.cms.model.CJArticle.GetLatestArticlesInPriority", params);
			
			latestArticles.addAll(latestInPriority);
			
			List<Integer> latestInPriorityIds = new ArrayList<>();
			if(latestInPriority != null)
			{
				for (CJArticle article : latestInPriority) {
					latestInPriorityIds.add(article.getId());
				}	
			} 
			if(latestInPriorityIds.size() > 0)
				params.put("latestInPriorityIds", latestInPriorityIds);
			else
				params.put("latestInPriorityIds", null);
			*/
			
			params.put("limit", limit);
			
			List<CJArticle> latestOTPriority =  sqlSessionTemplate.selectList("com.andromeda.cms.model.CJArticle.GetLatestArticlesOnCreated", params);
			
			latestArticles.addAll(latestOTPriority);
			return latestArticles;
		}
		
		public List<CJArticle> getLatestVideos(Integer limit)
		{
			List<CJArticle> latestVideos = new ArrayList<>();
			
			Map<String, Object> params = new HashMap<>();
			params.put("limit", StrapiConstants.PRIORITY_LIMIT);
			params.put("contentType", StrapiConstants.CONTENT_TYPE_CHITRA_VIDEO);
			List<CJArticle> latestInPriority =  sqlSessionTemplate.selectList("com.andromeda.cms.model.CJArticle.GetLatestArticlesInPriority", params);
			
			latestVideos.addAll(latestInPriority);
			
			List<Integer> latestInPriorityIds = new ArrayList<>();
			if(latestInPriority != null)
			{
				for (CJArticle article : latestInPriority) {
					latestInPriorityIds.add(article.getId());
				}	
			}
			
			params.put("limit", limit);
			if(latestInPriorityIds.size() > 0)
				params.put("latestInPriorityIds", latestInPriorityIds);
			else
				params.put("latestInPriorityIds", null);
			List<CJArticle> latestOTPriority =   sqlSessionTemplate.selectList("com.andromeda.cms.model.CJArticle.GetLatestArticles", params);
			latestVideos.addAll(latestOTPriority);
			
			return latestVideos;
		}
		
		public List<CJArticle> getPhotos(Integer limit)
		{
			Map<String, Object> params = new HashMap<>();
			params.put("limit", limit);
			return sqlSessionTemplate.selectList("com.andromeda.cms.model.CJArticle.GetPhotos", params);
		}
		
		public List<CJArticle> getVideos(Integer limit)
		{
			Map<String, Object> params = new HashMap<>();
			params.put("limit", limit);
			return sqlSessionTemplate.selectList("com.andromeda.cms.model.CJArticle.GetVideos", params);
		}

		public CJArticle getById(int id) {
			Map<String, Object> params = new HashMap<>();
			params.put("id", id);
			return sqlSessionTemplate.selectOne("com.andromeda.cms.model.CJArticle.GetById", params);
		}
		
		
		public CJArticle getByIdWOPublished(int id) {
			Map<String, Object> params = new HashMap<>();
			params.put("id", id);
			return sqlSessionTemplate.selectOne("com.andromeda.cms.model.CJArticle.GetByIdWOPublished", params);
		}
		
		public List<CJArticle> getSubCategoryRelatedArticles(int subCategoryId) {
			
				Map<String, Object> params = new HashMap<>();
				params.put("subCategoryId", subCategoryId);
				return sqlSessionTemplate.selectList("com.andromeda.cms.model.CJArticle.GetBySubCategoryId", params);
		}

		public List<CJArticle> getByCategoryId(int categoryId) {
				Map<String, Object> params = new HashMap<>();
				params.put("categoryId", categoryId);
				return sqlSessionTemplate.selectList("com.andromeda.cms.model.CJArticle.GetByCategoryId", params);
		}
		
		public List<CJArticle> getLatestByCategoryIdWithoutPriority(int categoryId, Integer limit, Integer offset) 
		{
			if(categoryId != 0)
			{
				List<CJArticle> latestArticles = new ArrayList<>();
				Map<String, Object> params = new HashMap<>();
				params.put("categoryId", categoryId);
				params.put("limit", limit);
				params.put("offset", offset);
				params.put("latestInPriorityIds", null);
				List<CJArticle> latestOTPriority = sqlSessionTemplate.selectList("com.andromeda.cms.model.CJArticle.GetLatestByCategoryIdWithoutPriority", params);
				
				latestArticles.addAll(latestOTPriority);
				return latestArticles;
				
			}
			return null;
		}
		
		
		public List<CJArticle> getLatestByCategoryIdOnCreated(int categoryId, Integer limit, Integer offset) 
		{
			if(categoryId != 0)
			{
				List<CJArticle> latestArticles = new ArrayList<>();
				Map<String, Object> params = new HashMap<>();
				params.put("limit", StrapiConstants.PRIORITY_LIMIT);
				params.put("categoryId", categoryId);
				List<CJArticle> latestInPriority =  sqlSessionTemplate.selectList("com.andromeda.cms.model.CJArticle.GetLatestInPriorityByCategoryIdOnCreated", params);
				
				latestArticles.addAll(latestInPriority);
				
				List<Integer> latestInPriorityIds = new ArrayList<>();
				if(latestInPriority != null)
				{
					for (CJArticle article : latestInPriority) {
						latestInPriorityIds.add(article.getId());
					}	
				}
				
				params.put("limit", limit);
				params.put("offset", offset);
				if(latestInPriorityIds.size() > 0)
					params.put("latestInPriorityIds", latestInPriorityIds);
				else
					params.put("latestInPriorityIds", null);
				List<CJArticle> latestOTPriority = sqlSessionTemplate.selectList("com.andromeda.cms.model.CJArticle.GetLatestByCategoryIdOnCreated", params);
				
				latestArticles.addAll(latestOTPriority);
				return latestArticles;
				
			}
			return null;
		}
		

		public List<CJArticle> getLatestByCategoryId(int categoryId, Integer limit, Integer offset) 
		{
			if(categoryId != 0)
			{
				List<CJArticle> latestArticles = new ArrayList<>();
				Map<String, Object> params = new HashMap<>();
				params.put("limit", StrapiConstants.PRIORITY_LIMIT);
				params.put("categoryId", categoryId);
				List<CJArticle> latestInPriority =  sqlSessionTemplate.selectList("com.andromeda.cms.model.CJArticle.GetLatestInPriorityByCategoryId", params);
				
				latestArticles.addAll(latestInPriority);
				
				List<Integer> latestInPriorityIds = new ArrayList<>();
				if(latestInPriority != null)
				{
					for (CJArticle article : latestInPriority) {
						latestInPriorityIds.add(article.getId());
					}	
				}
				
				params.put("limit", limit);
				params.put("offset", offset);
				if(latestInPriorityIds.size() > 0)
					params.put("latestInPriorityIds", latestInPriorityIds);
				else
					params.put("latestInPriorityIds", null);
				List<CJArticle> latestOTPriority = sqlSessionTemplate.selectList("com.andromeda.cms.model.CJArticle.GetLatestByCategoryId", params);
				
				latestArticles.addAll(latestOTPriority);
				return latestArticles;
				
			}
			return null;
		}
		
		public List<CJArticle> getBySubCategoryId(int subCategoryId) {
			Map<String, Object> params = new HashMap<>();
			params.put("subCategoryId", subCategoryId);
			return sqlSessionTemplate.selectList("com.andromeda.cms.model.CJArticle.GetBySubCategoryId", params);
		}
		
		public List<CJArticle> getLatestBySubCategoryIdWithoutPriority(String contentType, int categoryId, int subCategoryId, Integer limit, Integer offset) 
		{
			if(subCategoryId != 0)
			{
				List<CJArticle> latestArticles = new ArrayList<>();
				Map<String, Object> params = new HashMap<>();
				
				params.put("contentType", contentType);
				params.put("subCategoryId", subCategoryId);
				params.put("categoryId", categoryId);
				params.put("limit", limit);
				params.put("offset", offset);
				
				List<CJArticle> latestOTPriority = sqlSessionTemplate.selectList("com.andromeda.cms.model.CJArticle.GetLatestBySubCategoryIdWithoutPriority", params);
				
				latestArticles.addAll(latestOTPriority);
				return latestArticles;
			}
			return null;
		}
		
		public List<CJArticle> getLatestBySubCategoryIdOnCreated(String contentType, int categoryId, int subCategoryId, Integer limit, Integer offset) 
		{
			if(subCategoryId != 0)
			{
				List<CJArticle> latestArticles = new ArrayList<>();
				Map<String, Object> params = new HashMap<>();
				params.put("contentType", contentType);
				params.put("subCategoryId", subCategoryId);
				params.put("categoryId", categoryId);
				params.put("limit", limit);
				params.put("offset", offset);
				
				List<CJArticle> latestOTPriority = sqlSessionTemplate.selectList("com.andromeda.cms.model.CJArticle.GetLatestBySubCategoryIdOnCreated", params);
				
				latestArticles.addAll(latestOTPriority);
				return latestArticles;
			}
			return null;
		}
		
		public List<CJArticle> getLatestBySubCategoryId(String contentType, int categoryId, int subCategoryId, Integer limit, Integer offset) 
		{
			if(subCategoryId != 0)
			{
				List<CJArticle> latestArticles = new ArrayList<>();
				Map<String, Object> params = new HashMap<>();
				params.put("contentType", contentType);
				params.put("subCategoryId", subCategoryId);
				params.put("categoryId", categoryId);
				params.put("limit", limit);
				params.put("offset", offset);
				
				List<CJArticle> latestOTPriority = sqlSessionTemplate.selectList("com.andromeda.cms.model.CJArticle.GetLatestBySubCategoryId", params);
				
				latestArticles.addAll(latestOTPriority);
				return latestArticles;
			}
			return null;
		}

		public List<Date> getDistinctPublishDates() 
		{
			return sqlSessionTemplate.selectList("com.andromeda.cms.model.CJArticle.GetDistinctPublishDates");
		}
		
		public List<Integer> getDistinctPublishYears() 
		{
			return sqlSessionTemplate.selectList("com.andromeda.cms.model.CJArticle.GetDistinctPublishYears");
		}
		
		public Date getMaxArticlePublishDate() 
		{
			return sqlSessionTemplate.selectOne("com.andromeda.cms.model.CJArticle.GetMaxArticlePublishDate");
		}

		public List<CJArticle> getByPublishedDate(Date date) {
			Map<String, Object> params = new HashMap<>();
			params.put("publishedAt", date);
			return sqlSessionTemplate.selectList("com.andromeda.cms.model.CJArticle.GetByPublishedDate", params);
		}

		public List<CJArticle> getLatestPriorityArticles(Integer limit) {
			Map<String, Object> params = new HashMap<>();
			params.put("limit", StrapiConstants.LIMIT);
			List<CJArticle> priorityArticles =  sqlSessionTemplate.selectList("com.andromeda.cms.model.CJArticle.GetLatestPriorityArticles", params);
			return priorityArticles;
		}

		public List<CJArticle> getByPublishedYear(String contentType, int publishedYear) {
			Map<String, Object> params = new HashMap<>();
			params.put("contentType", contentType);
			params.put("publishedYear", publishedYear);
			List<CJArticle> chitraArticles =  sqlSessionTemplate.selectList("com.andromeda.cms.model.CJArticle.GetByPublishedYear", params);
			return chitraArticles;
		}

		public List<CJArticle> getRkArticlesWithLetter(int categoryId, String c, int limit) {
			Map<String, Object> params = new HashMap<>();
			params.put("categoryId", categoryId);
			params.put("startChar", c);
			params.put("limit", limit);
			List<CJArticle> chitraArticles =  sqlSessionTemplate.selectList("com.andromeda.cms.model.CJArticle.GetRkArticlesWithLetter", params);
			return chitraArticles;
		}

		public void deleteById(int id) {
			Map<String, Object> params = new HashMap<>();
			params.put("id", id);
			sqlSessionTemplate.delete("com.andromeda.cms.model.CJArticle.DeleteById", params);
		}

		public List<CJArticle> getTagRelatedArticles(String tag, int limit) {
			Map<String, Object> params = new HashMap<>();
			params.put("tag", "%," + tag + ",%" ); // ,tag,
			params.put("limit", limit);
			return sqlSessionTemplate.selectList("com.andromeda.cms.model.CJArticle.GetArticlesWithTag", params);
		}

}
