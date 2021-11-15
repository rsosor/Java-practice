package com.rsosor.micro.designpatterns.practice.sub;

import com.rsosor.micro.designpatterns.practice.Drink;
import com.rsosor.micro.designpatterns.practice.IDiscountStrategy;

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
