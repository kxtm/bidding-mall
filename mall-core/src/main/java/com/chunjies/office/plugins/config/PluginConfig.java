package com.chunjies.office.plugins.config;

import com.chunjies.office.plugins.impl.JdMarketPlugin;
import com.chunjies.office.plugins.impl.QxMarketPlugin;
import com.chunjies.office.plugins.spi.IMarketPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.plugin.core.config.EnablePluginRegistries;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/18
 * {@code @description}
 */
@Configuration
@EnablePluginRegistries(IMarketPlugin.class)
public class PluginConfig {

    @Bean
    public JdMarketPlugin jdMarketPlugin() {
        return new JdMarketPlugin();
    }

    @Bean
    public QxMarketPlugin qxMarketPlugin() {
        return new QxMarketPlugin();
    }

}
