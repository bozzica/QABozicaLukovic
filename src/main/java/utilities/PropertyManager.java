package utilities;

import javax.imageio.stream.FileImageInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyManager {
    public static String url, validUsername, validPassword, invalidUsername, invalidPassword, firstName, lastName, zipCode;
    public static PropertyManager instance;
    public static PropertyManager getInstance()  {
        if (instance== null) {
            instance = new PropertyManager();
            instance.loadData();
        }
        return instance;

    }
    public void loadData() {
        Properties properties = new Properties();
        try {
            FileInputStream fi = new FileInputStream("src/main/resources/configuration.properties");
            properties.load(fi);
        } catch (Exception e) {
            e.printStackTrace();
        }
        url = properties.getProperty("url");
        validUsername = properties.getProperty("validUsername");
        validPassword = properties.getProperty("validPassword");
        invalidUsername = properties.getProperty("invalidUsername");
        invalidPassword = properties.getProperty("invalidPassword");
        firstName = properties.getProperty("firstName");
        lastName = properties.getProperty("lastName");
        zipCode = properties.getProperty("zipCode");

    }
    public String getUrl() {
        return url;
    }
    public String getValidUsername() {
        return validUsername;
    }
    public String getValidPassword(){
        return validPassword;
    }
    public String getInvalidUsername(){
        return invalidUsername;
    }
    public String getInvalidPassword() {
        return invalidPassword;
    }

    public String getFirstName() { return firstName;}
    public String getLastName() { return lastName;}
    public String getZipCode () { return zipCode;}
}
