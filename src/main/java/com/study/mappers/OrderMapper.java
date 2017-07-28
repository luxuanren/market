package com.study.mappers;

import com.study.model.Order;

import java.util.List;

public interface OrderMapper {
    List<Order> getOrderByUserId(Integer userId);

}
