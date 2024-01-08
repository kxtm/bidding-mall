package com.chunjies.office.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import java.io.Serializable;

@Schema(name = "登录对象")
public class LoginDto implements Serializable {

    @SchemaProperty(name = "用户名:数字或字母")
    @Pattern(regexp = "^[A-Za-z0-9]+$", message = "用户名或密码错误")
    private String userName;
    @SchemaProperty(name = "用户密码")
    @NotBlank(message = "用户名或密码错误")
    private String passwd;
    @SchemaProperty(name = "验证码")
    @NotBlank(message = "验证码错误")
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
