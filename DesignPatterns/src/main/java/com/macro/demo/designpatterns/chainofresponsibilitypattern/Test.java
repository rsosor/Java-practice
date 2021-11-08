package com.macro.demo.designpatterns.chainofresponsibilitypattern;

import com.macro.demo.designpatterns.chainofresponsibilitypattern.sub.Manager;

public class Test {

    public static void main(String[] args) {
        Handler manager = new Manager();

        Trouble smallTrouble = new Trouble("想加薪 10% ", 5000);
        manager.handleRequest(smallTrouble);

        Trouble bigTrouble = new Trouble("搞壞一百萬的機器", 1000000);
        manager.handleRequest(bigTrouble);
    }
}
