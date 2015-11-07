package com.wch.pattern.visitor;

/**
 * Created by chunhai.wang on 2015/11/7.
 */
public class Test {
    public static void main(String[] args) {
        Phone phone = new Phone("153****1725");
        Address address = new Address("bj", "hn", phone);
        Customer customer = new Customer("wch", address);

        VisitorString visitorString = new VisitorString();
        customer.accept(visitorString);
        System.out.println(visitorString.strData);

        VisitorXml visitorXml = new VisitorXml();
        customer.accept(visitorXml);
        System.out.println(visitorXml.strData);
    }
}
