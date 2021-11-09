package com.macro.rsosor.designpatterns.decoratorpattern.sub.sub;

import com.macro.rsosor.designpatterns.decoratorpattern.sub.Item;

public class Salad extends Item {

    private void addSalad() {
        System.out.println("加一份沙拉");
    }

    @Override
    public void show() {
        super.show();
        addSalad();
    }
}
