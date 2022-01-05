package com.rsosor.javase.lambda;

/**
 * Lambda 遇上 this、final
 *
 * @author RsosoR
 * @date 2022/1/5
 */
public class Hello2 {

    Runnable r1 = () -> System.out.println(this);

    Runnable r2 = () -> System.out.println(toString());

    public String toString() {
        return "Hello world!";
    }

    /**
     * 如果 Lambda 表示式 只是匿名類別的語法蜜糖，那摩結果也該是顯示 com.rsosor...
     * 然而結果顯示兩次的 "Hello, world!"
     *
     * Lambda 表示式 本體中 this 參考對象以及 toString()（this.toString()）的接受者，是來自 Lambda 的周圍環境(Context)
     * 也就是 Lambda 表示式是在哪個名稱範疇(Scope)，就能參考該範疇內的名稱，像是變數或方法。
     *
     * 上述範例，因為是 Hello2 類別包圍 Lambda 表示式，Lambda 表示式參考了類別範疇中的名稱
     * 範例中定義了 Hello2 類別 toString() 傳回 "Hello world!" 字串，執行時才會顯示如此。
     */
    public static void main(String[] args) {
        var hello = new Hello2();
        hello.r1.run();
        hello.r2.run();
    }
}
