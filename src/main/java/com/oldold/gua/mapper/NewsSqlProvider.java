package com.oldold.gua.mapper;

import com.oldold.gua.domain.News;
import org.apache.ibatis.jdbc.SQL;

public class NewsSqlProvider {

    public String insertSelective(News record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("news");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getTitle() != null) {
            sql.VALUES("title", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            sql.VALUES("description", "#{description,jdbcType=VARCHAR}");
        }
        
        if (record.getCategory() != null) {
            sql.VALUES("category", "#{category,jdbcType=INTEGER}");
        }
        
        if (record.getImage() != null) {
            sql.VALUES("image", "#{image,jdbcType=VARCHAR}");
        }
        
        if (record.getAddDate() != null) {
            sql.VALUES("addDate", "#{addDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateDate() != null) {
            sql.VALUES("updateDate", "#{updateDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getState() != null) {
            sql.VALUES("state", "#{state,jdbcType=INTEGER}");
        }
        
        if (record.getCommendState() != null) {
            sql.VALUES("commendState", "#{commendState,jdbcType=INTEGER}");
        }
        
        if (record.getBrowses() != null) {
            sql.VALUES("browses", "#{browses,jdbcType=INTEGER}");
        }
        
        if (record.getLikes() != null) {
            sql.VALUES("likes", "#{likes,jdbcType=INTEGER}");
        }
        
        if (record.getComments() != null) {
            sql.VALUES("comments", "#{comments,jdbcType=INTEGER}");
        }
        
        if (record.getScore() != null) {
            sql.VALUES("score", "#{score,jdbcType=INTEGER}");
        }
        
        if (record.getContent() != null) {
            sql.VALUES("content", "#{content,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(News record) {
        SQL sql = new SQL();
        sql.UPDATE("news");
        
        if (record.getTitle() != null) {
            sql.SET("title = #{title,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            sql.SET("description = #{description,jdbcType=VARCHAR}");
        }
        
        if (record.getCategory() != null) {
            sql.SET("category = #{category,jdbcType=INTEGER}");
        }
        
        if (record.getImage() != null) {
            sql.SET("image = #{image,jdbcType=VARCHAR}");
        }
        
        if (record.getAddDate() != null) {
            sql.SET("addDate = #{addDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateDate() != null) {
            sql.SET("updateDate = #{updateDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getState() != null) {
            sql.SET("state = #{state,jdbcType=INTEGER}");
        }
        
        if (record.getCommendState() != null) {
            sql.SET("commendState = #{commendState,jdbcType=INTEGER}");
        }
        
        if (record.getBrowses() != null) {
            sql.SET("browses = #{browses,jdbcType=INTEGER}");
        }
        
        if (record.getLikes() != null) {
            sql.SET("likes = #{likes,jdbcType=INTEGER}");
        }
        
        if (record.getComments() != null) {
            sql.SET("comments = #{comments,jdbcType=INTEGER}");
        }
        
        if (record.getScore() != null) {
            sql.SET("score = #{score,jdbcType=INTEGER}");
        }
        
        if (record.getContent() != null) {
            sql.SET("content = #{content,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}