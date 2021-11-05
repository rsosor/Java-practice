package com.macro.demo.designpatterns.systemarchitecture;

import com.macro.demo.designpatterns.systemarchitecture.impl.Coffee;
import com.macro.demo.designpatterns.systemarchitecture.impl.Tea;

public class Client {

    public static void main(String[] args) {
        DrinkShop drinkShop = new DrinkShop();

        Tea tea = (Tea)drinkShop.order("tea", Drink.SugarType.FREE, Drink.IceType.EASY);
        tea.setTeaType(Tea.TeaType.OOLONG);

        Coffee coffee = (Coffee)drinkShop.order("coffee", Drink.SugarType.QUARTER, Drink.IceType.HOT);
        coffee.setCoffeeType(Coffee.CoffeeType.AMERICANO);
    }
}
