package com.study.model;

import java.util.Date;

public class Evaluation {
    private Integer id;
    private Integer orderId;
    private Integer orderIndex;
    private Integer userId;
    private String username;
    private Integer goodsId;
    private Date evalTime;
    private String evalInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getEvalTime() {
        return evalTime;
    }

    public void setEvalTime(Date evalTime) {
        this.evalTime = evalTime;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getEvalInfo() {
        return evalInfo;
    }

    public void setEvalInfo(String evalInfo) {
        this.evalInfo = evalInfo;
    }

    @Override public String toString() {
        return "Evaluation{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", orderIndex=" + orderIndex +
                ", userId=" + userId +
                ", username='" + username + '\'' +
                ", goodsId=" + goodsId +
                ", evalTime=" + evalTime +
                ", evalInfo='" + evalInfo + '\'' +
                '}';
    }
}
