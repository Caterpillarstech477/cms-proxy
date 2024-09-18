package com.andromeda.cms.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.andromeda.cms.commons.dao.CmsBaseDao;
import com.andromeda.cms.defs.StrapiConstants;
import com.andromeda.cms.model.Article;
import com.andromeda.commons.dao.BaseDAO;

public class ArticleDao extends CmsBaseDao{

	private static String MASTER_TABLE = "cms_proxy.articles";
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
	
	
	public void add(Article article)
	{
		int publishedYear = article.getPublishedYear();
		String tableName = getPartitionTableName(publishedYear);
		System.out.println("tableName: " + tableName);
		Map<String, Object> params = new HashMap<>();
		params.put("tableName", tableName);
		params.put("p", article);
		sqlSessionTemplate.insert("com.andromeda.cms.model.Article.Add", params);
	}
	
	public List<Article> getAll() 
	{
		return null;
	}
	
	

	/*public int add(Article sitemapArticle) 
	{
		Map<String, Object> params = new HashMap<>();
		params.put("p", sitemapArticle);
		return sqlSessionTemplate.insert("com.andromeda.cms.model.Article.Add", params);
	}*/
	
	public int update(Article sitemapArticle) 
	{
		Map<String, Object> params = new HashMap<>();
		params.put("p", sitemapArticle);
		return sqlSessionTemplate.update("com.andromeda.cms.model.Article.Update", params);
	}

	
	public List<Article> getLatestArticlesWithoutPriority(String contentType, Integer limit)
	{
		List<Article> latestArticles = new ArrayList<>();
		
		Map<String, Object> params = new HashMap<>();
		params.put("contentType", contentType);
		params.put("limit", limit);
		
		List<Article> latestOTPriority =  sqlSessionTemplate.selectList("com.andromeda.cms.model.Article.GetLatestArticlesWithoutPriority", params);
		
		latestArticles.addAll(latestOTPriority);
		return latestArticles;
	}
	
	
	public List<Article> getLatestArticles(String contentType, Integer limit)
	{
		List<Article> latestArticles = new ArrayList<>();
		Map<String, Object> params = new HashMap<>();
		params.put("limit", StrapiConstants.PRIORITY_LIMIT);
		params.put("contentType", contentType);
		List<Article> latestInPriority =  sqlSessionTemplate.selectList("com.andromeda.cms.model.Article.GetLatestArticlesInPriority", params);
		
		latestArticles.addAll(latestInPriority);
		
		List<Integer> latestInPriorityIds = new ArrayList<>();
		if(latestInPriority != null)
		{
			for (Article article : latestInPriority) {
				latestInPriorityIds.add(article.getId());
			}	
		}
		
		params.put("limit", limit);
		if(latestInPriorityIds.size() > 0)
			params.put("latestInPriorityIds", latestInPriorityIds);
		else
			params.put("latestInPriorityIds", null);
		List<Article> latestOTPriority =  sqlSessionTemplate.selectList("com.andromeda.cms.model.Article.GetLatestArticles", params);
		
		latestArticles.addAll(latestOTPriority);
		return latestArticles;
	}
	
	
	public List<Article> getLatestArticlesOnCreated(String contentType, Integer limit)
	{
		List<Article> latestArticles = new ArrayList<>();
		Map<String, Object> params = new HashMap<>();
		params.put("contentType", contentType);
		/*params.put("limit", StrapiConstants.PRIORITY_LIMIT);
		List<Article> latestInPriority =  sqlSessionTemplate.selectList("com.andromeda.cms.model.Article.GetLatestArticlesInPriority", params);
		
		latestArticles.addAll(latestInPriority);
		
		List<Integer> latestInPriorityIds = new ArrayList<>();
		if(latestInPriority != null)
		{
			for (Article article : latestInPriority) {
				latestInPriorityIds.add(article.getId());
			}	
		}
		
		if(latestInPriorityIds.size() > 0)
			params.put("latestInPriorityIds", latestInPriorityIds);
		else
			params.put("latestInPriorityIds", null);*/
		
		params.put("limit", limit);
		List<Article> latestOTPriority =  sqlSessionTemplate.selectList("com.andromeda.cms.model.Article.GetLatestArticlesOnCreated", params);
		
		latestArticles.addAll(latestOTPriority);
		return latestArticles;
	}
	
