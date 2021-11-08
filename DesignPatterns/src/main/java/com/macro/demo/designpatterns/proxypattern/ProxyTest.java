package com.macro.demo.designpatterns.proxypattern;

import com.macro.demo.designpatterns.proxypattern.impl.EstateAgent;
import com.macro.demo.designpatterns.proxypattern.impl.LittleEngineer;
import org.junit.jupiter.api.Test;

public class ProxyTest {

    @Test
    public void test() {
        IBuyHouse littleEngineer = new LittleEngineer();

        IBuyHouse estateAgent = new EstateAgent(littleEngineer);

        estateAgent.findHouse();
        estateAgent.priceTooHigh();
        estateAgent.defendPrice();
        estateAgent.finish();
    }
}
