package tests.bankmanager;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static tests.PageProvider.getCustomerPage;

public class SearchCustomerTest {
    List<WebElement> customerlist = new ArrayList<WebElement>();

    @And("^I input key search as (.*)$")
    public void setKeySearch(String keysearch) throws InterruptedException {
        Thread.sleep(1000);
        customerlist = getCustomerPage().getCustomerList();
        Thread.sleep(1000);
        getCustomerPage().setKeySearch(keysearch);
        Thread.sleep(1000);
    }

    @Then("^I verify that system is already showed customer has (.*)$")
    public void verifySearchCustomerSuccessfully(String keysearch) throws InterruptedException {
        Thread.sleep(1000);
        getCustomerPage().verifySearchCustomerSuccessfully(keysearch, customerlist);
        Thread.sleep(1000);
    }
}
