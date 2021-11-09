package com.macro.rsosor.designpatterns.factorymethodpattern.impl;

import com.macro.rsosor.designpatterns.factorymethodpattern.IFactory;
import com.macro.rsosor.designpatterns.factorymethodpattern.IProduct;

public class FrenchFriesFactory implements IFactory {

    @Override
    public IProduct getProduct() {
        return new FrenchFries();
    }

    public IProduct getProduct(String state) {
        return new FrenchFries(state);
    }
}
