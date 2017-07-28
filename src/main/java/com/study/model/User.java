package com.study.model;

import com.study.enums.SexEnum;
import com.study.enums.UserLevelEnum;

import java.util.List;

public class User {

    private Integer id;
    private String name;
    private String email;
    private Integer age;
    private SexEnum sex;
    private String password;
    private UserLevelEnum level;
    private Double integral;
    private List<CartItem> cartList;
    private List<Goods> markList;

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;

        User user = (User) o;

        if (!name.equals(user.name))
            return false;
        if (!email.equals(user.email))
            return false;
        if (age != null ? !age.equals(user.age) : user.age != null)
            return false;
        if (sex != user.sex)
            return false;
        if (!password.equals(user.password))
            return false;
        if (level != user.level)
            return false;
        return true;
    }

    @Override public int hashCode() {
        int result = email.hashCode();
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + password.hashCode();
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (integral != null ? integral.hashCode() : 0);
        return result;
    }

    @Override public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", sex=" + sex +
                ", level=" + level +
                ", integral=" + integral +
                ", cartList=" + cartList +
                ", markList=" + markList +
                '}';
    }

    public List<CartItem> getCartList() {
        return cartList;
    }

    public void setCartList(List<CartItem> cartList) {
        this.cartList = cartList;
    }

    public List<Goods> getMarkList() {
        return markList;
    }

    public void setMarkList(List<Goods> markList) {
        this.markList = markList;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserLevelEnum getLevel() {
        return level;
    }

    public void setLevel(UserLevelEnum level) {
        this.level = level;
    }

    public Double getIntegral() {
        return integral;
    }

    public void setIntegral(Double integral) {
        this.integral = integral;
    }
}
