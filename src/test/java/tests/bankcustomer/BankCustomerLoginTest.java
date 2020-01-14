package tests.bankcustomer;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static tests.PageProvider.getBankCustomerLoginPage;


public class BankCustomerLoginTest {
    @When("^I click username as (.*)$")
    public void clickUsername(String username) throws InterruptedException {
        Thread.sleep(1000);
        getBankCustomerLoginPage().clickOption(username);
        Thread.sleep(1000);
    }

    @And("^I click customer login button$")
    public void clickCustomerLoginButton() throws InterruptedException {
        Thread.sleep(1000);
        getBankCustomerLoginPage().clickSubmit();
        Thread.sleep(1000);
    }

    @Then("^I verify that customer login successfully with name as (.*)$")
    public void verifyCustomerLoginSuccessfully(String username) throws InterruptedException {
        Thread.sleep(1000);
        getBankCustomerLoginPage().checkCustomerLoginSuccessfully(username);
        Thread.sleep(1000);
    }
}
