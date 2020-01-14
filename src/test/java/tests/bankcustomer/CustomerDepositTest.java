package tests.bankcustomer;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CommonPage;

import java.text.ParseException;
import java.time.LocalDateTime;

import static tests.PageProvider.*;

public class CustomerDepositTest {
    String amountBeforeAdd = "";
    String depositTime = "";

    @And("^I click deposit tab$")
    public void clickDepositTab() throws InterruptedException {
        Thread.sleep(2000);
        getCustomerDepositPage().clickDepositTab();
        Thread.sleep(2000);
        amountBeforeAdd = getCustomerDepositPage().getBalance();
        Thread.sleep(2000);
    }

    @And("^I type deposit amount as (.*)$")
    public void setAmount(String amount) throws InterruptedException {
        Thread.sleep(2000);
        getCustomerDepositPage().setDepositAmount(amount);
        Thread.sleep(2000);
    }

    @And("^I click deposit button$")
    public void clickDepositButton() throws InterruptedException {
        Thread.sleep(2000);
        getCustomerDepositPage().clickDepositButton();
        depositTime = getCommonPage().getCurrentTime();
        Thread.sleep(2000);
    }

    @Then("^I verify add deposit successfully with amount as (.*)$")
    public void verifyAddDepositSuccessfully(String amount) throws InterruptedException, ParseException {
        Thread.sleep(2000);
        getCustomerDepositPage().verifyAddDepositAmountSuccessfully(amountBeforeAdd, amount);
        Thread.sleep(2000);
        getTransactionsPage().clickTransactionTab();
        Thread.sleep(2000);
        getTransactionsPage().verifyDepositSuccessfully(amount, depositTime);
        Thread.sleep(2000);
        getTransactionsPage().clickBackButton();
        Thread.sleep(2000);
    }
}
