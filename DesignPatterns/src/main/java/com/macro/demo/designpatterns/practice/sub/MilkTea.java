package com.macro.demo.designpatterns.practice.sub;

import com.macro.demo.designpatterns.practice.Drink;
import com.macro.demo.designpatterns.practice.IDiscountStrategy;

public class MilkTea extends Drink {

    public MilkTea(double value) {
        super(value);
    }

    public MilkTea(double value, IDiscountStrategy discountStrategy) {
        super(value, discountStrategy);
    }

    @Override
    public double getValue() {
        return super.getValue();
    }
}
