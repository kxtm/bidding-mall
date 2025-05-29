package cn.sx.ebj.bidding.mall.core.enums;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/18
 * {@code @description}
 */
public enum MarketType {
    JD("JD", "京东"), QX("QX", "齐心"), LXWL("LXWL", "领先未来"), DL("DL", "得力"), MG("MG", "晨光"),SYS("SYS","系统自带");

    MarketType(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    private String type;
    private String desc;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
