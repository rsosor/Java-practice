package com.rsosor.javase.generics;

import com.rsosor.javase.generics.pecs.Plate;
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

    /**
     * Producer Extends Consumer Super
     * get              set
     */
    @Test
    public void pecs() {
        // Plate<Fruit> p = new Plate<Apple>(new Apple()); error
        // Apple is a Fruit
        // Plate<Apple> is not a Plate<Fruit>

        // lev 1
        class Food {}
        // lev 2
        class Fruit extends Food {}
        class Meat extends Food {}
        // lev 3
        class Apple extends Fruit {}
        class Banana extends Fruit {}
        class Pork extends Meat {}
        class Beef extends Meat {}
        // lev 4
        class RedApple extends Apple {}
        class GreenApple extends Apple {}

        Plate<? extends Fruit> p = new Plate<Apple>(new Apple());

        // p.set(new Fruit()); error
        // p.set(new Apple()); error

        Fruit newFruit1 = p.get();
        Object newFruit2 = p.get();
        // Apple newFruit3 = p.get(); error

        Plate<? super Fruit> p2 = new Plate<Food>(new Apple());

        p2.set(new Fruit());
        p2.set(new Apple());

        // Fruit newFruit_1 = p2.get(); error
        Object newFruit_2 = p2.get();
        // Apple newFruit_3 = p2.get(); error


        // Plate<? super Fruit> p2 = new Plate<Apple>(new Apple());
    }
}
