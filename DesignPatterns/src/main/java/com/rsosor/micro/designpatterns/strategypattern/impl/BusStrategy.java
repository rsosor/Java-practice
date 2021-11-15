package com.rsosor.micro.designpatterns.strategypattern.impl;

import com.rsosor.micro.designpatterns.strategypattern.IPriceOfRange;

public class BusStrategy implements IPriceOfRange {

    @Override
    public int priceOfRange(int km) {

        // 一段票 15 元
        // 十公里內一段票，超過十公里兩段票
        int count;

        if (km <= 10) {
            count = 1;
        } else {
            count = 2;
        }
        return count * 15;
    }
}
