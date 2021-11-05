package com.macro.demo.designpatterns.strategypattern.impl;

import com.macro.demo.designpatterns.strategypattern.IPriceOfRange;

public class MRTStrategy implements IPriceOfRange {

    @Override
    public int priceOfRange(int km) {
        // 十公里以下 20 元，超過每五公里五元
        int result = 0;

        if (km <= 0) return result;

        if (km <= 10) {
            result = 20;
        }

        if (km > 10) {
            double count = Math.ceil((km - 10) / 5);
            result += 5 * count;
        }
        return result;
    }
}
