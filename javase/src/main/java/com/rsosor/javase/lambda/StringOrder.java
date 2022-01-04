package com.rsosor.javase.lambda;

/**
 * byLength 參考的實例沒有狀態問題，因而適合宣告為 static
 * 要在多個類別間共用，就設定為 public static
 *
 * @author RsosoR
 * @date 2022/1/4
 */
public class StringOrder {

    public static int byLength(String s1, String s2) {
        return s1.length() - s2.length();
    }

    public static int byLexicography(String s1, String s2) {
        return s1.compareTo(s2);
    }

    public static int byLexicographyIgnoreCase(String s1, String s2) {
        return s1.compareToIgnoreCase(s2);
    }
}
