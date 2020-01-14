package tests.bankcustomer;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import tests.CommonTest;

import java.text.ParseException;

import static tests.PageProvider.getTransactionsPage;

public class TransactionTest {

    @Then("^I verify transactions successfully with deposit amount as (.*) and withdrawal amount as (.*)$")
    public void verifyTransactionsSuccessfully(String depositAmount, String withdrawalAmount) throws InterruptedException, ParseException {
        Thread.sleep(1000);
        getTransactionsPage().verifyTransactionSuccessfully(depositAmount, withdrawalAmount, CommonTest.depositTime, CommonTest.withdrawalTime);
        Thread.sleep(1000);
    }
}
