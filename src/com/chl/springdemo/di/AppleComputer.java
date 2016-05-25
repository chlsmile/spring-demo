package com.chl.springdemo.di;

/**
 * Created with IntelliJ IDEA.
 * Function:
 * User: hualun
 * Date: 16/5/25 上午11:11
 */
public class AppleComputer implements Computer {

    private Cpu cpu;

    public AppleComputer(Cpu cpu){
        this.cpu=cpu;
    }

    @Override
    public void computerWork() {
        cpu.cpuRun();
    }
}
