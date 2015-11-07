package com.wch.pattern.strategy;

/**
 * Created by chunhai.wang on 2015/11/7.
 */
public class Math {
    private Operate operate;

    public Operate getOperate() {
        return operate;
    }

    public void setOperate(final Operate operate) {
        this.operate = operate;
    }

    public int calc(int num1, int num2) {
        return operate.calc(num1, num2);
    }
}
