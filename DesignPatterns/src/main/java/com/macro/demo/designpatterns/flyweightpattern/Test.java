package com.macro.demo.designpatterns.flyweightpattern;

import com.macro.demo.designpatterns.flyweightpattern.sub.MacBook;

public class Test {

    public static void main(String[] args) {
        MacBookFactory factory = new MacBookFactory();
        MacBook macBook = factory.getMacBook(MacBook.Spec.HIGH);
        System.out.println(macBook.toString());

        CustomSetting customSetting = new CustomSetting();
        customSetting.setCpu("i10");
        customSetting.setMemory(64);
        customSetting.setStorage(4096);

        MacBook macBook1 = factory.getCustomMacBook(customSetting);
        System.out.println(macBook1.toString());


    }
}
