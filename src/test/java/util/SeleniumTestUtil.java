package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SeleniumTestUtil {

    public static Properties loadFile() throws IOException {
        Properties properties = null;
        final String APPLICATION_PROPERTY = "application.test.properties";

        properties = new Properties();
        properties.load(new FileInputStream(SeleniumTestUtil.class.getClassLoader()
                .getResource(APPLICATION_PROPERTY).getFile()));
        return properties;
    }

}
