package com.study.mappers;

import com.study.model.CartItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartItemMapper {

    List<CartItem> selectByPrimaryKey(Integer userId);

    List<CartItem> selectCartByUserId(Integer userId);

    int updateByPrimaryKey(CartItem cartItem);

    int deleteByPrimaryKey(@Param("userId") Integer userId, @Param("goodsId") Integer goodsId);

    int saveCartItem(CartItem cartItem);
}
