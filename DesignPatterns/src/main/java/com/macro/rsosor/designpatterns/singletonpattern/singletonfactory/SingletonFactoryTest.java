package com.macro.rsosor.designpatterns.singletonpattern.singletonfactory;

import com.macro.rsosor.designpatterns.singletonpattern.singletonfactory.impl.SingletonFactory;
import com.macro.rsosor.designpatterns.singletonpattern.singletonfactory.sub.Cola;
import com.macro.rsosor.designpatterns.singletonpattern.singletonfactory.sub.Hamburger;
import org.junit.Test;

public class SingletonFactoryTest {

    @Test
    public void test() {
        Cola cola = (Cola) SingletonFactory.getColaFactory().getProduct();
        Hamburger hamburger = (Hamburger) SingletonFactory.getHamburgerFactory().getProduct();

        System.out.println(cola.getName());
        System.out.println(hamburger.getName());
    }
}
