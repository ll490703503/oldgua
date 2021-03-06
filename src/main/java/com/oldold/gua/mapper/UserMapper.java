package com.oldold.gua.mapper;

import com.oldold.gua.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper

public interface UserMapper {
    @Insert({
        "insert into user (id, name, ",
        "password, createtime)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{createtime,jdbcType=TIMESTAMP})"
    })
    int insert(User record);

    @Select({
            "select id,name from user"
    })
    List<Map<String,Object>> getAll();

    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    int insertSelective(User record);

    @Select({
            "select * from user where id = #{id}"
    })
    List<User> getUserList(Long id);
}