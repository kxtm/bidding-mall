package com.chunjies.office.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/19
 * {@code @description}
 */
@Configuration
public class Knife4jConfig {

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.any())//匹配所有路径
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("office-mall接口文档").description("商城接口文档").build();
    }
}
