package com.chunjies.office.config;


import cn.sx.ebj.bidding.mall.core.base.Result;
import cn.sx.ebj.bidding.mall.core.cache.RedisCache;
import cn.sx.ebj.bidding.mall.core.utils.JsonUtil;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
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

    @Override
    public boolean preHandle(HttpServletRequest request, @NonNull HttpServletResponse resp, @NonNull Object handler) throws Exception {
        logger.error("请求地址{}", request.getRequestURI());
        String token = request.getHeader("token");
        if (ObjectUtils.isEmpty(token)) {
            resp.setCharacterEncoding("UTF-8");
            resp.setContentType("application/json; charset=utf-8");
            resp.getWriter().println(JsonUtil.objectToJson(Result.error("无权限访问")));
            resp.getWriter().close();
            return false;
        }
        if (!ObjectUtils.isEmpty(token) && ObjectUtils.isEmpty(redisCache.getCacheObject(token))) {
            resp.setCharacterEncoding("UTF-8");
            resp.setContentType("application/json; charset=utf-8");
            resp.getWriter().println(JsonUtil.objectToJson(Result.error("授权已过期")));
            resp.getWriter().close();
            return false;
        }
        return true;
    }

    @Autowired
    public void setRedisCache(RedisCache redisCache) {
        this.redisCache = redisCache;
    }
}
