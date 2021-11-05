package com.macro.demo.designpatterns.strategypattern.impl;

import com.macro.demo.designpatterns.strategypattern.IStrategy;

public class Minus implements IStrategy {

    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
