package org.example.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.example.drivers.DriverType;
import org.example.drivers.WebDriverFactory;
import org.example.stepdef.BaseClass;
import org.openqa.selenium.WebDriver;

public class Hooks extends BaseClass {

    private BaseClass baseClass;

    public Hooks(BaseClass baseClass) {
        this.baseClass = baseClass;
    }

    @Before
    public void beforeScenario() {
        baseClass.driver = WebDriverFactory.getManager(DriverType.valueOf(System.getProperty("browser"))).getDriver();
    }

    @After
    public void afterScenario() {
        WebDriverFactory.getManager(DriverType.valueOf(System.getProperty("browser"))).quitDriver(baseClass.driver);
    }
}