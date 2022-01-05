package com.rsosor.javase.lambda.consreference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Constructor 有隱含的傳回值！傳回值型態就是類別本身
 *
 * @author RsosoR
 * @date 2022/1/5
 */
public class ConsReference {

    /**
     * Function 定義了 R apply(T t) 必須實作
     * map() 接受了 Function 實例，指定了如何將 T 轉換為 R，你也許想將使用者名稱轉為 Person 實例
     */
    static <T, R> List<R> map(List<T> list, Function<T, R> mapper) {
        var mapped = new ArrayList<R>();
        for (var i = 0; i < list.size(); i++) {
            mapped.add(mapper.apply(list.get(i)));
        }
        return mapped;
    }

    /**
     * Lambda 表示式 只是使用 name 呼叫 Person 建構式，不如就直接參考 Person 的建構式
     *
     * 如果類別有多個建構式，會使用函式介面的方法簽署來比對，找出對應的建構式。
     * 此範例也示範了前面介紹的方法參考，forEach() 接受 Consumer 實例，而 Consumer 實作直接參考了 System.out 的 println()
     */
    public static void main(String[] args) {
        var names = List.of(args);
        // var persons = map(names, name -> new Person(name));
        var persons = map(names, Person::new);
        persons.forEach(System.out::println);
    }
}
