package com.macro.rsosor.designpatterns.facadepattern;

import org.junit.Test;

public class FacadeTest {

    @Test
    public void test() {
        Facade facade = new Facade();

        System.out.println("MethodA: ");
        facade.MethodA();

        System.out.println("MethodB: ");
        facade.MethodB();
    }
}
