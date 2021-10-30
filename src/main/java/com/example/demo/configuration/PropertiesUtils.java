package com.example.demo.configuration;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

import java.util.Iterator;

/**
 * PropertiesUtils
 *
 * Document: http://commons.apache.org/proper/commons-configuration/userguide/howto_basicfeatures.html#Variable_Interpolation
 * @author RsosoR
 * @date 2021/10/30
 */
public class PropertiesUtils {

    public static void main(String[] args) throws ConfigurationException {

        Configurations configs = new Configurations();

        // 設置編碼，此處的實際是個 PropertiesConfiguration，它默認採用的是`ISO-8859-1`所以中文亂碼
        // 注意：這個前提是你的 properties 文件是 utf-8 編碼的
        FileBasedConfigurationBuilder.setDefaultEncoding(PropertiesConfiguration.class, "UTF-8");
        // 每個 Configuration 代表這一個配置文件 (依賴 beanutils 這個 jar)
        Configuration config = configs.properties("my.properties");

        /**
         * 另外，若你需要處理一些較為複雜的場景，比如希望對配置文件進行監聽、前置後置處理等，可以使用 builder 模式如下：
         *
         * 採用 Builder 模式處理更為複雜的一些場景，比如把逗號分隔的字符串解析到數組、解析到 list、前後拼接字符串等
         * 其實你直接 configs.properties(...) 它的內部原理也是 builder 模式
         *
         * FileBasedConfigurationBuilder<PropertiesConfiguration> builder = configs.propertiesBuilder("my.properties");
         * builder.addEventListener();
         * builder.getConfiguration();
         * builder.getFileHandler();
         */

        // 遍歷
        Iterator<String> keys = config.getKeys();
        while (keys.hasNext()) {
            String key = keys.next();
            String value = config.getString(key);
            System.out.println(key + " = " + value);
        }

        /**
         * 為了對比，此處使用 Spring 提供的 PropertiesLoaderUtils 工具：
         * public static void main(String[] args) throws ConfigurationException, IOException {
         *     Properties properties = PropertiesLoaderUtils.loadProperties(new EncodedResource(
         *     new ClassPathResource("my.properties"), StandardCharsets.UTF-8));
         *     System.out.println(properties);
         * }
         * 但是它並不支持「佔位符」且不能使用「系統屬性」或者「環境變量」
         */

    }
}
