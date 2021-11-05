package com.macro.demo.designpatterns.decoratorpattern.sub.sub.sub;

import com.macro.demo.designpatterns.decoratorpattern.Restaurant;
import com.macro.demo.designpatterns.decoratorpattern.sub.sub.SimpleCombo;

public class FullCombo extends SimpleCombo {

    public FullCombo(Restaurant restaurant) {
        super(restaurant);
    }

    public void sweet() {
        System.out.println("一份甜點");
    }

    @Override
    public void order() {
        super.order();
        sweet();
    }
}
