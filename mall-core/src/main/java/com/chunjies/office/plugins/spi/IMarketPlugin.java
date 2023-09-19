package com.chunjies.office.plugins.spi;

import com.chunjies.office.core.utils.Result;
import com.chunjies.office.plugins.model.MarketParam;
import com.chunjies.office.plugins.model.OrderRequest;
import com.chunjies.office.plugins.model.OrderResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.plugin.core.Plugin;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/18
 * {@code @description}
 */
public abstract class IMarketPlugin implements Plugin<MarketParam> {
    protected Logger log = LoggerFactory.getLogger(getClass());
    private MarketParam marketParam;

    protected String getToken() {
        return null;
    }

    public Result<OrderResponse> createOrder(OrderRequest orderRequest) {
        return Result.error();
    }

    protected MarketParam getMarketParam() {
        return marketParam;
    }

    protected void setMarketParam(MarketParam marketParam) {
        this.marketParam = marketParam;
    }

}
