package com.macro.demo.designpatterns.practice.sub;

import com.macro.demo.designpatterns.practice.IDiscountStrategy;

// 不折價
public class NoneDiscount extends IDiscountStrategy {

    public NoneDiscount(double discount) {
        super(discount);
    }

    @Override
    public double getValue(double value) {
        return value;
    }
}