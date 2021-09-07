package org.example.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.example.drivers.DriverType;
import org.example.drivers.WebDriverFactory;
import org.example.stepdef.BaseClass;

public class Hooks extends BaseClass {

  private BaseClass baseClass;

  DriverType type;

  public Hooks(BaseClass baseClass) {
    this.baseClass = baseClass;
  }

  @Before
  public void beforeScenario() {

    if(null == System.getProperty("browser")){
       type = DriverType.CHROME;
    }else {
       type = DriverType.valueOf(System.getProperty("browser"));
    }
    baseClass.driver =
            WebDriverFactory.getManager(type).getDriver();
  }

  @After
  public void afterScenario() {

    if(null == System.getProperty("browser")){
      type = DriverType.CHROME;
    }else {
      type = DriverType.valueOf(System.getProperty("browser"));
    }

    WebDriverFactory.getManager(type)
            .quitDriver(baseClass.driver);
  }
}
