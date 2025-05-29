package cn.sx.ebj.bidding.mall.core.enums;


/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/18
 * {@code @description}
 */
public enum OrderStatus {
    //新建、待确认、取消、待发货、已发货、已妥投、已验收、拒收、退货、换货、待对账、对账失败、待开票、已开票、待报销、已报销
    DEFAULT(0, "新建"), CONFIRMING(1, "待确认"), CANCEL(-1, "取消"), SHIPPING(2, "待发货"), SHIPPED(3, "已发货"),
    DELIVERED(4, "已妥投"), CHECKED(5, "已验收"), REJECTION(-2, "拒收"), RETURN_GOODS(-3, "退货"), EXCHANGE_GOODS(6, "换货");

    final int status;
    final String desc;

    OrderStatus(int status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    public int getStatus() {
        return status;
    }

    public String getDesc() {
        return desc;
    }


}
