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
 * {@code @time} 2023/9/19
 * {@code @description} 系统公共接口仅供外部对接使用
 */
@Component
public class SysMarketPlugin extends IMarketPlugin {
    @Override
    protected String getToken() {
        log.error("公共获取Token请求-》{}",getMarketParam().getType());
        return super.getToken();
    }

    @Override
    public Result<OrderResponse> createOrder(OrderRequest orderRequest) {
        getToken();
        return super.createOrder(orderRequest);
    }

    @Override
    public boolean supports(MarketParam marketParam) {
        this.setMarketParam(marketParam);
        return marketParam.getType().equals(MarketType.SYS.getType());
    }
}
