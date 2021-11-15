package com.rsosor.micro.designpatterns.mementopattern;

public class ComputerMemento {

    String system;

    String harddisk;

    String userDoc;

    String userApp;

    public ComputerMemento(String system, String harddisk, String userDoc, String userApp) {
        this.system = system;
        this.harddisk = harddisk;
        this.userDoc = userDoc;
        this.userApp = userApp;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getHarddisk() {
        return harddisk;
    }

    public void setHarddisk(String hardisk) {
        this.harddisk = hardisk;
    }

    public String getUserDoc() {
        return userDoc;
    }

    public void setUserDoc(String userDoc) {
        this.userDoc = userDoc;
    }

    public String getUserApp() {
        return userApp;
    }

    public void setUserApp(String userApp) {
        this.userApp = userApp;
    }
}
