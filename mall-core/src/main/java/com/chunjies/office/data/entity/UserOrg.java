package com.chunjies.office.data.entity;

import com.chunjies.office.core.base.IEntity;

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
        this.userId = userId == null ? null : userId.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
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
        this.orgSeq = orgSeq == null ? null : orgSeq.trim();
    }

    public String getOrgSeqCn() {
        return orgSeqCn;
    }

    public void setOrgSeqCn(String orgSeqCn) {
        this.orgSeqCn = orgSeqCn == null ? null : orgSeqCn.trim();
    }


}