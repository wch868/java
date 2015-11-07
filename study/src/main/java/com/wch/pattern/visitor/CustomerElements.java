package com.wch.pattern.visitor;

/**
 * Created by chunhai.wang on 2015/11/7.
 */
public interface CustomerElements {
    void accept(Visitor visitor);
}
