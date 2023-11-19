package com.chunjies.office.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@ApiModel("登录模型")
public class LoginUser implements Serializable {

    @ApiModelProperty(value = "用户名:数字或字母", required = true)
    @Pattern(regexp = "^[A-Za-z0-9]+$",  message = "用户名或密码错误")
    private String userName;
    @ApiModelProperty(value = "用户密码", required = true)
    @NotBlank(message = "用户名或密码错误")
    private String passwd;
    @ApiModelProperty(value = "验证码", required = true)
    @NotBlank(message = "验证码格式错误")
    private String code;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
