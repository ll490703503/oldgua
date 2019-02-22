package com.oldold.gua.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.oldold.gua.domain.User;
import com.oldold.gua.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @Description
 * @auther panwang1
 * @create 2019-02-14 15:10
 */

@RestController
@RequestMapping(value = "/addUser")
public class Usercon {
    protected Logger logger = LoggerFactory.getLogger(Usercon.class);

    @Autowired
    UserService userService;


    @PostMapping(value = "/add")

    public int addUser(@RequestParam(value = "ID") int id, @RequestParam(value = "Name") String name, String password, Date creatime) {
        User users = new User();
        users.setId(id);
        users.setPassword(password);
        users.setCreatetime(new Date());
        users.setName(name);
        String s = "hahaha";
        int ids = userService.addUser(users);
        double x = 9.98D;
        String y = String.valueOf(x);
        System.out.println(y);
        return ids;


    }

    @PostMapping(value = "Getalluser")
    public PageInfo<com.oldold.gua.domain.User> getAllUser(@RequestParam(value = "pag") int page, int pagesize) {
        logger.info("saomiankaishi");
        List<com.oldold.gua.domain.User> list = new ArrayList<>();
        PageInfo<com.oldold.gua.domain.User> userPageInfo = userService.getAll(page, pagesize);
        JSONObject js = new JSONObject();
        js.put("code", 100);
        js.put("success", true);
        js.put("data", userPageInfo);
        logger.info("saomiaojieshu");
        return userPageInfo;
    }

    @GetMapping(value = "login")

    public String login(){

        return "hahah";
    }

}



