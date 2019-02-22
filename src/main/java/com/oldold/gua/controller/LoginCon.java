package com.oldold.gua.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @auther panwang1
 * @create 2019-02-22 13:42
 */




@RestController

public class LoginCon {
    @RequestMapping(value = "/login")

    public String Login(){
        return "hahaha";
    }
}
