package cn.sx.ebj.bidding.mall.core.configure;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
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
public class RedisConfig {

    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(factory);
        //使用Jackson2JsonRedisSerialize 替换默认的jdkSerializeable序列化
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        objectMapper.setDefaultTyping(ObjectMapper.DefaultTypeResolverBuilder.noTypeInfoBuilder());
        StringRedisSerializer strSerializer = new StringRedisSerializer();
        // key采用String的序列化方式
        template.setKeySerializer(strSerializer);
        // hash的key也采用String的序列化方式
        template.setHashKeySerializer(strSerializer);
        // value序列化方式采用jackson
        template.setValueSerializer(new Jackson2JsonRedisSerializer<>(objectMapper, String.class));
        // hash的value序列化方式采用jackson
        template.setHashValueSerializer(new Jackson2JsonRedisSerializer<>(objectMapper, String.class));
        template.afterPropertiesSet();
        return template;
    }

    @Bean
    public RedisCacheManager cacheManager(RedisConnectionFactory connectionFactory) {
        return RedisCacheManager.create(connectionFactory);
    }

}
