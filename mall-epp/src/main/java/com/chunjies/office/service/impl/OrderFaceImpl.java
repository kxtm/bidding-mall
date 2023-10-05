package com.chunjies.office.service.impl;

import com.chunjies.office.core.enums.MarketType;
import com.chunjies.office.core.utils.Result;
import com.chunjies.office.plugins.model.MarketParam;
import com.chunjies.office.plugins.spi.IMarketPlugin;
import com.chunjies.office.service.IOrderFace;
import com.chunjies.ofiice.cache.RedisCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.plugin.core.PluginRegistry;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.concurrent.TimeUnit;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/19
 * {@code @description} 订单相关
 */

@Service("orderFace")
public class OrderFaceImpl implements IOrderFace {
    final Logger log = LoggerFactory.getLogger(getClass());
    //插件注册类
    private PluginRegistry<IMarketPlugin, MarketParam> registry;

    private RedisCache redisCache;

    @Override
    @Cacheable(cacheNames = "createOrder")
    public Result createOrder() {
        log.error("请求来了");
        Assert.notNull(redisCache, "不能为空");
        redisCache.setCacheObject("Test", "1111", 1000, TimeUnit.SECONDS);
        IMarketPlugin plugin = registry.getPluginFor(new MarketParam(MarketType.SYS.getType())).get();
        Result t = plugin.createOrder(null);
        return t;
    }

    @Autowired
    public void setRegistry(PluginRegistry<IMarketPlugin, MarketParam> registry) {
        this.registry = registry;
    }


    @Autowired
    public void setRedisService(RedisCache redisCache) {
        this.redisCache = redisCache;
    }
}
