package com.rsosor.javase.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaTest {

    @Test
    public void calculatorTest() {
        Calculator<Integer> calculator =
                (a, b) -> a + b;
    }

    @Test
    public void sortUtilTest() {
        String[] names = {"Justin", "caterpillar", "Bush"};

        SortUtil sortUtil = new SortUtil();

        sortUtil.sortByLength(names);
        System.out.println(Arrays.toString(names));

        sortUtil.sortByLength2(names);
        System.out.println(Arrays.toString(names));

        sortUtil.sortByLengthWithLambda(names);
        System.out.println(Arrays.toString(names));
    }

    @Test
    public void stringOrderTest() {
        String[] names = {"Justin", "caterpillar", "Bush"};
        Arrays.sort(names, (name1, name2) -> StringOrder.byLength(name1, name2));
        System.out.println(Arrays.toString(names));
    }

    /**
     * 除了方法名稱之外，byLength() 方法的簽署和 Comparator 的 compare() 方法相同
     * 你只是在 Lambda 運算式中，將參數 name1, name2 傳給 byLength()，可以直接重用 byLength() 更好
     * JDK 8 提供方法參考(Method reference) << 必須引用 static method
     */
    @Test
    public void methodReference() {
        String[] names = {"Justin", "caterpillar", "Bush"};
        Arrays.sort(names, StringOrder::byLength);
        System.out.println(Arrays.toString(names));
    }
}

