package com.macro.demo.designpatterns.facadepattern;

public class Test {

    public static void main(String[] args) {
        Facade facade = new Facade();

        System.out.println("MethodA: ");
        facade.MethodA();

        System.out.println("MethodB: ");
        facade.MethodB();
    }
}
