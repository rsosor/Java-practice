package com.macro.demo.designpatterns.prototypepattern;

import com.macro.demo.designpatterns.prototypepattern.sub.Sensor;
import org.junit.jupiter.api.Assertions;

public class Test {

    public static void main(String[] args) {
        Sensor[] sensors = new Sensor[10000];
        sensors[0] = new Sensor();
        sensors[0].setId(1);
        sensors[0].setName("Sensor 第一版");
        sensors[0].setNickname("我的空氣探測器");
        sensors[0].setVersion("1.0.0");
        sensors[0].setWifiId("MYSENSORWIFIID1.0.0");
        sensors[0].setWifiPass("This is WiFi pass");
        sensors[0].setData("None");

        for (int i = 1; i < 10000; i++) {
            try {
                sensors[i] = (Sensor) sensors[0].clone();
                sensors[i].setId(i + 1);
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 10000; i++) {
            Assertions.assertEquals(i+1, sensors[i].getId());
        }
    }
}
