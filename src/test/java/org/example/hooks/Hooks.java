package org.example.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.example.stepdef.BaseClass;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks extends BaseClass {

    private BaseClass baseClass;

    public Hooks(BaseClass baseClass) {
        this.baseClass = baseClass;
    }

    @Before
    public void beforeScenario() {
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "/src/test/resources/chromedriver");
        baseClass.driver = new ChromeDriver();
        baseClass.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void afterScenario() {
        baseClass.driver.quit();
    }
}