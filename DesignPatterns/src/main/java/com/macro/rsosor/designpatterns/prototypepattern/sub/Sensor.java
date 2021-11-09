package com.macro.rsosor.designpatterns.prototypepattern.sub;

import com.macro.rsosor.designpatterns.prototypepattern.ProtoType;

public class Sensor extends ProtoType {

    private int Id;

    private String name;

    private String nickname;

    private String version;

    private String wifiId;

    private String wifiPass;

    private String data;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getWifiId() {
        return wifiId;
    }

    public void setWifiId(String wifiId) {
        this.wifiId = wifiId;
    }

    public String getWifiPass() {
        return wifiPass;
    }

    public void setWifiPass(String wifiPass) {
        this.wifiPass = wifiPass;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public ProtoType clone() throws CloneNotSupportedException {
        return (Sensor) super.clone();
    }
}
