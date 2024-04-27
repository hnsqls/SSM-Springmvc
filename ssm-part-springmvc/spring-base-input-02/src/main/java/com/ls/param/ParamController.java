package com.ls.param;

import com.ls.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 参数的接收
 *
 */

@Controller
@RequestMapping("/param")
public class ParamController {

    //直接接受 param   /param/data?name=hnsqls&age=21
    // 1.方法参数名要和param属性名相同
    // *   2.不传值不报错
    @RequestMapping(value = "/data",method = RequestMethod.GET)
    @ResponseBody
    public String data(String name,int age){
        System.out.println("name = " + name + ", age = " + age);
        return "name = " + name + ", age = " + age;
    }


    /**  注解接收 @RequestParam
     *   参数名和param属性名不一致，可以使用@RequestParam注解，与之匹配
     * @RequestParam只能在参数上使用
     *  可以限制，那些值是必须传的,那些是不穿值的
     *          默认是必须  若没传值会报400错误。
     *          使用了该注解还想不必须传值需要设置属性，还可以设置默认值 ,@RequestParam(required = false,defaultValue = "1")
     */

    // /param/data1?username=root&password=1234
    @GetMapping("/data1")
    @ResponseBody
    public String data1(@RequestParam(value = "name") String username,@RequestParam(required = false,defaultValue = "1") String password){
        System.out.println("username = " + username + ", password = " + password);
        return "username = " + username + ", password = " + password;
    }


    /** 特殊值
     *  一key 对多个value 如列表的值hbs=唱&hbs=跳&hbs=rap
     * 使用@RequsetParam 用List接受参数
     *
     *
     * 实体类对象接受值   用户注册（用户的信息） ----》对应的实体类
     *      实体对象属性和param key相同,和对应的get|set方法。---------》形参列表声明实体对象即可。

     */

    //param  /param/data2?hbs=唱&hbs=跳&hbs=rap
    @GetMapping("/data2")
    @ResponseBody
    public  String data2(@RequestParam List<String> hbs){
        System.out.println("hbs = " + hbs);
        return "ok";
    }



    //param  /param/data3?name=hnsqls&password=123456
    @RequestMapping("/data3")
    @ResponseBody
    public  String data3(User user){
        System.out.println("user = " + user);
        return user.toString();
    }
}
