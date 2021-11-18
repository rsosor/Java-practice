package com.rsosor.featurestest.configuration;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesTest {

    @Test
    public void test() throws IOException {
        // 本地讀取資源文件
        // ctrl+alt+t (try-with-resources)
        File file = new File("src/main/resources/my.properties");
        InputStream in = new FileInputStream(file);

        /**
         * 伺服器(Tomcat)讀取資源文件，三種方法。
         * 參考 commons-configuration2-etc.txt
         */
        InputStream inputStream = this.getClass().getResourceAsStream("/my.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        System.out.println(properties.getProperty("person.name"));

        // InputStream inputStream = PropertiesTest.class.getResourceAsStream("my.properties");
        // InputStream inputStream = PropertiesTest.class.getClassLoader().getResourceAsStream("my.properties");

    }
}
