package cn.sx.ebj.bidding.mall.core.base;

import java.util.Date;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/15
 * {@code @description}
 */
public abstract class IEntity {
    //序列主键 无意义不要当业务主键，不要传给接口
    private Long id;
    private String createPk;
    private String createBy;
    private Date createTime;
    private String modifyPk;
    private String modifyBy;
    private Date modifyTime;
    //乐观锁设置，当前无用
    private int version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatePk() {
        return createPk;
    }

    public void setCreatePk(String createPk) {
        this.createPk = createPk;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifyPk() {
        return modifyPk;
    }

    public void setModifyPk(String modifyPk) {
        this.modifyPk = modifyPk;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
