package com.macro.demo.designpatterns.singletonpattern.singletonfactory;

import com.macro.demo.designpatterns.singletonpattern.singletonfactory.impl.SingletonFactory;
import com.macro.demo.designpatterns.singletonpattern.singletonfactory.sub.Cola;
import com.macro.demo.designpatterns.singletonpattern.singletonfactory.sub.Hamburger;

public class Test {

    public static void main(String[] args) {
        Cola cola = (Cola) SingletonFactory.getColaFactory().getProduct();
        Hamburger hamburger = (Hamburger) SingletonFactory.getHamburgerFactory().getProduct();

        System.out.println(cola.getName());
        System.out.println(hamburger.getName());
    }
}
