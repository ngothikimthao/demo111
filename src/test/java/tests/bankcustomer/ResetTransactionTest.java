package tests.bankcustomer;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static tests.PageProvider.getTransactionsPage;

public class ResetTransactionTest {

    @And("^I click reset button$")
    public void clickResetButton() throws InterruptedException {
        Thread.sleep(2000);
        getTransactionsPage().clickResetButton();
        Thread.sleep(2000);
    }

    @Then("^I verify reset transactions successfully$")
    public void verifyResetTransactionSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
        getTransactionsPage().verifyResetTransactionSuccessfully();
        Thread.sleep(2000);
    }
}
