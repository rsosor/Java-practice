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

        Plate<? extends Fruit> producer = new Plate<Apple>(new Apple());

        // producer.set(new Fruit()); error
        // producer.set(new Apple()); error

        Fruit newFruit1 = producer.get();
        Object newFruit2 = producer.get();
        // Apple newFruit3 = producer.get(); error

        Plate<? super Fruit> consumer = new Plate<Food>(new Apple());

        consumer.set(new Fruit());
        consumer.set(new Apple());

        // Fruit newFruit_1 = consumer.get(); error
        Object newFruit_2 = consumer.get();
        // Apple newFruit_3 = consumer.get(); error
    }
}
