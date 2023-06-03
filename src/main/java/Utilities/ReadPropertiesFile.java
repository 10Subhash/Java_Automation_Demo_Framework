package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

    public String getPropertyValue(String fileName, String key) {
        String value;
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/" + fileName));
        } catch (FileNotFoundException file) {
            System.out.println("Failed to find property file: " + file.getMessage());
        } catch (IOException IO) {
            System.out.println("Failed to open property file" + IO.getMessage());
        }
        value = properties.getProperty(key);
        return value;
    }
}
