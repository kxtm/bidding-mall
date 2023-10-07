package com.chunjies.office.plugins.plugin;

import com.chunjies.office.core.enums.MarketType;
import com.chunjies.office.core.base.Result;
import com.chunjies.office.plugins.model.MarketParam;
import com.chunjies.office.plugins.model.OrderRequest;
import com.chunjies.office.plugins.model.OrderResponse;
import com.chunjies.office.plugins.spi.IMarketPlugin;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/18
 * {@code @description}
 */
@Component
@SuppressWarnings(value = {"unchecked", "rawtypes"})
public class JdMarketPlugin extends IMarketPlugin {
    protected String getToken() {
        this.log.error("京东->{}", this.getParam().getType());
        return null;
    }

    @Override
    public Result getCategoryList() {
        return Result.error();
    }

    @Override
    public Result getSkuList(String CategoryId) {
        return Result.error();
    }

    @Override
    public Result getSKuDetail(String skuId) {
        return Result.error();
    }

    @Override
    public Result getSkuImgList(String skuId) {
        return Result.error();
    }

    @Override
    public Result getSkuPrice(String skuId) {
        return Result.error();
    }

    @Override
    public Result getSkuStock(String skuId) {
        return Result.error();
    }

    @Override
    public Result querySkuState(String skuId) {
        return Result.error();
    }

    @Override
    public Result<OrderResponse> createOrder(OrderRequest orderRequest) {
        getToken();
        return Result.error();
    }

    @Override
    public Result confirmOrder(String thirdOrderNo) {
        return Result.error();
    }

    @Override
    public Result cancelOrder(String thirdOrderNo) {
        return Result.error();
    }

    @Override
    public Result getOrderSplit(String thirdOrderNo) {
        return Result.error();
    }

    @Override
    public Result confirmReceived(String thirdOrderNo) {
        return Result.error();
    }

    @Override
    public Result getOrderLogistics(String thirdOrderNo) {
        return Result.error();
    }

    @Override
    public Result returnOrder() {
        return Result.error();
    }

    @Override
    public Result checkBill() {
        return Result.error();
    }

    @Override
    public Result applayInvoice() {
        return Result.error();
    }

    @Override
    public Result getInvoiceDetail() {
        return Result.error();
    }

    @Override
    public Result getMsg(String type) {
        return Result.error();
    }

    @Override
    public Result delMsg(String... msgId) {
        return Result.error();
    }

    @Override
    public boolean supports(@Nonnull MarketParam marketParam) {
        this.param = marketParam;
        return marketParam.getType().equals(MarketType.JD.getType());
    }

}
