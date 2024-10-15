package cn.sx.ebj.bidding.mall.face;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/20
 * {@code @description}
 */


@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableTransactionManagement
@EnableCaching
public class MallJobBoot {
    public static void main(String[] args) {
        SpringApplication.run(MallJobBoot.class, args);
    }

}
