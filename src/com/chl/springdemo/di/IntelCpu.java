package com.chl.springdemo.di;

/**
 * Created with IntelliJ IDEA.
 * Function:
 * User: hualun
 * Date: 16/5/25 上午11:13
 */
public class IntelCpu implements Cpu {

    @Override
    public void cpuRun() {
        System.out.println("IntelCpu running...");
    }
}
