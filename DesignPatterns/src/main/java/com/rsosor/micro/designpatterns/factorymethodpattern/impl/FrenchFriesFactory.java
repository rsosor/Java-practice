package com.rsosor.micro.designpatterns.factorymethodpattern.impl;

import com.rsosor.micro.designpatterns.factorymethodpattern.IFactory;
import com.rsosor.micro.designpatterns.factorymethodpattern.IProduct;

public class FrenchFriesFactory implements IFactory {

    @Override
    public IProduct getProduct() {
        return new FrenchFries();
    }

    public IProduct getProduct(String state) {
        return new FrenchFries(state);
    }
}
