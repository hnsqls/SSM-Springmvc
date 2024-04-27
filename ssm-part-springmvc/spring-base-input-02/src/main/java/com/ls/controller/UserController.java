package com.ls.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    /**
     * @WebSevlet (" 必须以/开头")
     * @RequstMapping(" 不要求 / 开头 ")
     *1. 精准地址  ，多个 ("地址1“，”地址2“)
     * 2. 支持模糊查询  * 任意一层字符串。但是只能一层
     * 3. RequestMapping("")可以作用在方法上，也可以作用在类上。
     *      常用的就是在类上加一层路径，在方法上在加一层路径。这样就省区了在方法上都要加上两层路径
     *
     * 4.请求方式指定
     *  get|post|put|delete
     *   @RequestMapping("/user/login") 默认任何请求方式都可以访问
     *   指定请求方式  @RequestMapping(value = "/user/login",method = RequestMethod.POST)
     *   多种方式  @RequestMapping(value = "/user/register",method = {RequestMethod.GET,RequestMethod.POST})
     *   不符合请求方式 会出现405异常。
     *
     *
     *   5.进阶注解，请求方式   只能用在方法上
     *       @PostMapping("/user/login")
     *        @RequestMapping(value = "/user/login",method = RequestMethod.POST) 等价
     *
     *
     */
    @RequestMapping(value = "/user/login") //指定访问地址，并且注册到handleMappering中
    @ResponseBody
    public String login(){
        return  "login-----";

    }

    @RequestMapping(value = "/user/register",method = {RequestMethod.GET,RequestMethod.POST}) //指定访问地址，并且注册到handleMappering中
    public String register(){
        return  "register------";

    }


}
