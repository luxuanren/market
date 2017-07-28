package com.study.enums;

public enum UserLevelEnum {
    GENERAL(1, "普通用户"),
    BRONZE(2, "铜牌用户"),
    SILVER(3, "银牌用户"),
    GOLDEN(4, "金牌用户"),
    DIAMOND(5, "钻石用户");

    private int value;
    private String name;

    UserLevelEnum(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public static UserLevelEnum getUserLevel(int level) {
        switch (level) {
        case 1:
            return GENERAL;
        case 2:
            return BRONZE;
        case 3:
            return SILVER;
        case 4:
            return GOLDEN;
        case 5:
            return DIAMOND;
        default:
            return GENERAL;
        }
    }

    public int getValue() {
        return value;
    }
}
