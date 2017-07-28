package com.study.enums;

public enum EvaluationStatusEnum {
    EVALUATED(0, "有效商品"),
    NOT_EVALUATE(1, "无效商品");
    private int value;
    private String name;
    EvaluationStatusEnum(int value, String name) {
        this.value = value;
        this.name = name;
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

    public int getValue() {
        return value;
    }

    public static EvaluationStatusEnum getEvaluationStatus(int value) {
        if (value == 0)
            return EvaluationStatusEnum.EVALUATED;
        else
            return EvaluationStatusEnum.NOT_EVALUATE;
    }
}
