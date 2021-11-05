package com.macro.demo.designpatterns.decoratorpattern;

import com.macro.demo.designpatterns.decoratorpattern.sub.sub.Drink;
import com.macro.demo.designpatterns.decoratorpattern.sub.sub.MainMeal;
import com.macro.demo.designpatterns.decoratorpattern.sub.sub.Soup;

public class Test2 {

    public static void main(String[] args) {
        Order order = new Order();

        Drink drink = new Drink();
        MainMeal mainMeal = new MainMeal();
        Soup soup = new Soup();

        drink.decorate(order);
        mainMeal.decorate(drink);
        soup.decorate(mainMeal);

        soup.show();
    }
}
