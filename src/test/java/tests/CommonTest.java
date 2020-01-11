package tests;

import cucumber.api.java.en.When;
import runner.TestRunner;

import static tests.PageProvider.getCustomerPage;

public class CommonTest {
    @When("^Open Website (.*)$")
    public void user_already_on_home_page(String website) throws InterruptedException {
        TestRunner.driver.get(website);
        TestRunner.driver.manage().window().maximize();
        Thread.sleep(1000);
    }

    @When("^I click customer tab$")
    public static void clickCustomerTab() throws InterruptedException {
        Thread.sleep(1000);
        getCustomerPage().clickCustomerTab();
        Thread.sleep(2000);
    }
}
