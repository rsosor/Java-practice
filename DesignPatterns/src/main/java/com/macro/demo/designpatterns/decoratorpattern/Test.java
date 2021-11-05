package com.macro.demo.designpatterns.decoratorpattern;

import com.macro.demo.designpatterns.decoratorpattern.sub.BusinessLunch;
import com.macro.demo.designpatterns.decoratorpattern.sub.sub.SimpleCombo;
import com.macro.demo.designpatterns.decoratorpattern.sub.sub.sub.FullCombo;

public class Test {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();

        SimpleCombo simpleCombo = new SimpleCombo(restaurant);
        System.out.println("簡餐: ");
        simpleCombo.order();

        BusinessLunch businessLunch = new BusinessLunch(restaurant);
        System.out.println("商業午餐: ");
        businessLunch.order();

        FullCombo fullCombo = new FullCombo(restaurant);
        System.out.println("全餐: ");
        fullCombo.order();
    }
}
