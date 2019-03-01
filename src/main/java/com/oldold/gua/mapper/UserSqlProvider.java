package com.oldold.gua.mapper;

import com.oldold.gua.domain.User;
import org.apache.ibatis.jdbc.SQL;

public class UserSqlProvider {

    public String insertSelective(User record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("user");

        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }

        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }

        if (record.getPassword() != null) {
            sql.VALUES("password", "#{password,jdbcType=VARCHAR}");
        }
        sql.VALUES("createtime",(record.getCreatetime() !=null)?"#{createtime,jdbcType=TIMESTAMP}":"NOW()");


        System.out.println(sql.toString());

        return sql.toString();
    }
}