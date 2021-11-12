package com.example.rsosor.configuration;

import org.apache.commons.configuration2.YAMLConfiguration;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import java.util.Iterator;

public class YamlUtils {

    @Test
    public void test() throws Exception {
        YAMLConfiguration config = new YAMLConfiguration();
        config.read(new ClassPathResource("my.yaml").getInputStream());

        Iterator<String> keys = config.getKeys();
        while (keys.hasNext()) {
            String key = keys.next();
            String value = config.getString(key);
            System.out.println(key + " = " + value);
        }
    }
}
