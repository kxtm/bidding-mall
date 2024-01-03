package com.chunjies.office.data.entity;

import com.chunjies.office.core.base.IEntity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserOrg extends IEntity {

    private String userId;

    private String orgId;

    private Integer orgDefault;

    private Integer sortNum;

    private String orgSeq;

    private String orgSeqCn;

}