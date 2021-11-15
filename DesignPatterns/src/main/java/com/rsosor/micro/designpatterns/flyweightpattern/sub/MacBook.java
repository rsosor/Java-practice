package com.rsosor.micro.designpatterns.flyweightpattern.sub;

import com.rsosor.micro.designpatterns.flyweightpattern.CustomSetting;
import com.rsosor.micro.designpatterns.flyweightpattern.Monitor;

public class MacBook extends Monitor {

    public enum Spec {
        LOW(CustomSetting.LOW), HIGH(CustomSetting.HIGH);

        CustomSetting customSetting;

        Spec(CustomSetting customSetting) {
            this.customSetting = customSetting;
        }

        public CustomSetting getCustomSetting() {
            return customSetting;
        }
    }

    private CustomSetting customSetting;

    public MacBook(Spec spec) {
        this.customSetting = spec.getCustomSetting();
    }

    public MacBook(CustomSetting customSetting) {
        this.customSetting = customSetting;
    }

    public void setCustomSetting(CustomSetting customSetting) {
        this.customSetting = customSetting;
    }

    @Override
    public String toString() {
        return "CustomSetting = { " + "\n" +
                "cpu = " + customSetting.getCpu() + "\n" +
                "memory = " + customSetting.getMemory() + "\n" +
                "storage = " + customSetting.getStorage() + "\n" +
                "monitor = " + getMonitor() + "\n" +
                "}";
    }
}
