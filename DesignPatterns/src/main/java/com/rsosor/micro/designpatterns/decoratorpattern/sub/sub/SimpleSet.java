package com.rsosor.micro.designpatterns.decoratorpattern.sub.sub;

import com.rsosor.micro.designpatterns.decoratorpattern.sub.Set;

public class SimpleSet extends Set {

    private void addSet() {
        Salad salad = new Salad();
        MainMeal mainMeal = new MainMeal();
        Drink drink = new Drink();

        salad.decorate(order);
        mainMeal.decorate(salad);
        drink.decorate(mainMeal);
        drink.show();
    }

    @Override
    public void show() {
        addSet();
        super.show();
    }
}
