package com.rsosor.practice.io;

import java.io.*;

/**
 * UpDownLoad
 *
 * @author RsosoR
 * @date 2021/9/12
 */
public class UpDownLoad {
    public static void main(String[] args) {
        // 原始檔與目標檔案
        File sourceFile = new File("D:/", "test.txt");
        File targetFile = new File("E:/", "test.txt");
        // 輸入輸出流
        FileInputStream fis = null;
        FileOutputStream fos = null;
        // 資料緩衝區
        byte[] buf = new byte[1];
        try {
            fis = new FileInputStream(sourceFile);
            fos = new FileOutputStream(targetFile);
            // 資料讀寫
            while (fis.read(buf) != -1) {
                System.out.println("write data...");
                fos.write(buf);
            }
        } catch (
                FileNotFoundException e) {
            System.out.println("指定檔案不存在");
        } catch (
                IOException e) {
            // TODO: handle exception
        } finally {
            try {
                // 關閉輸入輸出流
                if (fis != null)
                    fis.close();
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}