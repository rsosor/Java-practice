package com.rsosor.javase.binary;

import org.junit.Test;

/**
 * Sexagesimal                 60
 * Hex,hexadecimal,sexadecimal 16   0x
 * Decimal                     10
 * Octal                        8   0
 * Binary                       2
 *
 * @author RsosoR
 * @date 2022/1/13
 */
public class BinaryTest {

    @Test
    public void binary() {
        // 0
        System.out.println(1 >> 1);
        // -1
        System.out.println(-1 >> 1);
    }

    @Test
    public void reverseBinary() {
        char[] hex = {
                '0', '1', '2', '3', '4', '5' ,'6', '7', '8', '9',
                'a', 'b', 'c', 'd', 'e', 'f'
        };

        byte b = (byte) 0xf1;
        // 移位值通過與 0x0f 進行與運算以丟棄任何符號擴展位，以便該值可以用作十六進制字符數組的索引
        System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
    }
}
