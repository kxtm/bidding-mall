package com.chunjies.office.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // @formatter:off
        http
                .authorizeHttpRequests((authorize) -> authorize
                        .anyRequest().authenticated()
                )
                .csrf((csrf) -> csrf.ignoringAntMatchers("/login"))
                .httpBasic(Customizer.withDefaults());
                //.oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt)
                //.sessionManagement((session) -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
                //.exceptionHandling((exceptions) -> exceptions
                //        .authenticationEntryPoint(new BearerTokenAuthenticationEntryPoint())
                //        .accessDeniedHandler(new BearerTokenAccessDeniedHandler())
                //);
        // @formatter:on
        return http.build();
    }
}
