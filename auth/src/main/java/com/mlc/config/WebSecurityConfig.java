package com.mlc.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http){
//        http.csrf().disable()
//            .exceptionHandling()
//            .accessDeniedHandler(new Object())
    }
}
