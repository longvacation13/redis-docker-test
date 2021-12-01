package com.redis.prom.calc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;


@Service
public class RedisPromService {
		
	@Autowired
	private StringRedisTemplate stringRedisTemplate; 
	
	/**
	 * value 받아옴
	 * @param key
	 */
	public String getRedisStringValue(String key) {
		ValueOperations<String, String> stringValueOperations = stringRedisTemplate.opsForValue();
		System.out.println("Redis key : " + key);
		System.out.println("Redis value : " + stringValueOperations.get(key));
		return stringValueOperations.get(key);
	}
	
	
	/** 
	 * 키 세팅 
	 * @param key
	 * @param value
	 */
	public void setRedisStringValue(String key, String value)
	{
		ValueOperations<String, String> stringValueOperations = stringRedisTemplate.opsForValue();
		stringValueOperations.set(key, value);
		System.out.println("Redis key : " + key);
		System.out.println("Redis value : " + stringValueOperations.get(key));		
	}
	
}
