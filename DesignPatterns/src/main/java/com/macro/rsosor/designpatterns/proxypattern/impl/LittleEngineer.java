package com.macro.rsosor.designpatterns.proxypattern.impl;

import com.macro.rsosor.designpatterns.proxypattern.IBuyHouse;

public class LittleEngineer implements IBuyHouse {

    @Override
    public void findHouse() {
        System.out.println("找尋適合居住的地段");
    }

    @Override
    public void priceTooHigh() {
        System.out.println("太貴了呀這房子");

    }

    @Override
    public void defendPrice() {
        System.out.println("能不能算便宜點呢");
    }

    @Override
    public void finish() {
        System.out.println("能賣給超級賽亞人是我們的榮幸");
    }
}
