package com.chl.springdemo.aop;

/**
 * Created with IntelliJ IDEA.
 * Function:
 * User: hualun
 * Date: 16/5/25 上午11:28
 */
public class AudiCar implements Car{

    private Engine engine;

    @Override
    public void carStart() {
        System.out.println("AudiCar carStart...");
    }

    
}
