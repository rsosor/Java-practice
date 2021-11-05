package com.macro.demo.designpatterns.decoratorpattern.sub.sub;

import com.macro.demo.designpatterns.decoratorpattern.sub.Item;

public class MainMeal extends Item {

    private void addMeal() {
        System.out.println("加一份主餐");
    }

    @Override
    public void show() {
        super.show();
        addMeal();
    }
}
