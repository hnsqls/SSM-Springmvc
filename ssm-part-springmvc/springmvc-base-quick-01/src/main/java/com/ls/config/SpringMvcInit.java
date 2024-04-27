package com.ls.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 可以被web项目加载，会初始化ioc容器，会设置dispatcherServlet 的地址
 */
public class SpringMvcInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    //设置项目对应的配置
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MainConfig.class};
    }

    //配置springmvc内部自带servlet的访问地址！
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
