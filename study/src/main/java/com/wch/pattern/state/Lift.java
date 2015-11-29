package com.wch.pattern.state;

/**
 * Created by chunhai.wang on 2015/11/16.
 */
public class Lift implements ILift{
    @Override
    public void open() {
        System.out.println("open");
    }

    @Override
    public void close() {
        System.out.println("close");
    }

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
}
