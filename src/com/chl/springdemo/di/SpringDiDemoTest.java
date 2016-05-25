package com.chl.springdemo.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Function:
 * User: hualun
 * Date: 16/5/25 上午11:16
 */
public class SpringDiDemoTest {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-demo-di.xml");
        AppleComputer computer=(AppleComputer) context.getBean("computer");
        computer.computerWork();
    }

}
