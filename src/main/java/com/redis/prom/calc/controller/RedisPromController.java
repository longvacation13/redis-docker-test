package com.redis.prom.calc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redis.prom.calc.service.RedisPromService;

@RestController
public class RedisPromController {

	@Autowired
	private RedisPromService redisPromService; 	
	
	
	/**
	 * key에 해당하는 value 값 받아옴 
	 * @param key
	 */
	@PostMapping(value = "/getRedisStringValue")
	public String getRedisStringValue(String key) {
		return redisPromService.getRedisStringValue(key);
	}
	
	/**
	 * key - value 세팅 
	 * @param key
	 * @param value
	 */
	@PostMapping(value="/setRedisStringValue")
	public void setRedisStringValue(String key, String value)
	{
		redisPromService.setRedisStringValue(key, value); 
	}	
		
}
      