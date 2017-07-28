package com.study.tests;

import com.study.mappers.UserMapper;
import com.study.model.User;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        String filename = "applicationContext.xml";
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(filename);
//        GoodsMapper goodsMapper = context.getBean("goodsMapper", GoodsMapper.class);
//        Goods goods = goodsMapper.selectByPrimaryKey(10000);
//        System.out.println(goods);
//        CartItemMapper cartItemMapper = context.getBean("cartItemMapper", CartItemMapper.class);
//        List<CartItem> list = cartItemMapper.selectByPrimaryKey(1000);
//        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
//        User user = userMapper.getUserById(1000);
//        System.out.println(user);
        context.close();
    }

}
