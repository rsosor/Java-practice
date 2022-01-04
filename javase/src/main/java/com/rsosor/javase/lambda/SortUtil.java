package com.rsosor.javase.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class SortUtil {

    /**
     * 若打算將使用者名稱依長度排序
     * JDK 8 之前
     */
    public void sortByLength(String[] names) {
        Arrays.sort(names, new Comparator<String>() {
            public int compare(String name1, String name2) {
                return name1.length() - name2.length();
            }
        });
    }

    /**
     * 改變 Arrays.sort() 該行可讀性
     * JDK 8 之前
     */
    public void sortByLength2(String[] names) {
        Comparator<String> byLength = new Comparator<>() {
            public int compare(String name1, String name2) {
                return name1.length() - name2.length();
            }
        };

        Arrays.sort(names, byLength);
    }

    /**
     * JDK 8 Lambda
     */
    public void sortByLengthWithLambda(String[] names) {
        /**
         * Comparator<String> byLength =
         *                 (name1, name2) -> name1.length() - name2.length();
         */

        Arrays.sort(names,
                (name1, name2) -> name1.length() - name2.length());
    }
}
