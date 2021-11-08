package com.macro.demo.designpatterns.mementopattern;

public class ComputerOriginator {

    private String system = "macOS";

    private String harddisk = "ssd";

    private String userDoc = "desk";

    private String userApp = "pages, numbers...";

    public ComputerMemento save() {
        return new ComputerMemento(system, harddisk, userDoc, userApp);
    }

    public void restore(ComputerMemento memento) {
        this.system = memento.getSystem();
        this.harddisk = memento.getHarddisk();
        this.userDoc = memento.getUserDoc();
        this.userApp = memento.getUserApp();
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

    public void setHarddisk(String harddisk) {
        this.harddisk = harddisk;
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
