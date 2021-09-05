package org.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        dryRun = false,
        features = "src/test/resources/features",
        glue = {"org.example.stepdef","org.example.hooks"},
        plugin = {"json:target/cucumber.json", "pretty"})
public class CucumberRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
