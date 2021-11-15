package com.rsosor.micro.designpatterns.strategypattern.impl;

import com.rsosor.micro.designpatterns.strategypattern.IStrategy;

public class Multiply implements IStrategy {

    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}
