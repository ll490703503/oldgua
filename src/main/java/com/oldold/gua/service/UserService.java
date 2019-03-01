package com.oldold.gua.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.oldold.gua.domain.User;
import com.oldold.gua.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.*;

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
        System.out.println(record);
        int id = userMapper.insertSelective(record);
        return id;

    }


    public PageInfo<Map<String, Object>> getAll(int page, int pagesize) {
        PageHelper.startPage(page, pagesize);
        List<Map<String, Object>> list = userMapper.getAll();
        PageInfo<Map<String, Object>> userPageInfo = new PageInfo<>(list);
        return userPageInfo;
    }

    public List<User> getUserList(Long id) {
        return userMapper.getUserList(id);
    }
}
