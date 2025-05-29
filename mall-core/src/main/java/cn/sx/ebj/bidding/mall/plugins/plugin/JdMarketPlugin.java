package cn.sx.ebj.bidding.mall.plugins.plugin;

import cn.sx.ebj.bidding.mall.core.base.Result;
import cn.sx.ebj.bidding.mall.core.enums.MarketType;
import cn.sx.ebj.bidding.mall.plugins.model.MarketParam;
import cn.sx.ebj.bidding.mall.plugins.model.OrderRequest;
import cn.sx.ebj.bidding.mall.plugins.model.OrderResponse;
import cn.sx.ebj.bidding.mall.plugins.spi.IMarketPlugin;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/18
 * {@code @description}
 */
@Component
@SuppressWarnings(value = {"rawtypes"})
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
    public boolean supports(@NonNull MarketParam marketParam) {
        this.param = marketParam;
        return marketParam.getType().equals(MarketType.JD.getType());
    }

}
