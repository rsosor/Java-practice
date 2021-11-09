package com.macro.rsosor.designpatterns.practice.sub;

import com.macro.rsosor.designpatterns.practice.Drink;
import com.macro.rsosor.designpatterns.practice.IDiscountStrategy;

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
