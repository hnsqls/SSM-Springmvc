package com.ls.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.http.HttpResponse;

@Controller
@RequestMapping("/jsp")
public class indexController {

    /**
     *  返回jsp页面
     *   1. 返回字符串类型， 于视图解析器拼接
     *   2. 不能添加@ResponseBody会直接返回给浏览器，
     *
     */

    @RequestMapping("/data")
    public  String data(HttpServletRequest request){
        request.setAttribute("data","hnsqls");
        return "index";
    }

    /**转发
     * 1. 返回字符串  ------》请求资源的地址
     * 2.return “forward:/转发地址”
     *  */

    @RequestMapping("/forward")
    public  String forward(){
        return "forward:/jsp/data";
    }

    /** 重定向
     * 1. 返回字符串 ----------》请求的资源地址
     * 2. 返回字符 return “redirect：/重定向地址”
     *
     */

    @RequestMapping("/redirect")
    public  String redirect(){

        return "redirect: /jsp/data";
    }
    /** 地址路径问题
     * 不使用springmvc   原生的request，response
     * 转发是项目下的资源跳转，路径:项目下的地址，忽略根路径
     * 重定向可以是项目以外的地址，二次请求，路径 要写根地址
     *
     * 使用springmvc
     *  forward：路径 | redirect：路径  都不需要写根路径。
     *  转发和重定向写的地址都一样，springmvc会自动给重定向添加 根地址
     *
     */
}
