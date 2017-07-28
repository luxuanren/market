package com.study.model;

public class CartItem {
    private Goods Goods;

    private Integer num;

    @Override public String toString() {
        return "CartItem{" +
                "Goods=" + Goods +
                ", num=" + num +
                '}';
    }

    public Goods getGoods() {
        return Goods;
    }

    public void setGoods(Goods Goods) {
        this.Goods = Goods;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
