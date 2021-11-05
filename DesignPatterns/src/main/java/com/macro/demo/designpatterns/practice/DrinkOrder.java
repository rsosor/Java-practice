package com.macro.demo.designpatterns.practice;

import java.util.ArrayList;
import java.util.List;

public class DrinkOrder {

    private List<Drink> drinkList = new ArrayList<>();

    public void addDrink(Drink drink) {
        drinkList.add(drink);
    }

    public void removeDrink(Drink drink) {
        drinkList.remove(drink);
    }

    /**
     * 飲料總價錢
     * @return double
     */
    private double totalPrice() {
        double totalPrice = 0;

        for (Drink d : drinkList) {
            totalPrice += d.getValue();
        }
        return totalPrice;
    }

    /**
     * 訂單總價錢
     * @param discountStrategy
     * @return double
     */
    public double getTotalPrice(IDiscountStrategy discountStrategy) {
        double totalPrice = totalPrice();

        return discountStrategy.getValue(totalPrice);
    }
}
