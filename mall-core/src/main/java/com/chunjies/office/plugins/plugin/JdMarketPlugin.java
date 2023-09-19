package com.chunjies.office.plugins.plugin;

import com.chunjies.office.core.enums.MarketType;
import com.chunjies.office.core.utils.Result;
import com.chunjies.office.plugins.model.MarketParam;
import com.chunjies.office.plugins.model.OrderRequest;
import com.chunjies.office.plugins.model.OrderResponse;
import com.chunjies.office.plugins.spi.IMarketPlugin;
import org.springframework.stereotype.Component;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/18
 * {@code @description}
 */
@Component
public class JdMarketPlugin extends IMarketPlugin {
    protected String getToken() {
        this.log.error("京东->{}", this.getMarketParam().getType());
        return null;
    }
    @Override
    public Result<OrderResponse> createOrder(OrderRequest orderRequest) {
        getToken();
        return super.createOrder(orderRequest);
    }
    @Override
    public boolean supports(MarketParam marketParam) {
        this.setMarketParam(marketParam);
        return marketParam.getType().equals(MarketType.JD.getType());
    }
}
