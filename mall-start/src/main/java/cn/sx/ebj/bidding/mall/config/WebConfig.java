package cn.sx.ebj.bidding.mall.config;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.hibernate.validator.HibernateValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



/**
 * {@code @author} chunjie
 * {@code @time} 2023/9/15
 * {@code @description}
 */

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public AuthConfig authConfig() {
        return new AuthConfig();
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowCredentials(true).allowedOriginPatterns("*").allowedHeaders("*").allowedMethods("GET", "POST");
        WebMvcConfigurer.super.addCorsMappings(registry);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authConfig()).addPathPatterns("/**").excludePathPatterns("/auth/login", "/auth/captcha");
        WebMvcConfigurer.super.addInterceptors(registry);
    }


    @Bean
    ValidatorFactory validatorFactory() {
        return Validation.byProvider(HibernateValidator.class).configure().failFast(true).buildValidatorFactory();
    }

    @Bean
    public Validator validator(ValidatorFactory validatorFactory) {
        return validatorFactory.getValidator();
    }
}
