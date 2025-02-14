package cn.sx.ebj.bidding.mall.core.annotations;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Operate {

    //模块名称
    String module() default "";
    //功能
    String func () default "";
    //描述
    String desc() default "";
}
