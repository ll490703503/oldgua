package com.oldold.gua.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.oldold.gua.domain.User;
import com.oldold.gua.service.UserService;
import com.oldold.gua.util.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

/**
 * @Description
 * @auther panwang1
 * @create 2019-02-14 15:10
 */

@RestController
@RequestMapping(value = "/api")
public class Usercon {
    protected Logger logger = LoggerFactory.getLogger(Usercon.class);

    @Autowired
    UserService userService;

    @Resource
    RedisUtil redisUtil;

    @GetMapping(value = "/user/{id}")
    public List<User> getUserList(@PathVariable("id") Long id){
        return userService.getUserList(id);
    }


    @PostMapping(value = "/add")
    public int addUser( @RequestParam String name, String password, Date creatime) {
        User users = new User();
        users.setPassword(password);
        users.setName(name);
        users.setCreatetime(creatime);
        redisUtil.set(name,new JSONObject().toJSONString(users));
        int idNum = userService.addUser(users);
        return idNum;

    }

    @GetMapping(value = "/getcache")
    public String getCache(String name){
        return redisUtil.get(name);
    }


    @PostMapping(value = "/Getalluser")
    public PageInfo<Map<String,Object>> getAllUser(@RequestParam int page, int pagesize) {
        PageInfo<Map<String,Object>> userPageInfo = userService.getAll(page, pagesize);
        return userPageInfo;
    }




}




