package com.ls.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 *  controller handlerMapping handlerAdapter 核心组件加入到ioc容器
 */
@EnableWebMvc //配置给handleAdopter 处理json格式数据的能力
@Configuration
@ComponentScan({"com.ls.param","com.ls.path","com.ls.controller","com.ls.json"})
public class MainConfig {

    @Bean
    public RequestMappingHandlerMapping handlerMapping(){
        return  new RequestMappingHandlerMapping();
    }

    @Bean
    public RequestMappingHandlerAdapter handlerAdapter(){
        return  new RequestMappingHandlerAdapter();
    }


}
