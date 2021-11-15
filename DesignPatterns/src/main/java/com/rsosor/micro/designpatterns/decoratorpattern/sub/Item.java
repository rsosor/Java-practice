package com.rsosor.micro.designpatterns.decoratorpattern.sub;

import com.rsosor.micro.designpatterns.decoratorpattern.Order;

public class Item extends Order {

    protected Order order;

    public void decorate(Order order) {
        this.order = order;
    }

    @Override
    public void show() {
        if (order != null) {
            order.show();
        }
    }
}
