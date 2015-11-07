package com.wch.pattern.strategy;

/**
 * Created by chunhai.wang on 2015/11/7.
 */
public class SubstractOperate implements Operate {
    @Override
    public int calc(final int num1, final int num2) {
        return num1 - num2;
    }
}
