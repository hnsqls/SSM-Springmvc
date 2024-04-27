package com.ls.controller;


import com.ls.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {
    /**用户数据分页展示功能（条件：page 页数 默认1，size 每页数量 默认 10）
     * 查询 GET
     * 资源不唯一 不用路径传擦， 用param传擦
     *  GET  /user?page=1&size=10
     */

    @GetMapping
    public List<User> findPageUser(@RequestParam(required = false,defaultValue = "1") int page,
                                   @RequestParam(required = false,defaultValue = "10") int size){
        System.out.println("page = " + page + ", size = " + size);
        //逻辑处理
        return null;
    }
    /**保存用户功能
     * POST  param|json（推荐）
     */
    @PostMapping
    public  User saveUser(@RequestBody User user){
        System.out.println("user = " + user);
        //处理逻辑
        return user;
    }

    /** 根据用户id查询用户详情功能
     *  GET /user/id  路径传参
     */

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User findUserById(@PathVariable int id){
        System.out.println("查询用户信息 + id = " + id);
        //处理逻辑
        return null;
    }

    /** 根据用户id更新用户数据功能
     * 更新  PUT
     * 单个标识   路径传参
     * PUT /user/id
     *
     */
    @PutMapping("/{id}")
    public User updateUserById(@PathVariable int id,@PathVariable User user){
        System.out.println("更新用户信息"+"id = " + id);
        //处理逻辑
        return null;
    }

    /**根据用户id删除用户数据功能
     * 删除 delete
     * id唯一标识  路径传参
     * DELETE /user/id
     */
    @DeleteMapping("/{id}")
    public int deleteUserById(@PathVariable int id){
        System.out.println("删除：id = " + id);
        //处理逻辑
        return 1;
    }

    /** 多条件模糊查询用户功能（条件：keyword 模糊关键字，page 页数 默认1，size 每页数量 默认 10）
     * 查询 GET
     * 标识不唯一   不适用路径传参，param传参
     * GET /user?keyword=xx&page=x&size=x
     * 需要注意的时，根据整篇标识，此时的Mapping不唯一  方式 + url
     * 需要改变url 如下/user?keyword=20&page=20&size=50
     *
     */
    @GetMapping("search")
    public List<User> findUser(String keyword,
                               @RequestParam(required = false,defaultValue = "1") int page,
                               @RequestParam(required = false,defaultValue = "10") int  size){
        System.out.println("模糊查询 keyword = " + keyword + ", page = " + page + ", size = " + size);
        //逻辑处理
        return null;
    }

}
