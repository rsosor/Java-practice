package com.rsosor.featurestest.controller;

import com.rsosor.featurestest.eventlistener.DemoPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TestListenerController {

    @Autowired
    DemoPublisher demoPublisher;

    @GetMapping("testListener")
    public String testListener() {
        ArrayList<Map> list = new ArrayList<>();
        HashMap<String, String> m1 = new HashMap<>();
        m1.put("Michael", "1");
        HashMap<String, String> m2 = new HashMap<>();
        m2.put("Kobe", "2");
        HashMap<String, String> m3 = new HashMap<>();
        m3.put("Lebron", "3");
        list.add(m1);
        list.add(m2);
        list.add(m3);
        demoPublisher.publish("測試訊息", list);
        return "訊息釋出成功";
    }
}
