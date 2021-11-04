package com.example.demo.configuration;

import org.apache.commons.configuration2.XMLConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.commons.configuration2.tree.DefaultExpressionEngine;
import org.apache.commons.configuration2.tree.DefaultExpressionEngineSymbols;

public class XmlUtils {

    public static void main(String[] args) throws ConfigurationException {

        Configurations configs = new Configurations();

        XMLConfiguration config = configs.xml("my.xml");

        // 使用默認的符號定義創建一個表達式引擎
        DefaultExpressionEngine engine = new DefaultExpressionEngine(DefaultExpressionEngineSymbols.DEFAULT_SYMBOLS);
        // 指定表達式引擎
        config.setExpressionEngine(engine);
        System.out.println(config.getBoolean("token.device.validate"));
        System.out.println(config.getInt("token.person.expire"));

        // 此處就是它的默認規則 [@xxx] 表示取應對 attr 的值，更多默認定義參考 DEFAULT_SYMBOLS 常量
        System.out.println(config.getString("token.person.expire[@description]"));
        // 結果正確並且還沒有亂碼，不用處理亂碼也是 xml 優勢。

        /**
         * groupId: commons-jxpath
         * artifactId: commons-jxpath
         *
         * Configurations configs = new Configurations();
         *
         * XMLConfiguration config = configs.xml("my.xml");
         *
         * // 使用 XPath 表達式引擎
         * XPathExpressionEngine xpathEngine = new XPathExpressionEngine();
         * config.setExpressionEngine(xpathEngine);
         * System.out.println(config.getBoolean("token/device/validate"));
         * System.out.println(config.getInt("token/person/expire"));
         *
         * // 請注意這裡 路徑分隔符 和 attribute標籤 與上面使用 DefaultExpressionEngine 是不同的
         * System.out.println(config.getString("token/person/expire/@description"));
         *
         * 使用 xpath 好處是通用標準，缺點是要額外導入 jar。大多數情況下選擇 xpath 是不錯選擇。
         */

        /**
         * 自定義表達式引擎
         *
         * Configurations configs = new Configurations();
         * DefaultExpressionEngineSymbols symbols = new DefaultExpressionEngineSymbols.Builder(
         *      DefaultExpressionEngineSymbols.DEFAULT_SYMBOLS)
         *      // 指定屬性分隔符(路徑分隔符)
         *      .setPropertyDelimiter(".")
         *      .setIndexStart("{")
         *      .setIndexEnd("}")
         *      // 指定 @ 開頭就是 attribute 標誌
         *      .setAttributeStart("@")
         *      // attribute 結尾符為 null，沒有結尾符
         *      .setAttributeEnd(null)
         *      // A Backslash is used for escaping property delimiters
         *      .setEscapedDelimiter("\\/")
         *      .create();
         * // 用自定義的符號 DefaultExpressionEngineSymbols 對象創建一個表達式引擎
         * // 此處還是使用 DefaultExpressionEngine
         * DefaultExpressionEngine engine = new DefaultExpressionEngine(symbols);
         * Parameters params = new Parameters();
         *
         * FileBasedConfigurationBuilder<XMLConfiguration> builder = new FileBasedConfigurationBuilder<>(XMLConfiguration.class)
         *         .configure(params.xml()
         *                 .setFileName("my.xml")
         *                 // 使用自定義的表達式引擎
         *                 .setExpressionEngine(engine));
         *
         * // 使用 builder 生成配置 而不用使用 Configurations
         * XMLConfiguration config = builder.getConfiguration();
         * System.out.println(config.getBoolean("token.device.validate"));
         * System.out.println(config.getInt("token.person.expire"));
         * System.out.println(config.getProperty("token.person.expire@description"));
         */
    }
}
