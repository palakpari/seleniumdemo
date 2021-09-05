package org.example.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertEquals;

public class GoogleHomePageStep extends BaseClass {

    private BaseClass baseClass;

    public GoogleHomePageStep(BaseClass baseClass) {
        this.baseClass = baseClass;
    }

    @Given("user wants to search internet")
    public void user_wants_to_search_internet() {
        System.out.println("users wants to search internet");
    }

    @When("user go to https:\\/\\/www.google.com")
    public void user_go_to_https_www_google_com() {
        baseClass.driver.get("https://google.com");
    }

    @Then("user should see google home page")
    public void user_should_see_google_home_page() {
        // Write code here that turns the phrase above into concrete actions
        String title = baseClass.driver.getTitle();
        assertEquals(title, "Google");
    }
}
