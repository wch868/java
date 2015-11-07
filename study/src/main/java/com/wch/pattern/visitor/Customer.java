package com.wch.pattern.visitor;

/**
 * Created by chunhai.wang on 2015/11/7.
 */
public class Customer implements CustomerElements {
    private String name;
    private Address address;

    public Customer(final String name, final Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) {
        this.address = address;
    }

    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
        getAddress().accept(visitor);
    }
}
