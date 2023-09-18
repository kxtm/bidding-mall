package com.chunjies.office.plugins.impl;

import com.chunjies.office.common.enums.MarketType;
import com.chunjies.office.plugins.spi.IMarketPlugin;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/18
 * {@code @description}
 */
public class QxMarketPlugin implements IMarketPlugin {

    @Override
    public String getToken() {
        System.out.println("齐心接口");
        return null;
    }

    @Override
    public boolean supports(MarketType marketType) {
        return marketType.getType().equals(MarketType.QX.getType());
    }
}