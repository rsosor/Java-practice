package com.rsosor.javase.lambda.discriminateversionofimpl.multipleinheritance;

/**
 * I,I ← I
 * 若有兩父介面定義了相同方法簽署的預設方法，就會引發衝突。
 * 假設 IPart, ICanvas 介面都定義了 default draw()，而 ILego 介面繼承時沒有重新定義 draw()，就會發生編譯錯誤
 * 解決方式就是重新定義 draw()，無論重新定義為抽象或預設方法
 * 若重新定義為預設方法時，想明確呼叫某個父介面的 draw()，必須使用 介面名稱 與 super 明確指定
 *
 * @author RsosoR
 * @date 2022/1/13
 */
public interface ILego extends IPart, ICanvas {

    default void draw() {
        IPart.super.draw();
    }
}
