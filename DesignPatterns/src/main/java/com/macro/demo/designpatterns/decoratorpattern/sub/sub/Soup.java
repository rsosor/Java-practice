package com.macro.demo.designpatterns.decoratorpattern.sub.sub;

import com.macro.demo.designpatterns.decoratorpattern.sub.Item;

public class Soup extends Item {

    private void addSoup() {
        System.out.println("加一份湯品");
    }

    @Override
    public void show() {
        super.show();
        addSoup();
    }
}
