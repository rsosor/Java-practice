package com.macro.rsosor.designpatterns.flyweightpattern;

import com.macro.rsosor.designpatterns.flyweightpattern.sub.MacBook;
import org.junit.jupiter.api.Test;

public class FlyWeightTest {

    @Test
    public void test() {
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
