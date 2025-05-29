package cn.sx.ebj.bidding.mall.domain.request;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import java.io.Serializable;

//登录对象
public class LoginDto implements Serializable {

    //用户名:数字或字母
    @NotBlank(message = "用户名不能为空")
    @Pattern(regexp = "^[A-Za-z0-9]+$", message = "用户名不符合规则")
    private String name;
    //用户密码
    @NotBlank(message = "密码不能为空")
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[$@$!%*?&]).{8,}$", message = "密码必须包含大小写字母、数字、特殊字符")
    private String passwd;
    //验证码
    @NotBlank(message = "验证码错误")
    @Pattern(regexp = "^[A-Za-z0-9]+$", message = "验证码不符合规则")
    private String captcha;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }
}
