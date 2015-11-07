package com.wch.pattern.chain;

/**
 * Created by chunhai.wang on 2015/11/7.
 */
public class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(final Handler handler) {
        this.handler = handler;
    }
}
