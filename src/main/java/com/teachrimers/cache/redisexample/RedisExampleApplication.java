package com.teachrimers.cache.redisexample;

import com.springredisexample.Application;
import com.springredisexample.model.CustomerAccount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class RedisExampleApplication {
	@Bean
	JedisConnectionFactory jedisConnectionFactory() {
		return new JedisConnectionFactory();
	}

	@Bean
	RedisTemplate<String, CustomerAccount> redisTemplate() {
		RedisTemplate<String, CustomerAccount> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(jedisConnectionFactory());
		return redisTemplate;
	}


//	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
//	}

	public static void main(String[] args) {
		SpringApplication.run(RedisExampleApplication.class, args);
	}

}
