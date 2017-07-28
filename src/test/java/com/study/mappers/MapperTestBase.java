package com.study.mappers;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapperTestBase {
    private static String contextPath = "applicationContext.xml";
    private static String testUrl = "jdbc:mysql://localhost:3306/supermarket_test?useUnicode=true&characterEncoding=utf-8";
    protected static AbstractApplicationContext context;
    @BeforeClass
    public static void beforeClass(){
        // override database url
        System.setProperty("jdbc.url", testUrl);
        context = new ClassPathXmlApplicationContext(contextPath);
    }
    @AfterClass
    public static void afterClass(){
        context.close();
    }
}
