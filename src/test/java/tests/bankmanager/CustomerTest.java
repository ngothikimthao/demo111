package tests.bankmanager;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;


import static tests.PageProvider.getCustomerPage;

public class CustomerTest {

    @And("^I click delete button with first name as (.*), last name as (.*), post code as (.*) and account number as (.*)$")
    public void clickButtonDelete(String firstname, String lastname, String postcode, String accountnumber) throws InterruptedException {
        Thread.sleep(1000);
        getCustomerPage().clickDeleteButton(firstname, lastname, postcode, accountnumber);
        Thread.sleep(1000);
    }


    @Then("^I verify customer delete successfully with first name as (.*), last name as (.*), post code as (.*) and account number as (.*)$")
    public static void verifyDeleteCustomerSuccessfully(String firstname, String lastname, String postcode, String accountnumber) throws InterruptedException {
        Thread.sleep(1000);
        getCustomerPage().checkDeleteCustomerSuccessfully(firstname,lastname,postcode,accountnumber);
        Thread.sleep(1000);
    }


}
