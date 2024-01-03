package com.chunjies.office;

import com.chunjies.office.plugins.spi.IMarketPlugin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.plugin.core.config.EnablePluginRegistries;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/15
 * {@code @description}
 */

@EnableCaching
@EnablePluginRegistries(IMarketPlugin.class)
@EnableAspectJAutoProxy(proxyTargetClass = true)
@SpringBootApplication
public class OfficeMallBoot {
    public static void main(String[] args) {
        SpringApplication.run(OfficeMallBoot.class, args);
    }
}