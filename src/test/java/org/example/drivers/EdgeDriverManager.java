package org.example.drivers;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager extends DriverManager {

  @Override
  public void createDriver() {

    System.setProperty(
        "webdriver.edge.driver",
        System.getProperty("user.dir") + "/src/test/resources/drivers/msedgedriver");

    driver = new EdgeDriver();
  }
}
