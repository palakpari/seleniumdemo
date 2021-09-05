package org.example.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertEquals;

public class AutomationPracticeSteps1 extends BaseClass {

    private BaseClass baseClass;

    public AutomationPracticeSteps1(BaseClass baseClass){
        this.baseClass = baseClass;
    }


    @Given("user wants to shop online1")
    public void user_wants_to_shop_online() {
        System.out.println("given");
    }
    @When("User types http:\\/\\/automationpractice.com\\/index.php in browser1")
    public void user_types_http_automationpractice_com_index_php_in_browser() {
        baseClass.driver.get("http://automationpractice.com/index.php");
    }
    @Then("User arrives on home page of Automation Practice Site1")
    public void user_arrives_on_home_page_of_automation_practice_site() {
        assertEquals(baseClass.driver.getTitle(),"My Store");
    }



}
