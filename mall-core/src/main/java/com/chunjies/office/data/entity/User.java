package com.chunjies.office.data.entity;

import com.chunjies.office.core.base.IEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/15
 * {@code @description}
 */
@Getter
@Setter
public class User extends IEntity {
    private String userId;

    private String userCode;

    private String userPwd;

    private String userName;

    private String userNameEnc;

    private Integer userSex;

    private Integer userType;

    private Integer userStatus;

    private String userEmail;

    private String userEmailEnc;

    private String userTel;

    private String userTelEnc;

    private String userMobile;

    private String userMobileEnc;

}
