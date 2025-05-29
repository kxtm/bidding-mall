package cn.sx.ebj.bidding.mall.config;


import cn.sx.ebj.bidding.mall.core.cache.RedisCache;
import cn.sx.ebj.bidding.mall.core.exception.MallException;
import cn.sx.ebj.bidding.mall.core.utils.JsonUtil;
import jakarta.annotation.Nonnull;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/10/7
 * {@code @description}
 */
public class AuthConfig implements HandlerInterceptor {

    final Logger logger = LoggerFactory.getLogger(AuthConfig.class);
    private RedisCache redisCache;

    public boolean preHandle(HttpServletRequest request, @Nonnull Object handler) throws Exception {
        logger.error("请求地址{},{}", request.getRequestURI(), JsonUtil.objectToJson(handler));
        String token = request.getHeader("token");

        if (ObjectUtils.isEmpty(token)) {
            throw new MallException("无权限访问", 4003);
        }
        if (!ObjectUtils.isEmpty(token) && ObjectUtils.isEmpty(redisCache.getCacheObject(token))) {
            throw new MallException("授权已过期", 4001);
        }
        return true;
    }

    @Autowired
    public void setRedisCache(RedisCache redisCache) {
        this.redisCache = redisCache;
    }
}
