package com.wch.pattern.state;

/**
 * Created by chunhai.wang on 2015/11/29.
 */
public class RunningState extends LiftState{
    @Override
    public void open() {
        // do nothing,running cannot open
    }

    @Override
    public void close() {
        //do nothing
    }

    @Override
    public void run() {
        System.out.println("电梯上下运行。。。");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.getLiftState().stop();
    }
}
