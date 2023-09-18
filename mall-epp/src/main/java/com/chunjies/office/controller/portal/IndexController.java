package com.chunjies.office.controller.portal;

import com.chunjies.office.common.base.IController;
import com.chunjies.office.common.utils.Result;
import com.chunjies.office.plugins.spi.MarketPlugin;
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


   private PluginRegistry<MarketPlugin, String> registry;
    @GetMapping("/")
    public ResponseEntity index() {
        List<MarketPlugin> plugins = registry.getPlugins();
        for (MarketPlugin plugin : plugins) {
            plugin.getToken("1391xxxxxxxx");
            plugin.getToken("1381xxxxxxxx");
        }
        return ResponseEntity.ok(new Result());
    }


    @Autowired
    public void setRegistry(PluginRegistry<MarketPlugin, String> registry) {
        this.registry = registry;
    }
}
