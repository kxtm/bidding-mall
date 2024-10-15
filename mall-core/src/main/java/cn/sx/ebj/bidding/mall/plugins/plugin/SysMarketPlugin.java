package cn.sx.ebj.bidding.mall.plugins.plugin;

import cn.sx.ebj.bidding.mall.core.base.Result;
import cn.sx.ebj.bidding.mall.core.enums.MarketType;
import cn.sx.ebj.bidding.mall.plugins.model.MarketParam;
import cn.sx.ebj.bidding.mall.plugins.model.OrderRequest;
import cn.sx.ebj.bidding.mall.plugins.model.OrderResponse;
import cn.sx.ebj.bidding.mall.plugins.spi.IMarketPlugin;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;


/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/19
 * {@code @description} 系统公共接口仅供外部对接使用
 */
@Component
@SuppressWarnings(value = {"rawtypes"})
public class SysMarketPlugin extends IMarketPlugin {
    @Override
    protected String getToken() {
        Assert.notNull(this.redisCache, "不能为空");
        log.error("公共获取Token请求-》{}", getParam().getType());
        return "";
    }

    @Override
    public Result getCategoryList() {
        return Result.error();
    }

    @Override
    public Result getSkuList(String CategoryId) {
        return null;
    }

    @Override
    public Result getSKuDetail(String skuId) {
        return null;
    }

    @Override
    public Result getSkuImgList(String skuId) {
        return null;
    }

    @Override
    public Result getSkuPrice(String skuId) {
        return null;
    }

    @Override
    public Result getSkuStock(String skuId) {
        return null;
    }

    @Override
    public Result querySkuState(String skuId) {
        return null;
    }

    @Override
    public Result<OrderResponse> createOrder(OrderRequest orderRequest) {
        getToken();
        return Result.error();
    }

    @Override
    public Result confirmOrder(String thirdOrderNo) {
        return null;
    }

    @Override
    public Result cancelOrder(String thirdOrderNo) {
        return null;
    }

    @Override
    public Result getOrderSplit(String thirdOrderNo) {
        return null;
    }

    @Override
    public Result confirmReceived(String thirdOrderNo) {
        return null;
    }

    @Override
    public Result getOrderLogistics(String thirdOrderNo) {
        return null;
    }

    @Override
    public Result returnOrder() {
        return null;
    }

    @Override
    public Result checkBill() {
        return null;
    }

    @Override
    public Result applayInvoice() {
        return null;
    }

    @Override
    public Result getInvoiceDetail() {
        return null;
    }

    @Override
    public Result getMsg(String type) {
        return null;
    }

    @Override
    public Result delMsg(String... msgId) {
        return null;
    }

    @Override
    public boolean supports(@NonNull MarketParam marketParam) {
        this.param = marketParam;
        return marketParam.getType().equals(MarketType.SYS.getType());
    }
}
