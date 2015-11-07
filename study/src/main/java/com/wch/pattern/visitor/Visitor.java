package com.wch.pattern.visitor;

/**
 * Created by chunhai.wang on 2015/11/7.
 */
public interface Visitor {
    void visit(Customer customer);
    void visit(Address address);
    void visit(Phone phone);
}
