package com.macro.rsosor.designpatterns.practice.sub;

import com.macro.rsosor.designpatterns.practice.Drink;
import com.macro.rsosor.designpatterns.practice.IDiscountStrategy;

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
