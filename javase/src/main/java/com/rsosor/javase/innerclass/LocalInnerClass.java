package com.rsosor.javase.innerclass;

public class LocalInnerClass {

    /**
     * 方法內部類的修飾符與成員內部類不同，更像是一個局部變量，只有 final、abstract
     * 只能在定義該內部類的方法內實例化
     * 方法內部類對象不能使用該內部類所在方法的 非final 局部變量。effectively final: 不聲明 final 要確保不改變其值否則編譯期錯誤
     * 因為方法局部變量位於棧，方法結束其棧結構被刪除，但是方法內部類對象可能仍存在堆中，正因為不能保證局部變量和方法內部類對象生命週期一樣
     * 所以不能更改方法內部類所訪問的存在於方法的變量
     *
     * 靜態方法內的方法內部類
     * 靜態方法沒有 this 引用，因此在靜態方法內的內部類同理，即: 只能訪問外部類的靜態成員。
     */
    public void doSomething() {
        final int a = 10;
        class Inner {
            public void seeOuter() {
                System.out.println("local inner class 像局部變量一樣，不能被 public, protected, private, static 修飾" +
                                "，只能被 final、abstract。");
                System.out.println("方法內部類對象不能使用該內部類所在方法的 非final 局部變量。" +
                        "effectively final: 不聲明 final 要確保不改變其值否則編譯期錯誤: " + a);
                System.out.println();
            }
        }

        Inner inner = new Inner();
        inner.seeOuter();
    }
}
