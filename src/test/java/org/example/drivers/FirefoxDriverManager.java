package org.example.drivers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager {

    @Override
    public void createDriver() {
        driver = new FirefoxDriver();
    }

}