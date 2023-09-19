package com.chunjies.office.service.impl;

import com.chunjies.office.core.enums.MarketType;
import com.chunjies.office.core.utils.Result;
import com.chunjies.office.plugins.model.MarketParam;
import com.chunjies.office.plugins.spi.IMarketPlugin;
import com.chunjies.office.service.IOrderFace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.plugin.core.PluginRegistry;
import org.springframework.stereotype.Service;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/19
 * {@code @description}
 */

@Service("orderFace")
public class OrderFaceImpl implements IOrderFace {
    //插件注册类
    private PluginRegistry<IMarketPlugin, MarketParam> registry;

    @Override
    public Result createOrder() {
        IMarketPlugin plugin = registry.getPluginFor(new MarketParam(MarketType.SYS.getType())).get();
        Result t = plugin.createOrder(null);
        return t;
    }

    @Autowired
    public void setRegistry(PluginRegistry<IMarketPlugin, MarketParam> registry) {
        this.registry = registry;
    }


}
