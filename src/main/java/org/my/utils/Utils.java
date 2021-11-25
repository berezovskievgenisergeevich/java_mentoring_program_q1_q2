package org.my.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utils {

    public static Properties getProperty() {
        FileInputStream fis;
        Properties property = new java.util.Properties();
        try {
            fis = new FileInputStream("src/main/resources/config.properties");
            property.load(fis);
        } catch (IOException e) {
            e.printStackTrace();

        }
        return property;
    }

    public static StringBuffer deleteLastEmptyString(StringBuffer builder) {
        builder.setLength(builder.length() - 1);
        return builder;
    }
}
