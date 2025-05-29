package cn.sx.ebj.bidding.mall.core.enums;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/10/9
 * {@code @description}
 */
public enum UserState {
    FREEZE(-1, "冻结"), DISABLE(0, "禁用"), ENABLE(1, "正常");

    private int status;

    private String desc;

    UserState(int status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
