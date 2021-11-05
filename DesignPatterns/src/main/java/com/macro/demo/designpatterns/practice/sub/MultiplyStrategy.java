package com.macro.demo.designpatterns.practice.sub;

import com.macro.demo.designpatterns.practice.IDiscountStrategy;

// 打折策略
public class MultiplyStrategy extends IDiscountStrategy {

    public MultiplyStrategy(double discount) {
        super(discount);
    }

    @Override
    public double getValue(double value) {
        return value * discount;
    }
}
