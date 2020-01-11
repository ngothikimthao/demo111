package pages;

import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class welcomeUserNamePage {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/strong[1]")
    WebElement accountNumber;
    @FindBy(id = "accountSelect")
    WebElement accountSelect;

    public welcomeUserNamePage(WebDriver driver) throws InterruptedException{
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickAccountNumber() throws InterruptedException {
        accountNumber.click();
    }

    public void verifyAccountNumber(String accountNumber) {
        Select userSelects = new Select(accountSelect);
        userSelects.selectByVisibleText(accountNumber);
    }



}
