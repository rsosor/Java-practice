package com.macro.demo.designpatterns.factorymethodpattern;

import com.macro.demo.designpatterns.factorymethodpattern.impl.FrenchFriesFactory;

public class FactoryManager {

    public static void main(String[] args) {
        IFactory friesFactory = new FrenchFriesFactory();
        IProduct fries = friesFactory.getProduct();
        IProduct fries2 = ((FrenchFriesFactory)friesFactory).getProduct("無鹽");

        fries.describe();
        fries2.describe();
    }
}
