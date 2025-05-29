package cn.sx.ebj.bidding.mall.data.entity;

import cn.sx.ebj.bidding.mall.core.base.IEntity;

public class UserOrg extends IEntity {

    private String userId;

    private String orgId;

    private Integer orgDefault;

    private Integer sortNum;

    private String orgSeq;

    private String orgSeqCn;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public Integer getOrgDefault() {
        return orgDefault;
    }

    public void setOrgDefault(Integer orgDefault) {
        this.orgDefault = orgDefault;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    public String getOrgSeq() {
        return orgSeq;
    }

    public void setOrgSeq(String orgSeq) {
        this.orgSeq = orgSeq;
    }

    public String getOrgSeqCn() {
        return orgSeqCn;
    }

    public void setOrgSeqCn(String orgSeqCn) {
        this.orgSeqCn = orgSeqCn;
    }
}