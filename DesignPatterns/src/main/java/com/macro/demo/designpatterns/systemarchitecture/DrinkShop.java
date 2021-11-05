package com.macro.demo.designpatterns.systemarchitecture;

import com.macro.demo.designpatterns.systemarchitecture.impl.Coffee;
import com.macro.demo.designpatterns.systemarchitecture.impl.Tea;

public class DrinkShop {

    public Drink order(String drink, Drink.SugarType sugarType, Drink.IceType iceType) {
        drink.toLowerCase();
        switch (drink) {
            case "coffee":
                return new Coffee(sugarType, iceType);
            case "tea":
                return new Tea(sugarType, iceType);
            default:
                return null;
        }
    }
}
