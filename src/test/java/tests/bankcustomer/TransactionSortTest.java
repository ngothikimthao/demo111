package tests.bankcustomer;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import tests.CommonTest;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static tests.PageProvider.getTransactionsPage;

public class TransactionSortTest {
    List<String> transactionTimeList = new ArrayList<>();

    @And("^I click date time sort$")
    public void clickDateTimeSort() throws InterruptedException, ParseException {
        Thread.sleep(1000);
        transactionTimeList = getTransactionsPage().getCustomerTransactionTimeList();
        Thread.sleep(1000);
        getTransactionsPage().clickDateTimeTransactionSort();
        Thread.sleep(1000);
    }

    @Then("^I verify sort transactions successfully$")
    public void verifySortTransactionSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        getTransactionsPage().verifyTransactionSortSuccessfully(transactionTimeList);
        Thread.sleep(1000);
    }
}
