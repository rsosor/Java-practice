package com.macro.demo.designpatterns.practice.sub;

import com.macro.demo.designpatterns.practice.Drink;
import com.macro.demo.designpatterns.practice.IDiscountStrategy;

public class Coffee extends Drink {

    public Coffee(double value) {
        super(value);
    }

    public Coffee(double value, IDiscountStrategy discountStrategy) {
        super(value, discountStrategy);
    }

    @Override
    public double getValue() {
        return super.getValue();
    }
}
