package com.chunjies.office.core.cache;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.cache.annotation.CachingConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;


/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/20
 * {@code @description}
 */

@Configuration
@AutoConfigureBefore(RedisAutoConfiguration.class)
public class RedisConfig implements CachingConfigurer {

    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(factory);
        //使用Jackson2JsonRedisSerialize 替换默认的jdkSerializeable序列化
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        objectMapper.setDefaultTyping(ObjectMapper.DefaultTypeResolverBuilder.noTypeInfoBuilder());
        StringRedisSerializer strSerializer = new StringRedisSerializer();
        var serializer = new Jackson2JsonRedisSerializer<>(objectMapper, Object.class);
        // key采用String的序列化方式
        template.setKeySerializer(strSerializer);
        // hash的key也采用String的序列化方式
        template.setHashKeySerializer(strSerializer);
        // value序列化方式采用jackson
        template.setValueSerializer(serializer);
        // hash的value序列化方式采用jackson
        template.setHashValueSerializer(serializer);
        template.afterPropertiesSet();
        return template;
    }

}
