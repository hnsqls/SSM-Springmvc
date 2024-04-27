package com.ls.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloSpringMVC {

    @RequestMapping("springmvc/hello")//对外的访问路径。到handlerMapping注册的注解
    @ResponseBody  //直接返回字符串给前端，不找试图解析器
    public  String hello(){
        System.out.println("Controller----------");
        return "Hello SpringMVc!";
    }
}
