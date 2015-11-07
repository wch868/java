package com.wch.pattern.command;


/**
 * Created by chunhai.wang on 2015/11/7.
 */
public class MyCommand implements Command{

    private Receiver receiver;

    public MyCommand(final Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exec() {
        receiver.action();
    }
}
