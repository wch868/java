package com.wch.pattern.visitor;

/**
 * Created by chunhai.wang on 2015/11/7.
 */
public class VisitorXml implements Visitor {
    String strData;

    @Override
    public void visit(final Customer customer) {
        strData = "<customerName>" + customer.getName() + "</customerName>";
    }

    @Override
    public void visit(final Address address) {
        strData = strData + "<address1>" + address.getAddress1() + "</address1>";
        strData = strData + "<address2>" + address.getAddress2() + "</address2>";
    }

    @Override
    public void visit(final Phone phone) {
        strData = strData + "<phone>" + phone.getNumber() + "</phone>";
    }
}
