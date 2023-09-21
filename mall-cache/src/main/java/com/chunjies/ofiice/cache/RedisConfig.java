package com.chunjies.ofiice.cache;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;


/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/20
 * {@code @description}
 */

@Component
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport {
    @Bean
    public JedisConnectionFactory redisConnectionFactory() {
        return new JedisConnectionFactory();
    }

    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        Jackson2JsonRedisSerializer redisSerializer = new Jackson2JsonRedisSerializer(Object.class);
        template.setValueSerializer(redisSerializer);
        template.setKeySerializer(new StringRedisSerializer());
        // 设置hash key 和value序列化模式
        template.setHashValueSerializer(redisSerializer);
        template.setHashKeySerializer(new StringRedisSerializer());
        template.setConnectionFactory(factory);
        return template;
    }
}
