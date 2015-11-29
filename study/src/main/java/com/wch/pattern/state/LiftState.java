package com.wch.pattern.state;

/**
 * Created by chunhai.wang on 2015/11/16.
 */
public abstract class LiftState {
    protected Context context;

    protected void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void run();

    public abstract void stop();
}
