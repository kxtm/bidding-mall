package com.chunjies.office.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.io.Serializable;

@Data
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

}
