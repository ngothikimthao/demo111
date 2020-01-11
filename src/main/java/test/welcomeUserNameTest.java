package test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.TestRunner;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class welcomeUserNameTest extends pageProvider {

    @Given("^I Open welcome user name page (.*)$")
    public void Open_banking_website(String website) throws InterruptedException{
        Thread.sleep(3000);
        TestRunner.driver.get(website);
        TestRunner.driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Then("^I verify ready login page$")
    public void verify_ready_login_page() throws InterruptedException{
        Thread.sleep(3000);
        getCucumberLoginTest().clickOpenWebsite();
        Thread.sleep(3000);
        getCucumberLoginTest().clickUserSelect();
        Thread.sleep(3000);
        getCucumberLoginTest().choseUserName();
        Thread.sleep(3000);
        getCucumberLoginTest().verifyLoginButton();
        Thread.sleep(3000);
        getCucumberLoginTest().clickLoginButton();
        Thread.sleep(3000);
        getCucumberLoginTest().verifyLogoutButton();
        Thread.sleep(3000);
    }
    @When("^I click account number$")
    public void click_account_number() throws InterruptedException{
        Thread.sleep(3000);
        getWelcomePage().clickAccountNumber();
        Thread.sleep(3000);
    }

    @Then("^I verify account number is correct (.+)$")
    public void verify_account_number_correct(String accountNumber) throws InterruptedException{
        Thread.sleep(3000);
        getWelcomePage().verifyAccountNumber(accountNumber);
        Thread.sleep(3000);
    }

}
