package com.gzh.youth.cache.redis;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;


@Repository
public class RedisUtil {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    public void add(String key, Long time,String o) {
        ValueOperations<String,String> valueOperations = redisTemplate.opsForValue();
        valueOperations.set(key, o, time, TimeUnit.MINUTES);
    }


    public Object get(String key) {
    	 ValueOperations<String,String> valueOperations = redisTemplate.opsForValue();
    	 return valueOperations.get(key);
    }


    public void delete(String key){
        redisTemplate.opsForValue().getOperations().delete(key);
    }
}
