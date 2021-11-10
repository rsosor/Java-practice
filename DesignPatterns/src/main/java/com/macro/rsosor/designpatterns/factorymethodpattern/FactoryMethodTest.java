package com.macro.rsosor.designpatterns.factorymethodpattern;

import com.macro.rsosor.designpatterns.factorymethodpattern.impl.FrenchFriesFactory;
import org.junit.Test;

public class FactoryMethodTest {

    @Test
    public void test() {
        IFactory friesFactory = new FrenchFriesFactory();
        IProduct fries = friesFactory.getProduct();
        IProduct fries2 = ((FrenchFriesFactory)friesFactory).getProduct("無鹽");

        fries.describe();
        fries2.describe();
    }
}
