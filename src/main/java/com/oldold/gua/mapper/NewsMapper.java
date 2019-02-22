package com.oldold.gua.mapper;

import com.oldold.gua.domain.News;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;


@Mapper
public interface NewsMapper {
    @Delete({
        "delete from news",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into news (id, title, ",
        "description, category, ",
        "image, addDate, ",
        "updateDate, state, ",
        "commendState, browses, ",
        "likes, comments, ",
        "score, content)",
        "values (#{id,jdbcType=INTEGER}, #{title,jdbcType=VARCHAR}, ",
        "#{description,jdbcType=VARCHAR}, #{category,jdbcType=INTEGER}, ",
        "#{image,jdbcType=VARCHAR}, #{addDate,jdbcType=TIMESTAMP}, ",
        "#{updateDate,jdbcType=TIMESTAMP}, #{state,jdbcType=INTEGER}, ",
        "#{commendState,jdbcType=INTEGER}, #{browses,jdbcType=INTEGER}, ",
        "#{likes,jdbcType=INTEGER}, #{comments,jdbcType=INTEGER}, ",
        "#{score,jdbcType=INTEGER}, #{content,jdbcType=LONGVARCHAR})"
    })
    int insert(News record);

    @InsertProvider(type=NewsSqlProvider.class, method="insertSelective")
    int insertSelective(News record);

    @Select({
        "select",
        "id, title, description, category, image, addDate, updateDate, state, commendState, ",
        "browses, likes, comments, score, content",
        "from news",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="category", property="category", jdbcType=JdbcType.INTEGER),
        @Result(column="image", property="image", jdbcType=JdbcType.VARCHAR),
        @Result(column="addDate", property="addDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updateDate", property="updateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="state", property="state", jdbcType=JdbcType.INTEGER),
        @Result(column="commendState", property="commendState", jdbcType=JdbcType.INTEGER),
        @Result(column="browses", property="browses", jdbcType=JdbcType.INTEGER),
        @Result(column="likes", property="likes", jdbcType=JdbcType.INTEGER),
        @Result(column="comments", property="comments", jdbcType=JdbcType.INTEGER),
        @Result(column="score", property="score", jdbcType=JdbcType.INTEGER),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    News selectByPrimaryKey(Integer id);

    @UpdateProvider(type=NewsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(News record);

    @Update({
        "update news",
        "set title = #{title,jdbcType=VARCHAR},",
          "description = #{description,jdbcType=VARCHAR},",
          "category = #{category,jdbcType=INTEGER},",
          "image = #{image,jdbcType=VARCHAR},",
          "addDate = #{addDate,jdbcType=TIMESTAMP},",
          "updateDate = #{updateDate,jdbcType=TIMESTAMP},",
          "state = #{state,jdbcType=INTEGER},",
          "commendState = #{commendState,jdbcType=INTEGER},",
          "browses = #{browses,jdbcType=INTEGER},",
          "likes = #{likes,jdbcType=INTEGER},",
          "comments = #{comments,jdbcType=INTEGER},",
          "score = #{score,jdbcType=INTEGER},",
          "content = #{content,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(News record);

    @Update({
        "update news",
        "set title = #{title,jdbcType=VARCHAR},",
          "description = #{description,jdbcType=VARCHAR},",
          "category = #{category,jdbcType=INTEGER},",
          "image = #{image,jdbcType=VARCHAR},",
          "addDate = #{addDate,jdbcType=TIMESTAMP},",
          "updateDate = #{updateDate,jdbcType=TIMESTAMP},",
          "state = #{state,jdbcType=INTEGER},",
          "commendState = #{commendState,jdbcType=INTEGER},",
          "browses = #{browses,jdbcType=INTEGER},",
          "likes = #{likes,jdbcType=INTEGER},",
          "comments = #{comments,jdbcType=INTEGER},",
          "score = #{score,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(News record);
}