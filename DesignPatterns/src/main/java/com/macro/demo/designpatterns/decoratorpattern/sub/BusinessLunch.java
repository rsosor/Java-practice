package com.macro.demo.designpatterns.decoratorpattern.sub;

import com.macro.demo.designpatterns.decoratorpattern.Restaurant;

public class BusinessLunch extends Restaurant {

    private Restaurant restaurant;

    public BusinessLunch(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    private void salad() {
        System.out.println("一盤沙拉");
    }

    private void mainMeal() {
        System.out.println("一份主餐");
    }

    @Override
    public void order() {
        super.order();
        salad();
        mainMeal();
    }
}
