package test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.cucumberLoginPage;
import runner.TestRunner;

public class cucumberLoginTest extends pageProvider {

    @Given("^I Open banking website (.*)$")
    public void Open_banking_website(String website) throws InterruptedException{
        Thread.sleep(3000);
        TestRunner.driver.get(website);
        TestRunner.driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @When("^I click Customer Login button$")
    public void clickCustomerLogin() throws InterruptedException {
        Thread.sleep(3000);
        getCucumberLoginTest().clickOpenWebsite();
        Thread.sleep(3000);
    }

    @When("^I click user select$")
    public void click_user_select() throws InterruptedException {
        Thread.sleep(3000);
        getCucumberLoginTest().clickUserSelect();
        Thread.sleep(3000);
    }
    @When("^I chose the user name$")
    public void chose_user_name() throws InterruptedException{
        getCucumberLoginTest().choseUserName();
    }

    @Then("^I verify login successfully$")
    public void verify_login_successfully() throws InterruptedException{
        Thread.sleep(2000);
        getCucumberLoginTest().verifyLoginButton();
    }

    @Then("^I verify logout successfully$")
    public void verify_logout_successfully() throws InterruptedException{
        Thread.sleep(2000);
        getCucumberLoginTest().verifyLogoutButton();
        Thread.sleep(3000);
    }
    @When("^I click login button$")
    public void click_login_button() throws InterruptedException{
        Thread.sleep(2000);
        getCucumberLoginTest().clickLoginButton();
        Thread.sleep(2000);
    }

    @Then("^I verify had logout button$")
    public void verify_had_logoutButton() throws InterruptedException{
        Thread.sleep(3000);
        getCucumberLoginTest().verifyLogoutButton();
        Thread.sleep(3000);
    }
    @When("^I click logout button$")
    public void chick_logout_button() throws InterruptedException{
        Thread.sleep(3000);
        getCucumberLoginTest().clickLogoutButton();
        Thread.sleep(3000);
    }











}
