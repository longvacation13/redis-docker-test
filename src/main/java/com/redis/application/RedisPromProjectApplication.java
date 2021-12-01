package com.redis.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication(scanBasePackages={"com.redis.prom.calc.controller", "com.redis.prom.calc.service"})
@RestController
public class RedisPromProjectApplication {

	/** 
	 * main method 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("RedisPromProjectApplication start...!");
		SpringApplication.run(RedisPromProjectApplication.class, args);
	}
	
	@RequestMapping("/")
	public String home() {
		return "Hello Docker World"; 
	}
		
}
