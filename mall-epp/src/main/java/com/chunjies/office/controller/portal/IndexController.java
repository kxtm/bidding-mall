package com.chunjies.office.controller.portal;

import com.chunjies.office.common.base.IController;
import com.chunjies.office.common.enums.MarketType;
import com.chunjies.office.common.utils.Result;
import com.chunjies.office.plugins.spi.IMarketPlugin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.plugin.core.PluginRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/15
 * {@code @description}
 */
@RestController
public class IndexController extends IController {


    private PluginRegistry<IMarketPlugin, MarketType> registry;

    @GetMapping("/")
    public ResponseEntity index() {
        IMarketPlugin plugin= registry.getPluginFor(MarketType.JD).get();
        plugin.getToken();
        return ResponseEntity.ok(new Result());
    }


    @Autowired
    public void setRegistry(PluginRegistry<IMarketPlugin, MarketType> registry) {
        this.registry = registry;
    }
}
