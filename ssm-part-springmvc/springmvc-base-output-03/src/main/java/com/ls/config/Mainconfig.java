package com.ls.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 主要配置类
 */

@EnableWebMvc
@ComponentScan("com.ls.controller")
@Configuration
public class Mainconfig implements WebMvcConfigurer {
    //视图解析器 指定前后缀


    // 重写视图解析器   配置前缀 后缀
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views/",".jsp");
        //handle -> return xxx -->字符串拼接  /WEB-INF/views/xxx.jsp
    }

    //静态资源处理器
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
