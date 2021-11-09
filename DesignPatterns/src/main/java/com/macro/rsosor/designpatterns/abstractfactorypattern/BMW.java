package com.macro.rsosor.designpatterns.abstractfactorypattern;

public abstract class BMW {

    private String brand;

    private String type;

    public BMW() {
        this.brand = "BMW";
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }


}
