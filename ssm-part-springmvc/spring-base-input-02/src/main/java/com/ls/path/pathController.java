package com.ls.path;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 路径参数演示
 */


@Controller
@RequestMapping("/path")
@ResponseBody
public class pathController {


    //param   /param/path/hnsql/123456   --->name = hnsqls, password = 123456
    @RequestMapping("{name}/{password}")
    public  String login(@PathVariable String name,  @PathVariable String password){
        System.out.println("name = " + name + ", password = " + password);
        return "name = " + name + ", password = " + password;

    }
}
