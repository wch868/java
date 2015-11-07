package com.wch.pattern.chain;

/**
 * Created by chunhai.wang on 2015/11/7.
 */
public class MyHandler extends AbstractHandler implements Handler{
    @Override
    public void handler() {
        System.out.println("my hander");
        if(getHandler() != null){
            getHandler().handler();
        }
    }
}
