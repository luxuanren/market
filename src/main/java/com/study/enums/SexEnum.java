package com.study.enums;

import org.apache.ibatis.type.Alias;

@Alias("sex")
public enum SexEnum {
    Male(1, "男"),
    Female(2, "女");

    private int id;
    private String name;

    SexEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static SexEnum getSex(int id) {
        if (id == 1) {
            return SexEnum.Male;
        } else if (id == 2) {
            return SexEnum.Female;
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
