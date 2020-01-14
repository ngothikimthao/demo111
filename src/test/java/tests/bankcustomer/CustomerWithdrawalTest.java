package tests.bankcustomer;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.text.ParseException;

import static tests.PageProvider.*;

public class CustomerWithdrawalTest {
    String amountBeforeAdd = "";
    String withdrawalTime = "";

    @And("^I click withdrawal tab$")
    public void clickWithdrawTab() throws InterruptedException {
        Thread.sleep(2000);
        getCustomerWithdrawalPage().clickWithdrawTab();
        Thread.sleep(2000);
        amountBeforeAdd = getCustomerWithdrawalPage().getBalance();
        Thread.sleep(2000);
    }

    @And("^I type withdrawal amount as (.*)$")
    public void setWithdrawalAmount(String amount) throws InterruptedException {
        Thread.sleep(2000);
        getCustomerWithdrawalPage().setWithdrawAmount(amount);
        Thread.sleep(2000);
    }

    @And("^I click withdraw button$")
    public void clickDepositButton() throws InterruptedException {
        Thread.sleep(2000);
        getCustomerWithdrawalPage().clickWithdrawButton();
        withdrawalTime = getCommonPage().getCurrentTime();
        Thread.sleep(2000);
    }

    @Then("^I verify withdrawal successfully with amount as (.*)$")
    public void verifyAddWithdrawalSuccessfully(String amount) throws InterruptedException, ParseException {
        Thread.sleep(2000);
        getCustomerWithdrawalPage().verifyAddWithdrawalAmountSuccessfully(amountBeforeAdd, amount);
        Thread.sleep(2000);
        getTransactionsPage().clickTransactionTab();
        Thread.sleep(2000);
        getTransactionsPage().verifyWithdrawalSuccessfully(amount, withdrawalTime);
        Thread.sleep(2000);
        getTransactionsPage().clickBackButton();
        Thread.sleep(2000);
    }
}
