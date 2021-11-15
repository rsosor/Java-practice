package com.rsosor.example.configuration;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class KeyTest {

    private static HashMap<String, Map<String, Object>> properties = new HashMap<>();

    @Test
    public void test() {
        Object serverHost = KeyTest.instance.getValueByKey("spring.application.name");
        System.out.println(serverHost);
    }

    public static final KeyTest instance = new KeyTest();

    static {
        Yaml yaml = new Yaml();
        try (InputStream is = KeyTest.class.getClassLoader().getResourceAsStream("my.yaml");) {
            properties = yaml.loadAs(is, HashMap.class);
        } catch (Exception e) {
            log.error("Init yaml failed!", e);
        }
    }

    public Object getValueByKey(String key) {
        String separator = ".";

        String[] separatorKeys = null;

        if (key.contains(separator)) {
            separatorKeys = key.split("\\.");
        } else {
            return properties.get(key);
        }

        Map<String, Map<String, Object>> finalValue = new HashMap<>();
        for (int i = 0 ; i < separatorKeys.length - 1; i++) {
            if (i == 0) {
                finalValue = (Map)properties.get(separatorKeys[i]);
                continue;
            }
            if (finalValue == null) {
                break;
            }
            finalValue = (Map) finalValue.get(separatorKeys[i]);
        }
        return finalValue == null ? null : finalValue.get(separatorKeys[separatorKeys.length - 1]);
    }


}
