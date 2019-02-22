package com.oldold.gua.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.oldold.gua.domain.User;
import com.oldold.gua.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @auther panwang1
 * @create 2019-02-14 14:47
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    @Transactional
    public int addUser(User user) {
        User record = new User();
        record.setId(user.getId());
        record.setName(user.getName());
        record.setPassword(user.getPassword());
        record.setCreatetime(user.getCreatetime());
        int id = userMapper.insert(record);
        return id;


    }



    public PageInfo<com.oldold.gua.domain.User> getAll(int page,int pagesize) {

        PageHelper.startPage(page,pagesize);

        List<com.oldold.gua.domain.User> list = userMapper.getAll();

        PageInfo<com.oldold.gua.domain.User> userPageInfo = new PageInfo<com.oldold.gua.domain.User>(list);



        return userPageInfo;
    }
}
