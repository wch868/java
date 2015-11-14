package com.wch.pattern.builder;

import java.util.ArrayList;

/**
 * Created by chunhai.wang on 2015/11/14.
 */
public interface CarModel {
    void start();
    void stop();
    void alarm();
    void engineBoom();
    void run();
    void setSequence(ArrayList sequence);
}
