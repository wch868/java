package com.wch.pattern.visitor;

/**
 * Created by chunhai.wang on 2015/11/7.
 */
public class Phone implements CustomerElements{
    private String number;

    public Phone(final String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(final String number) {
        this.number = number;
    }

    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}
