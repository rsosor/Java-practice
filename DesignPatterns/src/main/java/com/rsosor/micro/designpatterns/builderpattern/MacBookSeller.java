package com.rsosor.micro.designpatterns.builderpattern;

public class MacBookSeller {

    private MacBookProBuilder macbookProBuilder;

    MacBookSeller(MacBookProBuilder macbookProBuilder) {
        this.macbookProBuilder = macbookProBuilder;
    }

    public MacBookPro lowSpec() {
        return macbookProBuilder
                .buildCPU(new MacBookPro.Processor("10 CPU cores (8效能核心與2節能核心) M1 Pro 處理器"))
                .buildMemory(new MacBookPro.Memory(32))
                .buildGraphics(new MacBookPro.Graphics("16 GPU cores"))
                .buildStorage(new MacBookPro.Storage(4096))
                .buildKeyboard(new MacBookPro.Keyboard("中文注音"))
                .build();
    }

    public MacBookPro highSpec() {
        return macbookProBuilder
                .buildCPU(new MacBookPro.Processor("10 CPU cores (8效能核心與2節能核心) M1 Max 處理器"))
                .buildMemory(new MacBookPro.Memory(64))
                .buildGraphics(new MacBookPro.Graphics("32 GPU cores"))
                .buildStorage(new MacBookPro.Storage(4096))
                .buildKeyboard(new MacBookPro.Keyboard("中文注音"))
                .build();
    }
}
