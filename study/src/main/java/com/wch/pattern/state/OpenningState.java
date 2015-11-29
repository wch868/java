package com.wch.pattern.state;

/**
 * Created by chunhai.wang on 2015/11/16.
 */
public class OpenningState extends LiftState {
    @Override
    public void open() {
        System.out.println("电梯门打开");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.closingState);
        super.context.getLiftState().close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
