package com.ls.controller;

import com.ls.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 返回json数据 , ---->前后端分离
 *  1.@ResponseBody  不找视图解析器，直接放入响应体返回
 *  2. 直接返回实体类，由handlerAdopter 处理为json对象（有json依赖，以及配置给了handlerAdopter）
 *  3. @Controller + @ResponseBody  = @RestController
 */
@Controller
@RequestMapping("/json")
public class JsonController  {
    @ResponseBody
    @RequestMapping("/user")
    public User user(){
        User user = new User();
        user.setAge(21);
        user.setName("hnsqls");
        return  user;
    }

    @ResponseBody
    @RequestMapping("/user2")
    public List<User> user2(){
        User user = new User();
        user.setAge(21);
        user.setName("hnsqls");
        List<User> users = new ArrayList<>();
        users.add(user);
        return  users;
    }

}
