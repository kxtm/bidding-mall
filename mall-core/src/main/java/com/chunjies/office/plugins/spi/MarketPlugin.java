package com.chunjies.office.plugins.spi;

import org.springframework.plugin.core.Plugin;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/18
 * {@code @description}
 */
public interface MarketPlugin extends Plugin<String> {
    String getToken(String msg);
}
