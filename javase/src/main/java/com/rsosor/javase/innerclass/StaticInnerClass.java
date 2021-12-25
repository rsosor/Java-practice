package com.rsosor.javase.innerclass;

public class StaticInnerClass {

    /**
     * 只可訪問外部類的靜態成員、方法包括 private static
     */
    private static int a = 3;

    public static void test2() {
        System.out.println(0);
    }

    public static class Inner {

        public void test() {
            System.out.println("只可訪問外部類的靜態成員、方法包括 private static。private static int a = " + a +
                    "\n靜態內部類的實例方法可調用外部靜態方法");
            test2();
            System.out.println();
        }

        public static void test3() {
            System.out.println("靜態內部類的靜態方法可調用外部靜態方法");
            test2();
            System.out.println();
        }
    }
}
