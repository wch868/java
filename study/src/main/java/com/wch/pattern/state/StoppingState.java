package com.wch.pattern.state;

/**
 * Created by chunhai.wang on 2015/11/29.
 */
public class StoppingState extends LiftState{
    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        // do nothing
    }

    @Override
    public void run() {
        context.setLiftState(Context.runningState);
        context.getLiftState().run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止");
    }
}
