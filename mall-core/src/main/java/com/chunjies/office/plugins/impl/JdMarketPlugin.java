package com.chunjies.office.plugins.impl;

import com.chunjies.office.plugins.spi.MarketPlugin;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/18
 * {@code @description}
 */
public class JdMarketPlugin implements MarketPlugin {
    @Override
    public String getToken(String msg) {
        if(supports(msg)){
            System.out.printf("京东接口地址");
        }
        return msg;
    }

    @Override
    public boolean supports(String s) {
        return s.startsWith("139");
    }
}
