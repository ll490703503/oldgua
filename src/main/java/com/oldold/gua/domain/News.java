package com.oldold.gua.domain;

import java.io.Serializable;
import java.util.Date;

public class News implements Serializable{


    private static final long serialVersionUID = -5615805887619747361L;
    private Integer id;

    private String title;

    private String description;

    private Integer category;

    private String image;

    private Date addDate;

    private Date updateDate;

    private Integer state;

    private Integer commendState;

    private Integer browses;

    private Integer likes;

    private Integer comments;

    private Integer score;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getCommendState() {
        return commendState;
    }

    public void setCommendState(Integer commendState) {
        this.commendState = commendState;
    }

    public Integer getBrowses() {
        return browses;
    }

    public void setBrowses(Integer browses) {
        this.browses = browses;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}