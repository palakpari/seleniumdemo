package org.example.drivers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeDriverManager extends DriverManager {

  @Override
  public void createDriver() {
    System.setProperty(
        "webdriver.chrome.driver",
        System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver");
    ChromeOptions chromeOptions = new ChromeOptions();
    //   chromeOptions.addArguments("--headless");
    driver = new ChromeDriver(chromeOptions);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
}
