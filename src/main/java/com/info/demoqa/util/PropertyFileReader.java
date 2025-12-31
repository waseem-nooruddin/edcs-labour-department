package com.info.demoqa.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFileReader {

    private static final String LOGIN_DATA_FILE = "login-data.properties";
    private static final String SIGNUP_DATA_FILE = "signup-data.properties";
    private static final String USER_DATA_FILE = "user-data.properties";

    public static String getPropertyValue(String propertyName) {
        return readProperty(propertyName, LOGIN_DATA_FILE);
    }

    public static String getSignUpData(String propertyName) {
        return readProperty(propertyName, SIGNUP_DATA_FILE);
    }

    public static String getUserData(String propertyName) {
        return readProperty(propertyName, USER_DATA_FILE);
    }

    private static String readProperty(String propertyName, String fileName) {
        try (InputStream inputStream = PropertyFileReader.class
                .getClassLoader()
                .getResourceAsStream(fileName)) {

            if (inputStream == null) {
                throw new RuntimeException("Property file not found: " + fileName);
            }

            Properties properties = new Properties();
            properties.load(inputStream);
            return properties.getProperty(propertyName);

        } catch (IOException e) {
            throw new RuntimeException(
                    "Failed to read property '" + propertyName + "' from file '" + fileName + "'", e);
        }
    }
}
