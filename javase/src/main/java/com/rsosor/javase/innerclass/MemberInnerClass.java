package com.rsosor.javase.innerclass;

public class MemberInnerClass {

    /**
     * 必須先有外部類的實例，才能創建成員內部類對象
     *
     * 最陽春的呼叫端：
     * Inner in = new Outer().new Inner();
     */
    private int i = 10;

    /**
     * 從外部類的非靜態方法中實例化內部類對象
     *
     * 呼叫端：
     * 有非靜態 method 幫你 new 1 次
     * Inner in = new Outer().method();
     */
    public void makeInner() {
        Inner in = new Inner();
        // Inner in = this.new Inner();
        in.seeOuter();
    }

    /**
     * 成員內部類可以訪問它的外部類的所有成員變量和方法，不管是靜態的還是非靜態的都可以
     * 非靜態內部類不能有靜態變量，因為非靜態內部類就像外部類物件成員，沒外部類對象非靜態內部類就不存在，所以不可能有靜態成員
     */
    class Inner {
        static int i = 0;

        public static void print() {
            System.out.println("內部類可以有靜態方法");
            System.out.println();
        }

        public void seeOuter() {
            System.out.println("內部類可訪問它的外部類所有成員變量、方法，不管是靜態、非靜態。" + i);
            System.out.println("內部類使用 this 代表內部類物件對象本身: " + this);
            System.out.println("外部類物件對象就使用 類名.this: " + MemberInnerClass.this);
            System.out.println();
        }
    }

    /**
     * 從外部類的靜態方法中實例化內部類對象
     *
     * 呼叫端：
     * 有靜態 method 幫你 new 2 次
     * Outer.method();
     *
     * Outer.Inner in = new Outer().new Inner();
     * // Inner in = new Outer().new Inner();
     */
    public static void makeInner2() {
        MemberInnerClass out = new MemberInnerClass();
        MemberInnerClass.Inner in = out.new Inner();
        // MemberInnerClass.Inner in = new MemberInnerClass.new Inner();
        in.seeOuter();
    }
}
