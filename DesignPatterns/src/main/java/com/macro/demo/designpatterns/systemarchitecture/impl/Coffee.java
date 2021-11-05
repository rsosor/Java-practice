package com.macro.demo.designpatterns.systemarchitecture.impl;

import com.macro.demo.designpatterns.systemarchitecture.Drink;

public class Coffee extends Drink {

    private CoffeeType coffeeType;

    public Coffee(SugarType sugarType, IceType iceType) {
        super(sugarType, iceType);
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
    }

    public enum CoffeeType {
        LATTE, MOCHA, WHITE, BLUE_MOUNTAIN, AMERICANO, ESPRESSO
    }
}
