package cn.sx.ebj.bidding.mall.data.entity;

import cn.sx.ebj.bidding.mall.core.base.IEntity;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/15
 * {@code @description}
 */
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNameEnc() {
        return userNameEnc;
    }

    public void setUserNameEnc(String userNameEnc) {
        this.userNameEnc = userNameEnc;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserEmailEnc() {
        return userEmailEnc;
    }

    public void setUserEmailEnc(String userEmailEnc) {
        this.userEmailEnc = userEmailEnc;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserTelEnc() {
        return userTelEnc;
    }

    public void setUserTelEnc(String userTelEnc) {
        this.userTelEnc = userTelEnc;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserMobileEnc() {
        return userMobileEnc;
    }

    public void setUserMobileEnc(String userMobileEnc) {
        this.userMobileEnc = userMobileEnc;
    }
}
