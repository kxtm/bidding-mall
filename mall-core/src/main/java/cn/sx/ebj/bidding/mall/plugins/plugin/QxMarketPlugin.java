package cn.sx.ebj.bidding.mall.plugins.plugin;

import cn.sx.ebj.bidding.mall.core.enums.MarketType;
import cn.sx.ebj.bidding.mall.core.base.Result;
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
@SuppressWarnings(value = {"rawtypes" })
public class QxMarketPlugin extends IMarketPlugin {
    protected String getToken() {
        System.out.println("齐心接口");
        return null;
    }

    @Override
    public Result getCategoryList() {
        return null;
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
        this.param=marketParam;
        return marketParam.getType().equals(MarketType.QX.getType());
    }
}
