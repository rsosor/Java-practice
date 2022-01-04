package com.rsosor.javase.generics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

    @Test
    public void case1() {
        Printer<Integer> printer = new Printer<>(23);
        printer.print();

        Printer<Double> doublePrinter = new Printer<>(33.5);
        doublePrinter.print();
    }

    @Test
    public void case2() {
        ArrayList<Cat> catList = new ArrayList<>();
        catList.add(new Cat());

        Cat myCat = catList.get(0);
        System.out.println(myCat);
    }

    @Test
    public void case3() {
        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("jo"));
        catList.add(new Cat("momo"));

        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog("dd"));
        dogList.add(new Dog("kk"));

        catList.get(0).walkAll(catList);
        dogList.get(1).walkAll(dogList);

        catList.get(0).walk();
        catList.get(1).meow();
    }
}
