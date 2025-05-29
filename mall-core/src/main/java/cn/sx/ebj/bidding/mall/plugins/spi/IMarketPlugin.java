package cn.sx.ebj.bidding.mall.plugins.spi;

import cn.sx.ebj.bidding.mall.core.base.Result;
import cn.sx.ebj.bidding.mall.plugins.model.OrderRequest;
import cn.sx.ebj.bidding.mall.plugins.model.MarketParam;
import cn.sx.ebj.bidding.mall.plugins.model.OrderResponse;
import cn.sx.ebj.bidding.mall.core.cache.RedisCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.plugin.core.Plugin;



/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/18
 * {@code @description}
 */

public abstract class IMarketPlugin implements Plugin<MarketParam> {
    protected RedisCache redisCache;
    protected Logger log = LoggerFactory.getLogger(getClass());
    protected MarketParam param;

    //获取token
    protected abstract String getToken();

    //获取商品分类
    public abstract Result getCategoryList();

    //根据分类获取下面商品
    public abstract Result getSkuList(String CategoryId);

    //获取商品详情
    public abstract Result getSKuDetail(String skuId);

    //获取商品主图集合
    public abstract Result getSkuImgList(String skuId);

    //获取SKU价格
    public abstract Result getSkuPrice(String skuId);

    //获取商品
    public abstract Result getSkuStock(String skuId);

    //获取商品状态
    public abstract Result querySkuState(String skuId);

    //创建订单
    public abstract Result<OrderResponse> createOrder(OrderRequest orderRequest);

    //确认订单
    public abstract Result confirmOrder(String thirdOrderNo);

    //取消订单
    public abstract Result cancelOrder(String thirdOrderNo);

    //获取拆单信息
    public abstract Result getOrderSplit(String thirdOrderNo);

    //签收订单
    public abstract Result confirmReceived(String thirdOrderNo);

    //获取物流信息
    public abstract Result getOrderLogistics(String thirdOrderNo);

    //售后服务相关
    //退货接口  type 1 退订单  2退单个商品
    public abstract Result returnOrder();

    //对账
    public abstract Result checkBill();

    //申请开票
    public abstract Result applayInvoice();

    //获取发票信息
    public abstract Result getInvoiceDetail();

    //获取对账信息

    //获取所有消息
    public abstract Result getMsg(String type);

    //根据消息Id删除消息
    public abstract Result delMsg(String... msgId);

    protected MarketParam getParam() {
        return param;
    }

    protected void setParam(MarketParam param) {
        this.param = param;
    }

    @Autowired
    public void setRedisService(RedisCache redisCache) {
        this.redisCache = redisCache;
    }
}