	public List<Article> getLatestVideos(Integer limit)
	{
		List<Article> latestVideos = new ArrayList<>();
		
		Map<String, Object> params = new HashMap<>();
		params.put("limit", StrapiConstants.PRIORITY_LIMIT);
		params.put("contentType", "Video Gallery");
		List<Article> latestInPriority =  sqlSessionTemplate.selectList("com.andromeda.cms.model.Article.GetLatestArticlesInPriority", params);
		
		latestVideos.addAll(latestInPriority);
		
		List<Integer> latestInPriorityIds = new ArrayList<>();
		if(latestInPriority != null)
		{
			for (Article article : latestInPriority) {
				latestInPriorityIds.add(article.getId());
			}	
		}
		
		params.put("limit", limit);
		if(latestInPriorityIds.size() > 0)
			params.put("latestInPriorityIds", latestInPriorityIds);
		else
			params.put("latestInPriorityIds", null);
		List<Article> latestOTPriority =   sqlSessionTemplate.selectList("com.andromeda.cms.model.Article.GetLatestArticles", params);
		latestVideos.addAll(latestOTPriority);
		
		return latestVideos;
	}
	
	public List<Article> getPhotos(Integer limit)
	{
		Map<String, Object> params = new HashMap<>();
		params.put("limit", limit);
		return sqlSessionTemplate.selectList("com.andromeda.cms.model.Article.GetPhotos", params);
	}
	
	public List<Article> getVideos(Integer limit)
	{
		Map<String, Object> params = new HashMap<>();
		params.put("limit", limit);
		return sqlSessionTemplate.selectList("com.andromeda.cms.model.Article.GetVideos", params);
	}

	public Article getById(int id) {
		Map<String, Object> params = new HashMap<>();
		params.put("id", id);
		return sqlSessionTemplate.selectOne("com.andromeda.cms.model.Article.GetById", params);
	}
	
	
	public Article getByIdWOPublished(int id) {
		Map<String, Object> params = new HashMap<>();
		params.put("id", id);
		return sqlSessionTemplate.selectOne("com.andromeda.cms.model.Article.GetByIdWOPublished", params);
	}
	
	public List<Article> getSubCategoryRelatedArticles(int subCategoryId) {
		
			Map<String, Object> params = new HashMap<>();
			params.put("subCategoryId", subCategoryId);
			return sqlSessionTemplate.selectList("com.andromeda.cms.model.Article.GetBySubCategoryId", params);
	}

	public List<Article> getByCategoryId(int categoryId) {
			Map<String, Object> params = new HashMap<>();
			params.put("categoryId", categoryId);
			return sqlSessionTemplate.selectList("com.andromeda.cms.model.Article.GetByCategoryId", params);
	}
	
	public List<Article> getLatestByCategoryIdWithoutPriority(int categoryId, Integer limit, Integer offset) 
	{
		if(categoryId != 0)
		{
			List<Article> latestArticles = new ArrayList<>();
			Map<String, Object> params = new HashMap<>();
			params.put("categoryId", categoryId);
			params.put("limit", limit);
			params.put("offset", offset);
			params.put("latestInPriorityIds", null);
			List<Article> latestOTPriority = sqlSessionTemplate.selectList("com.andromeda.cms.model.Article.GetLatestByCategoryIdWithoutPriority", params);
			
			latestArticles.addAll(latestOTPriority);
			return latestArticles;
			
		}
		return null;
	}
	

