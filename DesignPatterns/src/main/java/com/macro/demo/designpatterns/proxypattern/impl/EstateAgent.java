package com.macro.demo.designpatterns.proxypattern.impl;

import com.macro.demo.designpatterns.proxypattern.IBuyHouse;

public class EstateAgent implements IBuyHouse {

    private IBuyHouse buyHouse;

    public EstateAgent(IBuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }

    @Override
    public void findHouse() {
        buyHouse.findHouse();
        System.out.println("房仲幫忙找房子");
    }

    @Override
    public void priceTooHigh() {
        buyHouse.priceTooHigh();
        System.out.println("房仲詢問價錢");
    }

    @Override
    public void defendPrice() {
        buyHouse.defendPrice();
        System.out.println("房仲幫降價");
    }

    @Override
    public void finish() {
        System.out.println("成交時房仲幫忙付訂、簽約、用印、完稅、交屋");
        buyHouse.finish();
    }
}
