package com.rsosor.micro.designpatterns.singletonpattern.singletonfactory.impl;

import com.rsosor.micro.designpatterns.singletonpattern.singletonfactory.Factory;
import com.rsosor.micro.designpatterns.singletonpattern.singletonfactory.Product;
import com.rsosor.micro.designpatterns.singletonpattern.singletonfactory.sub.Cola;
import com.rsosor.micro.designpatterns.singletonpattern.singletonfactory.sub.Hamburger;

public class SingletonFactory {

    public static Factory getColaFactory() {
        return ColaFactory.colaFactory;
    }

    public static Factory getHamburgerFactory() {
        return HamburgerFactory.hamburgerFactory;
    }

    private static class ColaFactory implements Factory {

        private static ColaFactory colaFactory = new ColaFactory();

        private ColaFactory() {}

        @Override
        public Product getProduct() {
            return new Cola();
        }
    }

    private static class HamburgerFactory implements Factory {

        private static HamburgerFactory hamburgerFactory = new HamburgerFactory();

        private HamburgerFactory() {}

        @Override
        public Product getProduct() {
            return new Hamburger();
        }
    }
}
