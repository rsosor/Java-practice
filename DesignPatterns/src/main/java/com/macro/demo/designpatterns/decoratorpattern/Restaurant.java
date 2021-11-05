package com.macro.demo.designpatterns.decoratorpattern;

/**
 * Restaurant
 * ．裝飾模式的角色有元件和裝飾，裝飾需要建構在被裝飾的元件上。
 * ．是一種繼承關係的替代方案。
 * ．裝飾物不同但是元件的本質不變。
 *
 * 動態的給一個類別添加額外的職責。就增加功能來說，裝飾模式相比產生子類別更為靈活。
 * @author RsosoR
 * @date 2021/11/5
 */
public class Restaurant {

    private void minimumOrder() {
        System.out.println("一杯飲料");
    }

    // 低消是一杯飲料
    public void order() {
        minimumOrder();
    }
}
