package com.rsosor.javase.lambda.discriminateversionofimpl.inheritance;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * I ← I ←- C
 * 介面也可以被繼承，而抽象方法或預設方法都會被繼承下來
 *
 * @author RsosoR
 * @date 2022/1/13
 */
public interface BiIterable<T> extends Iterable<T> {

    /**
     * 子介面再以抽象方法重新定義父介面已定義的抽象方法，通常是為了文件化
     */
    Iterator<T> iterator();

    /**
     * 實作 BiIterable 的類別，就必須實作 forEach()
     */
    void forEach(Consumer<? super T> action);
}
