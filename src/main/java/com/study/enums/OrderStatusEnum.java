package com.study.enums;

public enum OrderStatusEnum {
    NOT_EVALUATE(0, "没有评价"),
    EVALUATED(1, "已评价");

    private int value;
    private String name;

    public int getValue() {
        return value;
    }

    OrderStatusEnum(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public static OrderStatusEnum getOrderStatusEnum(int value) {
        if (value == 0)
            return OrderStatusEnum.NOT_EVALUATE;
        else
            return OrderStatusEnum.EVALUATED;
    }

}
