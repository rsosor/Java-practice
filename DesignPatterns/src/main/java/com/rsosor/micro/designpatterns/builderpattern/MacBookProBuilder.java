package com.rsosor.micro.designpatterns.builderpattern;

public abstract class MacBookProBuilder {

    protected MacBookPro macBookPro;

    protected MacBookProBuilder() {
        macBookPro = new MacBookPro();
    }

    public abstract MacBookProBuilder buildCPU(MacBookPro.Processor processor);

    public abstract MacBookProBuilder buildMemory(MacBookPro.Memory size);

    public abstract MacBookProBuilder buildGraphics(MacBookPro.Graphics name);

    public abstract MacBookProBuilder buildStorage(MacBookPro.Storage size);

    public abstract MacBookProBuilder buildKeyboard(MacBookPro.Keyboard language);

    protected MacBookPro build() {
        return macBookPro;
    }
}
