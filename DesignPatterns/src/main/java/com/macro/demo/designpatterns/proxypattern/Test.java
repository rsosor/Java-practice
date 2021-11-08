package com.macro.demo.designpatterns.proxypattern;

import com.macro.demo.designpatterns.proxypattern.impl.EstateAgent;
import com.macro.demo.designpatterns.proxypattern.impl.LittleEngineer;

public class Test {

    public static void main(String[] args) {
        IBuyHouse littleEngineer = new LittleEngineer();

        IBuyHouse estateAgent = new EstateAgent(littleEngineer);

        estateAgent.findHouse();
        estateAgent.priceTooHigh();
        estateAgent.defendPrice();
        estateAgent.finish();
    }
}
