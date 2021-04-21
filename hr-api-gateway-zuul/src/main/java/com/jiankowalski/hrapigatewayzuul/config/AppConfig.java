package com.jiankowalski.hrapigatewayzuul.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
@RefreshScope
public class AppConfig {

    @Value("${jwt.secret}")
    private String jwtSecret;

    @Bean
    public JwtAccessTokenConverter accessTokenConverter(){
        var token = new JwtAccessTokenConverter();
        token.setSigningKey(jwtSecret);
        return token;
    }

    @Bean
    public JwtTokenStore tokenStore(){
        return new JwtTokenStore(accessTokenConverter());
    }
    
    
}
