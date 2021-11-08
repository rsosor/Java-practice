package com.macro.demo.designpatterns.practice;

import com.macro.demo.designpatterns.practice.sub.*;
import org.junit.jupiter.api.Test;

public class PracticeTest {

    @Test
    public void test() {

        DrinkOrder drinkOrder = new DrinkOrder();
        drinkOrder.addDrink(new Coffee(165));
        drinkOrder.addDrink(new MilkTea(55, new MinusDiscount(20)));

        double price = drinkOrder.getTotalPrice(new NoneDiscount(1));
        // 200
        System.out.println(price);

        price = drinkOrder.getTotalPrice(new MultiplyStrategy(0.9));
        // 打九折
        System.out.println(price);
    }
}
