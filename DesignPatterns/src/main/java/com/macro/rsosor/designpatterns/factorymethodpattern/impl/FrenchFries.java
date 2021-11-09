package com.macro.rsosor.designpatterns.factorymethodpattern.impl;

import com.macro.rsosor.designpatterns.factorymethodpattern.IProduct;

public class FrenchFries implements IProduct {

    String state = "加鹽";

    protected FrenchFries() {}

    protected FrenchFries(String state) {
        this.state = state;
    }

    @Override
    public void describe() {
        System.out.println("我是" + state + "薯條");
    }
}
