package com.macro.rsosor.designpatterns.chainofresponsibilitypattern;

import com.macro.rsosor.designpatterns.chainofresponsibilitypattern.sub.Manager;
import org.junit.Test;

public class ChainOfResponsibilityTest {

    @Test
    public void test() {
        Handler manager = new Manager();

        Trouble smallTrouble = new Trouble("想加薪 10% ", 5000);
        manager.handleRequest(smallTrouble);

        Trouble bigTrouble = new Trouble("搞壞一百萬的機器", 1000000);
        manager.handleRequest(bigTrouble);
    }
}
