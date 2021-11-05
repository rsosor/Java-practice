package com.macro.demo.designpatterns.practice.sub;

import com.macro.demo.designpatterns.practice.IDiscountStrategy;

// 減價策略
public class MinusDiscount extends IDiscountStrategy {

    public MinusDiscount(double discount) {
        super(discount);
    }

    @Override
    public double getValue(double value) {
        return value - discount;
    }
}