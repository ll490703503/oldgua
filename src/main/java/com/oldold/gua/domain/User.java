package com.oldold.gua.domain;

import java.io.Serializable;
import java.util.Date;


public class User implements Serializable {


    private static final long serialVersionUID = 567634563196102957L;

    public User(){};

    public User(Integer id,String name){};

    private Integer id;

    private String name;

    private String password;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name='" + name + '\'' + ", password='" + password + '\'' + ", createtime=" + createtime + '}';
    }
}