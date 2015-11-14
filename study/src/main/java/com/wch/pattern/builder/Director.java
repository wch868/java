package com.wch.pattern.builder;

import java.util.ArrayList;

import com.google.common.collect.Lists;

/**
 * Created by chunhai.wang on 2015/11/14.
 */
public class Director {
    private ArrayList<String> sequence = Lists.newArrayList();
    private BMWBuilder bmwBuilder = new BMWBuilder();
    private BenzBuilder benzBuilder = new BenzBuilder();

    public BenzModel getABenzModel(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        benzBuilder.setSequence(sequence);
        return (BenzModel)benzBuilder.getCarModel();
    }

    public BenzModel getBBenzModel(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("alarm");
        this.sequence.add("stop");
        benzBuilder.setSequence(sequence);
        return (BenzModel) benzBuilder.getCarModel();
    }
}
