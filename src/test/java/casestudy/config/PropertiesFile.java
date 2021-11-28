package casestudy.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {

    public static String getProperty(String key)
    {
        Properties configFile = new Properties();
        String projectPath = System.getProperty("user.dir");
        try {
            InputStream input = new FileInputStream(projectPath + "/src/test/java/casestudy/config/config.properties");
            configFile.load(input);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String value = configFile.getProperty(key);
        return value;
    }
}
