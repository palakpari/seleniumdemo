package org.example.drivers;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

  protected WebDriver driver;

  protected abstract void createDriver();

  public void quitDriver(WebDriver driver) {
    if (null != driver) {
      driver.quit();
      driver = null;
    }
  }

  public WebDriver getDriver() {
    if (null == driver) {
      createDriver();
    }
    return driver;
  }
}
