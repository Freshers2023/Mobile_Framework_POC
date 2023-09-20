package common_utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {

    public static Properties propertyLoader(String filePath) throws IOException {
        Properties properties = new Properties();
        BufferedReader reader;
        reader = new BufferedReader(new FileReader(filePath));
        properties.load(reader);
        reader.close();
        return properties;
    }
}
