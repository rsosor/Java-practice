package com.macro.demo.designpatterns.abstractfactorypattern;

import com.macro.demo.designpatterns.abstractfactorypattern.sub.JeepFactory;
import com.macro.demo.designpatterns.abstractfactorypattern.sub.SUVFactory;
import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {

    @Test
    public void test() {
        AbstractFactory factorySUV = new SUVFactory();
        System.out.println("------ SUV Factory ------");

        Audi suvAudi = factorySUV.createAudi();
        System.out.println(suvAudi.getBrand() + "的" + suvAudi.getType());

        BMW suvBMW = factorySUV.createBMW();
        System.out.println(suvBMW.getBrand() + "的" + suvBMW.getType());

        AbstractFactory factoryJeep = new JeepFactory();
        System.out.println("------ Jeep Factory ------");

        Audi jeepAudi = factoryJeep.createAudi();
        System.out.println(jeepAudi.getBrand() + "的" + jeepAudi.getType());

        BMW jeepBMW = factoryJeep.createBMW();
        System.out.println(jeepBMW.getBrand() + "的" + jeepBMW.getType());
    }
}
