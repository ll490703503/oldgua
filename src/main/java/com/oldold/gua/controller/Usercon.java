package com.oldold.gua.controller;

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
@RequestMapping(value = "/api")
public class Usercon {
    protected Logger logger = LoggerFactory.getLogger(Usercon.class);

    @Autowired
    UserService userService;

    @GetMapping(value = "/user/{id}")
    public List<User> getUserList(@PathVariable("id") Long id){
        return userService.getUserList(id);
    }


    @PostMapping(value = "/add")
    public int addUser(@RequestParam int id, @RequestParam String name, String password, Date creatime) {
        User users = new User();
        users.setId(id);
        users.setPassword(password);
        users.setName(name);
        users.setCreatetime(creatime);
        int idNum = userService.addUser(users);
        return idNum;


    }


    @PostMapping(value = "/Getalluser")
    public PageInfo<Map<String,Object>> getAllUser(@RequestParam int page, int pagesize) {
        PageInfo<Map<String,Object>> userPageInfo = userService.getAll(page, pagesize);
        return userPageInfo;
    }


}




