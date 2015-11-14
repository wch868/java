package com.wch.pattern.builder;

import java.util.ArrayList;

/**
 * Created by chunhai.wang on 2015/11/14.
 */
public interface CarBuilder {
    void setSequence(ArrayList sequence);
    CarModel getCarModel();
}
