package com.study.model;

import com.study.enums.GoodsStatusEnum;

public class Goods {

    private Integer id;
    private String name;
    private Double price;
    private Integer inventory;
    private GoodsStatusEnum status;
    private String title;
    private String detail;

    @Override public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", inventory=" + inventory +
                ", status=" + status +
                ", title='" + title + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }

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
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public GoodsStatusEnum getStatus() {
        return status;
    }

    public void setStatus(GoodsStatusEnum status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
