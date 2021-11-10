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
        /**
        Class<YAMLConfiguration> yamlConfigurationClass = YAMLConfiguration.class;
        Method method1 = yamlConfigurationClass.getMethod("read", InputStream.class);
        method1.invoke(yamlConfigurationClass.getDeclaredConstructor().newInstance(), new ClassPathResource("my.yaml").getInputStream());
        */
        /**
        Class<ClassPathResource> c1 = ClassPathResource.class;
        Object p = c1.getDeclaredConstructor(String.class).newInstance("my.yaml");
        Field f1 = c1.getDeclaredField("classLoader");
        f1.setAccessible(true);
        Field f2 = c1.getDeclaredField("path");
        f2.setAccessible(true);
        System.out.println(f1.get(p));
        System.out.println(f2.get(p));
         */

        Iterator<String> keys = config.getKeys();
        while (keys.hasNext()) {
            String key = keys.next();
            String value = config.getString(key);
            System.out.println(key + " = " + value);
        }

        /**
         * 1) InputStream inStream = PropertiesTest.class.getResourceAsStream("test.properties");
         *
         * 2) inStream = PropertiesTest.class.getResourceAsStream("/com/test/demo/test.properties")
         *
         * 3) inStream = PropertiesTest.class.getClassLoader().getResourceAsStream("com/test/demo/test.properties");
         *
         * 3. 沒有 / ，/ 為根目錄
         */
    }
}
