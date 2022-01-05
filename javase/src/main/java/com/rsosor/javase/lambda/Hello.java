package com.rsosor.javase.lambda;

/**
 * Lambda 遇上 this、final
 *
 * @author RsosoR
 * @date 2022/1/5
 */
public class Hello {

    Runnable r1 = new Runnable() {
        @Override
        public void run() {
            System.out.println(this);
        }
    };

    Runnable r2 = new Runnable() {
        @Override
        public void run() {
            System.out.println(toString());
        }
    };

    public String toString() {
        return "Hello, world!";
    }

    /**
     * 由於沒有定義 Runnable 的 toString()，顯示結果就是 Object 預設的 toString() 傳回字串
     */
    public static void main(String[] args) {
        var hello = new Hello();
        hello.r1.run();
        hello.r2.run();
    }
}
