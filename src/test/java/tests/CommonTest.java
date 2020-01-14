package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import runner.TestRunner;

import java.time.LocalDateTime;

import static tests.PageProvider.*;

public class CommonTest {
    public static String depositTime;
    public static String withdrawalTime;

    @When("^Open Website (.*)$")
    public void user_already_on_home_page(String website) throws InterruptedException {
        TestRunner.driver.get(website);
        TestRunner.driver.manage().window().maximize();
        Thread.sleep(1000);
    }

    @When("^I login bank manager successfully$")
    public void loginBankManagerSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        getBankManagerLoginPage().loginBankManagerSuccessfully();
        Thread.sleep(2000);
    }

    @When("^I click customer tab$")
    public static void clickCustomerTab() throws InterruptedException {
        Thread.sleep(1000);
        getCustomerPage().clickCustomerTab();
        Thread.sleep(2000);
    }

    @When("^I login successfully with as (.*)$")
    public void loginSuccessfully(String username) throws InterruptedException {
        Thread.sleep(1000);
        getBankCustomerLoginPage().loginSuccessfully(username);
        Thread.sleep(2000);
    }

    @When("^I deposit successfully with amount as (.*)$")
    public void depositSuccessfully(String amount) throws InterruptedException {
        Thread.sleep(2000);
        getCustomerDepositPage().depositSuccessfully(amount);
        Thread.sleep(2000);
    }

    @When("^I withdrawal successfully with amount as (.*)$")
    public void withdrawalSucessfully(String amount) throws InterruptedException {
        Thread.sleep(2000);
        getCustomerWithdrawalPage().withdrawalSuccessfully(amount);
        Thread.sleep(2000);
    }

    @And("^I click transactions tab$")
    public void clickTransactionTab() throws InterruptedException {
        Thread.sleep(3000);
        getTransactionsPage().clickTransactionTab();
        Thread.sleep(1000);
    }

}
