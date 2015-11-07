package com.wch.pattern.visitor;

/**
 * Created by chunhai.wang on 2015/11/7.
 */
public class Address implements CustomerElements{
    private String address1;
    private String address2;
    private Phone phone;

    public Address(final String address1, final String address2, final Phone phone) {
        this.address1 = address1;
        this.address2 = address2;
        this.phone = phone;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(final String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(final String address2) {
        this.address2 = address2;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(final Phone phone) {
        this.phone = phone;
    }

    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
        getPhone().accept(visitor);
    }
}
