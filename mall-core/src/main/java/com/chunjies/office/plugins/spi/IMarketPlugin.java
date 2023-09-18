package com.chunjies.office.plugins.spi;

import com.chunjies.office.common.enums.MarketType;
import org.springframework.plugin.core.Plugin;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/18
 * {@code @description}
 */
public interface IMarketPlugin extends Plugin<MarketType> {
    String getToken();
}
