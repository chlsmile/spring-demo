package com.chl.springdemo.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Function:
 * User: hualun
 * Date: 16/5/25 上午11:33
 */
public class SpringAopDemoTest {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-demo-aop.xml");
        Car car=(Car)context.getBean("car");
        car.carStart();
    }
}
