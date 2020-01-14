package pages.bankmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.AssertJUnit.assertEquals;
import static tests.PageProvider.getCommonPage;

public class BankManagerLoginPage {
    private WebDriver webDriver;
    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div[2]/button")
    WebElement bankManagerLoginButton;

    @FindBy(xpath = "//button[contains(text(), 'Add Customer')][1]")
    WebElement addCustomerTab;

    @FindBy(xpath = "//button[contains(text(), 'Customers')]")
    WebElement customerTab;

    @FindBy(xpath = "//div[2]/div/div[1]/button[2]")
    WebElement openAccountTab;

    public BankManagerLoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickBankManagerLoginButton() {
        this.bankManagerLoginButton.click();
    }

    public void verifyLoginManagerSuccessfully() {
        assertEquals(getCommonPage().exists(this.addCustomerTab), true);
        assertEquals(getCommonPage().exists(this.customerTab), true);
        assertEquals(getCommonPage().exists(this.openAccountTab), true);
    }

    public void loginBankManagerSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        clickBankManagerLoginButton();
        Thread.sleep(1000);
        verifyLoginManagerSuccessfully();
        Thread.sleep(1000);
    }

}
