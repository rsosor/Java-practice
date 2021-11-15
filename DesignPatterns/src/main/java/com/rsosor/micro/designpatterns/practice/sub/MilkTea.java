package com.rsosor.micro.designpatterns.practice.sub;

import com.rsosor.micro.designpatterns.practice.Drink;
import com.rsosor.micro.designpatterns.practice.IDiscountStrategy;

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
