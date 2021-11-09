package com.macro.rsosor.designpatterns.decoratorpattern.sub;

import com.macro.rsosor.designpatterns.decoratorpattern.Order;

public class Set extends Order {

    protected Order order;

    public void decorate(Order order) {
        this.order = order;
    }

    @Override
    public void show() {
        if (order != null) {
            super.show();
        }
    }
}