	public List<Article> getLatestByCategoryId(int categoryId, Integer limit, Integer offset) 
	{
		if(categoryId != 0)
		{
			List<Article> latestArticles = new ArrayList<>();
			Map<String, Object> params = new HashMap<>();
			params.put("limit", StrapiConstants.PRIORITY_LIMIT);
			params.put("categoryId", categoryId);
			List<Article> latestInPriority =  sqlSessionTemplate.selectList("com.andromeda.cms.model.Article.GetLatestInPriorityByCategoryId", params);
			
			latestArticles.addAll(latestInPriority);
			
			List<Integer> latestInPriorityIds = new ArrayList<>();
			if(latestInPriority != null)
			{
				for (Article article : latestInPriority) {
					latestInPriorityIds.add(article.getId());
				}	
			}
			
			params.put("limit", limit);
			params.put("offset", offset);
			if(latestInPriorityIds.size() > 0)
				params.put("latestInPriorityIds", latestInPriorityIds);
			else
				params.put("latestInPriorityIds", null);
			List<Article> latestOTPriority = sqlSessionTemplate.selectList("com.andromeda.cms.model.Article.GetLatestByCategoryId", params);
			
			latestArticles.addAll(latestOTPriority);
			return latestArticles;
			
		}
		return null;
	}
	
	public List<Article> getBySubCategoryId(int subCategoryId) {
		Map<String, Object> params = new HashMap<>();
		params.put("subCategoryId", subCategoryId);
		return sqlSessionTemplate.selectList("com.andromeda.cms.model.Article.GetBySubCategoryId", params);
	}
	
	public List<Article> getLatestBySubCategoryIdWithoutPriority(String contentType, int categoryId, int subCategoryId, Integer limit, Integer offset) 
	{
		if(subCategoryId != 0)
		{
			List<Article> latestArticles = new ArrayList<>();
			Map<String, Object> params = new HashMap<>();
			
			params.put("contentType", contentType);
			params.put("subCategoryId", subCategoryId);
			params.put("categoryId", categoryId);
			params.put("limit", limit);
			params.put("offset", offset);
			
			List<Article> latestOTPriority = sqlSessionTemplate.selectList("com.andromeda.cms.model.Article.GetLatestBySubCategoryIdWithoutPriority", params);
			
			latestArticles.addAll(latestOTPriority);
			return latestArticles;
		}
		return null;
	}
	
	public List<Article> getLatestBySubCategoryId(String contentType, int categoryId, int subCategoryId, Integer limit, Integer offset) 
	{
		if(subCategoryId != 0)
		{
			List<Article> latestArticles = new ArrayList<>();
			Map<String, Object> params = new HashMap<>();
			params.put("contentType", contentType);
			params.put("subCategoryId", subCategoryId);
			params.put("categoryId", categoryId);
			params.put("limit", limit);
			params.put("offset", offset);
			
			List<Article> latestOTPriority = sqlSessionTemplate.selectList("com.andromeda.cms.model.Article.GetLatestBySubCategoryId", params);
			
			latestArticles.addAll(latestOTPriority);
			return latestArticles;
		}
		return null;
	}
	
	public List<Article> getLatestBySubCategoryIdOnCreated(String contentType, int categoryId, int subCategoryId, Integer limit, Integer offset) 
	{
		if(subCategoryId != 0)
		{
			List<Article> latestArticles = new ArrayList<>();
			Map<String, Object> params = new HashMap<>();
			params.put("contentType", contentType);
			params.put("subCategoryId", subCategoryId);
			params.put("categoryId", categoryId);
			params.put("limit", limit);
			params.put("offset", offset);
			
			List<Article> latestOTPriority = sqlSessionTemplate.selectList("com.andromeda.cms.model.Article.GetLatestBySubCategoryIdOnCreated", params);
			
			latestArticles.addAll(latestOTPriority);
			return latestArticles;
		}
		return null;
	}

