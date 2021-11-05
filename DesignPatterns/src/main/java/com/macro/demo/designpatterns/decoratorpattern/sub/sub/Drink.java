package com.macro.demo.designpatterns.decoratorpattern.sub.sub;

import com.macro.demo.designpatterns.decoratorpattern.sub.Item;

public class Drink extends Item {

    private void addDrink() {
        System.out.println("加一份飲料");
    }

    @Override
    public void show() {
        super.show();
        addDrink();
    }
}
