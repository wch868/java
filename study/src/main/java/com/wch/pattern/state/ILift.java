package com.wch.pattern.state;

/**
 * Created by chunhai.wang on 2015/11/16.
 */
public interface ILift {
    void open();
    void close();
    void run();
    void stop();
}
