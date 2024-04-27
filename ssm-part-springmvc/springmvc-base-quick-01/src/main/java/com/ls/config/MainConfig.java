package com.ls.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 *  1. controller 配置到ioc容器
 *  2. handlerMapping  handleAdapter 加入到ioc容器
 */
@Configuration
@ComponentScan("com.ls.controller")
public class MainConfig {

    @Bean
    public RequestMappingHandlerMapping handlerMapping(){
        return  new RequestMappingHandlerMapping();
    }

    @Bean
    public  RequestMappingHandlerAdapter handlerAdapter(){
        return new RequestMappingHandlerAdapter();

    }

}
