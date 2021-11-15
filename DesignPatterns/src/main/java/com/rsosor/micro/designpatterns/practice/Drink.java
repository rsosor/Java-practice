package com.rsosor.micro.designpatterns.practice;

import com.rsosor.micro.designpatterns.practice.sub.NoneDiscount;

public abstract class Drink {

    IDiscountStrategy discountStrategy = new NoneDiscount(1);

    double value;

    public Drink(double value) {
        this.value = value;
    }

    public Drink(double value, IDiscountStrategy discountStrategy) {
        this.value = value;
        this.discountStrategy = discountStrategy;
    }

    public double getValue() {
        return discountStrategy.getValue(value);
    }
}
