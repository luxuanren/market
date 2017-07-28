package com.study.enums;

public enum  GoodsStatusEnum {
    VALID(0, "有效商品"),
        INVALID(1, "无效商品");
    private int value;
    private String name;
    GoodsStatusEnum(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static GoodsStatusEnum getGoodsStatus(int value) {
        if (value == 0)
            return GoodsStatusEnum.VALID;
        else
            return GoodsStatusEnum.INVALID;
    }
}
