package com.study.tests;

import com.study.mappers.EvaluationMapper;
import com.study.mappers.UserMapper;
import com.study.model.Evaluation;
import com.study.model.User;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args){
        String filename = "applicationContext.xml";
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(filename);
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        User user = userMapper.getUserByName("luxuanren","123");
//        System.out.println(user);
//        EvaluationMapper evaluationMapper = context.getBean("evaluationMapper", EvaluationMapper.class);
//        List<Evaluation> list = evaluationMapper.getGoodsEvaluationById(10000);
//        System.out.println(list);
//        user.getMarkList();
        context.close();
    }

}
