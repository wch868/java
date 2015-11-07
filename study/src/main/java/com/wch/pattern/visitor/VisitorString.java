package com.wch.pattern.visitor;

/**
 * Created by chunhai.wang on 2015/11/7.
 */
public class VisitorString implements Visitor {
    String strData;

    @Override
    public void visit(final Customer customer) {
        strData = "customer name " + customer.getName() + "\r\n";
    }

    @Override
    public void visit(final Address address) {
        strData = strData + "address 1 " + address.getAddress1() + "\r\n";
        strData = strData + "address 2 " + address.getAddress2() + "\r\n";
    }

    @Override
    public void visit(final Phone phone) {
        strData = strData + "phone num " + phone.getNumber() + "\r\n";
    }
}
