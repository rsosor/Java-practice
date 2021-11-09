package com.macro.rsosor.designpatterns.builderpattern.sub;

import com.macro.rsosor.designpatterns.builderpattern.MacBookPro;
import com.macro.rsosor.designpatterns.builderpattern.MacBookProBuilder;

public class MacBookPro_2021 extends MacBookProBuilder {

    public MacBookPro_2021() {
        super();
    }

    @Override
    protected MacBookPro build() {
        return super.build();
    }

    @Override
    public MacBookProBuilder buildCPU(MacBookPro.Processor processor) {
        this.macBookPro.setProcessor(processor);
        return this;
    }

    @Override
    public MacBookProBuilder buildMemory(MacBookPro.Memory size) {
        this.macBookPro.setMemory(size);
        return this;
    }

    @Override
    public MacBookProBuilder buildGraphics(MacBookPro.Graphics name) {
        this.macBookPro.setGraphics(name);
        return this;
    }

    @Override
    public MacBookProBuilder buildStorage(MacBookPro.Storage size) {
        this.macBookPro.setStorage(size);
        return this;
    }

    @Override
    public MacBookProBuilder buildKeyboard(MacBookPro.Keyboard language) {
        this.macBookPro.setKeyboard(language);
        return this;
    }
}
