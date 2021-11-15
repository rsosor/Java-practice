package com.rsosor.micro.designpatterns.builderpattern;

public class MacBookPro {

    private Processor processor;

    private Memory memory;

    private Storage storage;

    private Graphics graphics;

    private Keyboard keyboard;

    MacBookPro() {}

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Graphics getGraphics() {
        return graphics;
    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "{ Macbook: " + "\n" +
                "Processor: " + this.getProcessor().name + "\n" +
                "Memory size: " + this.getMemory().size + "GB" + "\n" +
                "Graphics: " + this.getGraphics().name + "\n" +
                "Storage size: " + this.getStorage().size + "GB" + "\n" +
                "Keyboard language: " + this.getKeyboard().language +
                " }";
    }

    public static class Processor {
        String name;
        Processor(String name) {
            this.name = name;
        }
    }

    public static class Memory {
        int size;
        Memory(int size) {
            this.size = size;
        }
    }

    public static class Graphics {
        String name;
        Graphics(String name) {
            this.name = name;
        }
    }

    public static class Storage {
        int size;
        Storage(int size) {
            this.size = size;
        }
    }

    public static class Keyboard {
        String language;
        Keyboard(String language) {
            this.language = language;
        }
    }

}
