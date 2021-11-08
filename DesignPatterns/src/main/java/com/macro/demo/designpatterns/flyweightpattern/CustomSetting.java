package com.macro.demo.designpatterns.flyweightpattern;

public class CustomSetting {

    public static CustomSetting LOW = new CustomSetting("LOW");

    public static CustomSetting HIGH = new CustomSetting("HIGH");

    private String cpu;

    private int memory;

    private int storage;

    public CustomSetting() {}

    private CustomSetting(String set) {
        switch (set) {
            case "LOW":
                cpu = "i8";
                memory = 32;
                storage = 1024;
                break;
            case "HIGH":
                cpu = "i10";
                memory = 64;
                storage = 4096;
                break;
            default:
                break;
        }
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        return "CustomSetting = {" + "\n" +
                "cpu = " + this.getCpu() + "\n" +
                "memory = " + this.getMemory() + "\n" +
                "storage = " + this.getStorage() + "\n" +
                "}";
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}
