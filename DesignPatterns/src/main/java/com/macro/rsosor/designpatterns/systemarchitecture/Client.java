package com.macro.rsosor.designpatterns.systemarchitecture;

import com.macro.rsosor.designpatterns.systemarchitecture.impl.Coffee;
import com.macro.rsosor.designpatterns.systemarchitecture.impl.Tea;
import org.junit.jupiter.api.Test;

public class Client {

    @Test
    public void test() {
        DrinkShop drinkShop = new DrinkShop();

        /**
         * enum 從商品類解析出來，就可以用多型的 Drink
         */
        Tea tea = (Tea)drinkShop.order("tea", Drink.SugarType.FREE, Drink.IceType.EASY);
        tea.setTeaType(Tea.TeaType.OOLONG);

        Coffee coffee = (Coffee)drinkShop.order("coffee", Drink.SugarType.QUARTER, Drink.IceType.HOT);
        coffee.setCoffeeType(Coffee.CoffeeType.AMERICANO);
    }
}
