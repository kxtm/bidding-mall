package com.chunjies.office.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/19
 * {@code @description}
 */
@Configuration
public class Knife4jConfig {

    @Bean
    public OpenAPI docket() {

        return new OpenAPI().info(new Info().title("office-mall接口文档").description("office-mall接口文档").version("1.0").contact(new Contact().name("春杰科技").email("sale@chunjie.shop")));

    }
}
