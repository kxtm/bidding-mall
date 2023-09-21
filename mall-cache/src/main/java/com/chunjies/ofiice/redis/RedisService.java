package com.chunjies.ofiice.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/20
 * {@code @description}
 */
@Component("redisService")
public class RedisService {
    private RedisTemplate redisTemplate;


    @Autowired
    public void setRedisTemplate(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }
}
