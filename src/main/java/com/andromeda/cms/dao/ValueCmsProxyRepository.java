package com.andromeda.cms.dao;

import java.time.Duration;
import java.util.List;

import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

/**
 * 
 * @author Prakash K
 * @date 2020-09-14
 *
 */
public class ValueCmsProxyRepository
{
	private RedisTemplate<String, String> redisTemplate;
	private ValueOperations<String, String> valueOperations;
	private ListOperations<String, String> listOps;


	//listOps = redisTemplate.opsForList();
	public void setListOps(ListOperations<String, String> listOps)
	{
		this.listOps = listOps;
	}
		

	public void setRedisTemplate(RedisTemplate<String, String> redisTemplate)
	{
		this.redisTemplate = redisTemplate;
		this.valueOperations = this.redisTemplate.opsForValue();
	}

	public void save(String key, String value)
	{
		valueOperations.set(key, value);
	}

	public void save(String key, String value, Duration duration)
	{
		valueOperations.set(key, value, duration);
	}

	public String get(String key)
	{
		
		return valueOperations.get(key);
	}

	public void delete(String key)
	{
		System.out.println(key + "Deleted");
		redisTemplate.delete(key);
	}
	
	public void addToList(String key, String value)
	{
		listOps.leftPush(key, value);
	}
	
	public void addAllToList(String key, List<String> values)
	{
		listOps.rightPushAll(key, values);
	}
	
	public String removeFromList(String key)
	{
		return listOps.rightPop(key);
	}
	
	public List<String> getList(String key, int start, int end)
	{
		return listOps.range(key, start, end);
	}
	
	public String get(String key, int index)
	{
		return listOps.index(key, index);
	}
	
	public Long getListLength(String key)
	{
		return listOps.size(key);
	}
}
