package cn.sx.ebj.bidding.mall.service.impl;

import cn.sx.ebj.bidding.mall.core.base.Result;
import cn.sx.ebj.bidding.mall.core.cache.RedisCache;
import cn.sx.ebj.bidding.mall.core.enums.MarketType;
import cn.sx.ebj.bidding.mall.plugins.model.MarketParam;
import cn.sx.ebj.bidding.mall.plugins.spi.IMarketPlugin;
import cn.sx.ebj.bidding.mall.service.IOrderFace;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Result<?> createOrder() {
        log.error("请求来了");
        Assert.notNull(redisCache, "不能为空");
        redisCache.setCacheObject("Test", "1111", 1000, TimeUnit.SECONDS);
        IMarketPlugin plugin = registry.getPluginFor(new MarketParam(MarketType.SYS.getType())).get();
        return plugin.createOrder(null);
    }

    @Autowired
    public void setRegistry(PluginRegistry<IMarketPlugin, MarketParam> registry) {
        this.registry = registry;
    }


    @Autowired

    public void setRedisCache(RedisCache redisCache) {
        this.redisCache = redisCache;
    }
}
