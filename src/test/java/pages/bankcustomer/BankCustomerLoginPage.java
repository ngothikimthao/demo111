package pages.bankcustomer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;
import static tests.PageProvider.getCommonPage;

public class BankCustomerLoginPage {
    private WebDriver webDriver;

    @FindBy(id = "userSelect")
    WebElement userSelect;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginButton;

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logoutButton;

    @FindBy(xpath = "//span[@class='fontBig ng-binding']")
    WebElement nameSpan;

    public BankCustomerLoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickOption(String name) {
        WebElement option = userSelect.findElement(By.xpath("//option[text()='" + name + "']"));
        option.click();
    }

    public void clickSubmit(){
        this.loginButton.click();
    }

    public void checkCustomerLoginSuccessfully(String username) throws InterruptedException {
        Thread.sleep(1000);
        assertEquals(getCommonPage().exists(this.logoutButton), true);
        Thread.sleep(1000);
        assertEquals(nameSpan.getText(), username);
        Thread.sleep(1000);
    }

    public void loginSuccessfully(String username) throws InterruptedException {
        Thread.sleep(1000);
        clickOption(username);
        Thread.sleep(1000);
        clickSubmit();
        Thread.sleep(1000);
        checkCustomerLoginSuccessfully(username);
        Thread.sleep(1000);
    }
}
