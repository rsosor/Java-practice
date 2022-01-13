package com.rsosor.javase.lambda.discriminateversionofimpl.inheritance;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * I ← I ←- C
 *
 * @author RsosoR
 * @date 2022/1/13
 */
public class Hello implements BiIterable {

    @Override
    public Iterator iterator() {
        return null;
    }

    /**
     * 因為子介面重新定義了父介面的預設方法為抽象方法，所以要實作 forEach() 了
     */
    @Override
    public void forEach(Consumer action) {

    }
}
