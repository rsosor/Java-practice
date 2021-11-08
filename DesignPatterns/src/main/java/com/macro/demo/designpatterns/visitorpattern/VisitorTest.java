package com.macro.demo.designpatterns.visitorpattern;

import com.macro.demo.designpatterns.visitorpattern.impl.Man;
import com.macro.demo.designpatterns.visitorpattern.impl.Woman;
import com.macro.demo.designpatterns.visitorpattern.sub.AirQuality;
import com.macro.demo.designpatterns.visitorpattern.sub.Temperature;
import org.junit.jupiter.api.Test;

public class VisitorTest {

    @Test
    public void test() {
        Temperature temperature = new Temperature();

        AirQuality airQuality = new AirQuality();

        Visit man = new Man();
        Visit woman = new Woman();

        System.out.println("------ 男生 ------");
        man.visit(temperature);
        man.visit(airQuality);

        System.out.println("------ 女生 ------");
        woman.visit(temperature);
        woman.visit(airQuality);
    }
}
