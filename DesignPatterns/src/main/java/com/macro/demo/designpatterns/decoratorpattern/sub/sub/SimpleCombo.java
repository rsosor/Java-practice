package com.macro.demo.designpatterns.decoratorpattern.sub.sub;

import com.macro.demo.designpatterns.decoratorpattern.Restaurant;
import com.macro.demo.designpatterns.decoratorpattern.sub.BusinessLunch;

public class SimpleCombo extends BusinessLunch {

    public SimpleCombo(Restaurant restaurant) {
        super(restaurant);
    }

    private void soup() {
        System.out.println("一份湯品");
    }

    @Override
    public void order() {
        super.order();
        soup();
    }
}
