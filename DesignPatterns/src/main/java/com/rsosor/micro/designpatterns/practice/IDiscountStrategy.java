package com.rsosor.micro.designpatterns.practice;

public abstract class IDiscountStrategy {

    protected double discount;

    private IDiscountStrategy() {}

    public IDiscountStrategy(double discount) {
        this.discount = discount;
    }

    abstract public double getValue(double value);
}
