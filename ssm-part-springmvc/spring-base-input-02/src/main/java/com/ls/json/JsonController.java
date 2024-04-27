package com.ls.json;

import com.ls.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/json")
public class JsonController {

    /**
     * 报错 415 不支持的类型
     * java原生api 只能处理 param方式 和路径传参方式 ，不能处理json格式
     * json 是前端的格式，java不能处理，需要引入json处理依赖，并配置给handlerAoadtor
     *          引入依赖 ： jackson
     *          配置handleadoapter   在配置类上开启@EnableWebMvc
     */
    @PostMapping("/data")
    @ResponseBody
    // data --->json---->请求体中 RequsetBody
    public  String data(@RequestBody Person person){
        System.out.println("person = " + person);
        return person.toString();

    }
}
