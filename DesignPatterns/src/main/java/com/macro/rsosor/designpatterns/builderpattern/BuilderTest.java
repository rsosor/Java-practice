package com.macro.rsosor.designpatterns.builderpattern;

import com.macro.rsosor.designpatterns.builderpattern.sub.MacBookPro_2021;
import org.junit.Test;

public class BuilderTest {

    @Test
    public void test() {
        MacBookPro_2021 macbookPro_2021 = new MacBookPro_2021();

        MacBookSeller macBookSeller = new MacBookSeller(macbookPro_2021);

        MacBookPro macBookPro = macBookSeller.lowSpec();
        System.out.println(macBookPro.toString());

        // 訂製
        MacBookPro dreamMacBookPro = macbookPro_2021
                .buildCPU(new MacBookPro.Processor("10 CPU cores (8效能核心與2節能核心) M1 Pro 處理器"))
                .buildMemory(new MacBookPro.Memory(64))
                .buildGraphics(new MacBookPro.Graphics("32 GPU cores"))
                .buildStorage(new MacBookPro.Storage(8192))
                .buildKeyboard(new MacBookPro.Keyboard("中文注音"))
                .build();
    }
}
