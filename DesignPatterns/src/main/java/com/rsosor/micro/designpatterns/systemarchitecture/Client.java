package com.rsosor.micro.designpatterns.systemarchitecture;

import com.rsosor.micro.designpatterns.systemarchitecture.impl.Coffee;
import com.rsosor.micro.designpatterns.systemarchitecture.impl.Tea;
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