	public List<Date> getDistinctPublishDates() 
	{
		return sqlSessionTemplate.selectList("com.andromeda.cms.model.Article.GetDistinctPublishDates");
	}
	
	public List<Integer> getDistinctPublishYears() 
	{
		return sqlSessionTemplate.selectList("com.andromeda.cms.model.Article.GetDistinctPublishYears");
	}
	
	public Date getMaxArticlePublishDate() 
	{
		return sqlSessionTemplate.selectOne("com.andromeda.cms.model.Article.GetMaxArticlePublishDate");
	}

	public List<Article> getByPublishedDate(Date date) {
		Map<String, Object> params = new HashMap<>();
		params.put("publishedAt", date);
		return sqlSessionTemplate.selectList("com.andromeda.cms.model.Article.GetByPublishedDate", params);
	}

	public List<Article> getLatestPriorityArticles(Integer limit) {
		Map<String, Object> params = new HashMap<>();
		params.put("limit", StrapiConstants.LIMIT);
		List<Article> priorityArticles =  sqlSessionTemplate.selectList("com.andromeda.cms.model.Article.GetLatestPriorityArticles", params);
		return priorityArticles;
	}

	public List<Article> getByPublishedYear(String contentType, int publishedYear) {
		Map<String, Object> params = new HashMap<>();
		params.put("contentType", contentType);
		params.put("publishedYear", publishedYear);
		List<Article> sitemapArticles =  sqlSessionTemplate.selectList("com.andromeda.cms.model.Article.GetByPublishedYear", params);
		return sitemapArticles;
	}

	public List<Article> getRkArticlesWithLetter(int categoryId, String c, int limit) {
		Map<String, Object> params = new HashMap<>();
		params.put("categoryId", categoryId);
		params.put("startChar", c);
		params.put("limit", limit);
		List<Article> sitemapArticles =  sqlSessionTemplate.selectList("com.andromeda.cms.model.Article.GetRkArticlesWithLetter", params);
		return sitemapArticles;
	}

	public void deleteById(int id) {
		Map<String, Object> params = new HashMap<>();
		params.put("id", id);
		sqlSessionTemplate.delete("com.andromeda.cms.model.Article.DeleteById", params);
	}

	public List<Article> getTagRelatedArticles(String tag, int limit) {
		Map<String, Object> params = new HashMap<>();
		params.put("tag", "%," + tag + ",%" ); // ,tag,
		params.put("limit", limit);
		return sqlSessionTemplate.selectList("com.andromeda.cms.model.Article.GetArticlesWithTag", params);
	}

	public List<Article> getLatestByCategoryIdOnCreated(Integer categoryId, Integer limit,
			Integer offset) {
		if(categoryId != 0)
		{
			List<Article> latestArticles = new ArrayList<>();
			Map<String, Object> params = new HashMap<>();
			params.put("limit", StrapiConstants.PRIORITY_LIMIT);
			params.put("categoryId", categoryId);
			List<Article> latestInPriority =  sqlSessionTemplate.selectList("com.andromeda.cms.model.Article.GetLatestInPriorityByCategoryIdOnCreated", params);
			
			latestArticles.addAll(latestInPriority);
			
			List<Integer> latestInPriorityIds = new ArrayList<>();
			if(latestInPriority != null)
			{
				for (Article article : latestInPriority) {
					latestInPriorityIds.add(article.getId());
				}	
			}
			
			params.put("limit", limit);
			params.put("offset", offset);
			if(latestInPriorityIds.size() > 0)
				params.put("latestInPriorityIds", latestInPriorityIds);
			else
				params.put("latestInPriorityIds", null);
			List<Article> latestOTPriority = sqlSessionTemplate.selectList("com.andromeda.cms.model.Article.GetLatestByCategoryIdOnCreated", params);
			
			latestArticles.addAll(latestOTPriority);
			return latestArticles;
			
		}
		return null;
	}

}
