package com.rsosor.javase.lambda;

import com.rsosor.javase.lambda.staticmethod.StringOrder;
import org.junit.Test;
import java.util.*;

import static java.lang.System.out;

/**
 * 匿名內部類別編譯產生 外部類別名稱$編號.class 還是類別
 * Lambda 只是多出一個方法，效能優於匿名內部類別
 *
 * 目標型態(Target type) = Lambda 表示式(Expression)
 * 若是實作較為複雜，可以使用 method reference 而非 lambda 表示式
 *
 * Lambda 表示式 本身不代表任何型態的實例，同一個 Lambda 表示式，可表示不同目標型態的物件實作
 * 在介面只有一個方法要實作，只想關心參數及實作本體，不想理會類別與方法名稱的場合 @FunctionalInterface
 *
 * Java 採用 Lambda 的理由之一，是想支援並行程式設計，Lambda 表示式捕獲的區域變數若可變動值
 * 也就是表示並行時必須處理同步鎖定問題，Java 透過禁止 Lambda 表示式修改區域變數值，來避免這類問題
 *
 * 臨時為函式介面定義實作時，Lambda 表示式很方便，但有時會發現某些靜態方法的本體實作流程，與自定義的 Lambda 表示式 相同
 * Lambda 表示式 只是定義函式介面實作的一種方式，除此之外，只要靜態方法的方法簽署中，參數與傳回值定義相同，也可以使用靜態方法來定義函式介面實作
 *
 * @author RsosoR
 * @date 2022/1/5
 */
public class LambdaTest {

    @Test
    public void calculatorTest() {
        Calculator<Integer> calculator =
                (a, b) -> a + b;
        out.println(calculator.cal(30,60));
    }

    @Test
    public void sortUtilTest() {
        String[] names = {"Justin", "caterpillar", "Bush"};

        SortUtil sortUtil = new SortUtil();

        sortUtil.sortByLength(names);
        out.println(Arrays.toString(names));

        sortUtil.sortByLength2(names);
        out.println(Arrays.toString(names));

        sortUtil.sortByLengthWithLambda(names);
        out.println(Arrays.toString(names));
    }

    @Test
    public void stringOrderTest() {
        String[] names = {"Justin", "caterpillar", "Bush"};
        Arrays.sort(names, (name1, name2) -> StringOrder.byLength(name1, name2));
        out.println(Arrays.toString(names));
    }

    // 方法與建構式參考，method && constructor reference
    // 可重用既有 API 的 方法定義 與 類別建構式

    /**
     * 除了方法名稱之外，byLength() 方法的簽署和 Comparator 的 compare() 方法相同
     * 你只是在 Lambda 運算式中，將參數 name1, name2 傳給 byLength()，不如直接重用 byLength() 更好
     *
     * JDK 8 提供方法參考(Method reference)
     * 使函式介面實作可以參考「靜態方法(運用既有 API 實作)」
     * 除此之外還可以參考「特定物件的實例方法」
     */
    @Test
    public void methodReference() {
        String[] names = {"Justin", "caterpillar", "Bush"};
        Arrays.sort(names, StringOrder::byLength);
        out.println(Arrays.toString(names));
    }

    /**
     * 想依字典順序排序名稱呢？從實作中發現可直接參考 String 的 compareTo()，而不是從 StringOrder 裡的其他靜態方法
     */
    @Test
    public void methodReference2() {
        String[] names = {"Justin", "caterpillar", "Bush"};
        Arrays.sort(names, String::compareTo);
        out.println(Arrays.toString(names));
    }

    @Test
    public void methodReference3() {
        String[] names = {"Justin", "caterpillar", "Bush"};
        Arrays.sort(names, String::compareToIgnoreCase);
        out.println(Arrays.toString(names));
    }

    /**
     * 函式介面實作: 可以參考「靜態方法」之外，還可以參考「特定物件的實例方法」
     * 如 JDK 8 在 Iterable 新增 forEach()，可以迭代物件進行指定處理
     */
    @Test
    public void forEachTest() {
        var names = List.of("Justin", "Monica", "Irene");
        names.forEach(name -> out.println(name));
        new HashSet(names).forEach(name -> out.println(name));
        new ArrayDeque(names).forEach(name -> out.println(name));
    }

    /**
     * 寫了三個重複的 Lambda 表示式
     * forEach() 接受 java.util.function.Consumer 介面的實例
     * Consumer 介面必須實作 void accept(T t)
     * out 是 PrintStream 實例: public static final PrintStream out = null;
     * println() 是 out 的實例方法
     * 實際上 println() 的「方法簽署」與 accept() 相同，你可以直接參考 out 的 println()
     */
    @Test
    public void specifiedObjectMethod() {
        var names = List.of("Justin", "Monica", "Irene");
        names.forEach(out::println);
        new HashSet(names).forEach(out::println);
        new ArrayDeque(names).forEach(out::println);
    }

    /**
     * 函式介面實作也可以參考類別定義的非靜態方法，函式介面會試圖用第一個參數作為方法接收者
     * 雖然 Comparator<String> 的 int compare(String s1, String s2) 必須有兩個參數
     * 然而在以下的方法參考中，會試圖用第一個參數 s1 作為 compareTo() 的方法接收者
     * s2 作為方法的參數，也就是 s1.compareTo(s2)
     */
    @Test
    public void specifiedObjectMethod2() {
        Comparator<String> naturalOrder = String::compareTo;
        String[] names = {"Justin", "caterpillar", "Bush"};
        Arrays.sort(names, String::compareTo);
        out.println(Arrays.toString(names));
        Arrays.sort(names, String::compareToIgnoreCase);
        out.println(Arrays.toString(names));
    }
}

