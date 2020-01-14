package pages.bankcustomer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tests.CommonTest;

import static java.lang.Integer.parseInt;
import static org.testng.AssertJUnit.assertEquals;
import static tests.PageProvider.getCommonPage;

public class CustomerWithdrawalPage {
    WebDriver webDriver;

    @FindBy(xpath = "//button[contains(text(),'Withdrawl')]")
    WebElement withdrawlTab;

    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement withdrawlAmount;

    @FindBy(xpath = "//button[text()='Withdraw']")
    WebElement withdrawlButton;

    @FindBy(xpath = "//div[@class='center']/strong[2]")
    WebElement balance;

    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement message;

    public CustomerWithdrawalPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickWithdrawTab() {
        this.withdrawlTab.click();
    }

    public void setWithdrawAmount(String amount) throws InterruptedException {
        Thread.sleep(1000);
        this.withdrawlAmount.clear();
        Thread.sleep(1000);
        this.withdrawlAmount.sendKeys(amount);
        Thread.sleep(1000);
    }

    public void clickWithdrawButton() {
        this.withdrawlButton.click();
    }

    public String getBalance() {
        return this.balance.getText();
    }

    public String getMessage() {
        return this.message.getText();
    }

    public void verifyAddWithdrawalAmountSuccessfully(String balanceBeforeAdd, String amount) throws InterruptedException {
        int balance = parseInt(balanceBeforeAdd) - parseInt(amount);
        Thread.sleep(2000);
        assertEquals(parseInt(getBalance()), balance);
        Thread.sleep(2000);
        assertEquals(getMessage(), "Transaction successful");
        Thread.sleep(2000);
    }

    public void withdrawalSuccessfully(String amount) throws InterruptedException {
        Thread.sleep(2000);
        clickWithdrawTab();
        Thread.sleep(2000);
        setWithdrawAmount(amount);
        Thread.sleep(2000);
        clickWithdrawButton();
        CommonTest.withdrawalTime=getCommonPage().getCurrentTime();
        Thread.sleep(2000);

    }
}
