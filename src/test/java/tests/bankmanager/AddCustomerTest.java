package tests.bankmanager;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;


import static org.testng.AssertJUnit.assertEquals;
import static tests.PageProvider.*;

public class AddCustomerTest {
    @When("^I click add customer tab$")
    public static void clickAddCustomerTab() throws InterruptedException {
        getAddCustomerPage().clickAddCustomerTab();
        Thread.sleep(1000);
    }

    @And("^I input first name as (.*), last name as (.*) and post code as (.*)$")
    public static void setUserInformation(String firstname, String lastname, String postcode) throws InterruptedException {
        Thread.sleep(2000);
        getAddCustomerPage().setFirstname(firstname);
        Thread.sleep(2000);
        getAddCustomerPage().setLastname(lastname);
        Thread.sleep(1000);
        getAddCustomerPage().setPostcode(postcode);
        Thread.sleep(1000);
    }

    @And("^I click submit$")
    public static void clickSubmit() throws InterruptedException {
        Thread.sleep(2000);
        getAddCustomerPage().clickSubmit();
        Thread.sleep(1000);
    }

    @Then("^I verify that system is already added customer as (.*) successfully$")
    public static void verifyAddCustomerSuccessfully(String fullname) throws InterruptedException {
        Thread.sleep(3000);
        getCommonPage().closeAlertPopup();
        Thread.sleep(3000);
        getOpenAccountPage().clickOpenAccountTab();
        Thread.sleep(3000);
        Assert.assertEquals(getOpenAccountPage().checkUserInformation(fullname), true);
        Thread.sleep(3000);
    }

    @Then("^I verify that system is already added customer as (.*) unsuccessfully$")
    public static void verifyAddCustomerUnsuccessfully(String fullname) throws InterruptedException {
        Thread.sleep(3000);
        getOpenAccountPage().clickOpenAccountTab();
        Thread.sleep(3000);
        Assert.assertEquals(getOpenAccountPage().checkUserInformation(fullname), true);
        Thread.sleep(3000);
    }
}
