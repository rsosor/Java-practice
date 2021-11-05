package com.macro.demo.designpatterns.strategypattern;

public class PriceCalculator {

    IPriceOfRange priceOfRange;

    private PriceCalculator(){}

    public PriceCalculator(IPriceOfRange priceOfRange) {
        this.priceOfRange = priceOfRange;
    }

    public void setStrategy(IPriceOfRange priceOfRange) {
        this.priceOfRange = priceOfRange;
    }

    public int calculate(int km) {
        return this.calculate(km, priceOfRange);
    }

    public int calculate(int km, IPriceOfRange priceOfRange) {
        this.priceOfRange = priceOfRange;
        return priceOfRange.priceOfRange(km);
    }
}
