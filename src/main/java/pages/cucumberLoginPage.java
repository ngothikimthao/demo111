package pages;

import cucumber.api.java.ca.I;
import org.apache.velocity.runtime.directive.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class cucumberLoginPage {

    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div[1]/button")
    WebElement customerLogin;
    @FindBy(id = "userSelect")
    WebElement userSelect;
    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/form/div/select/option[3]")
    WebElement Name;
    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/form/button")
    WebElement buttonLogin;
    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/strong/span")
    WebElement welcomeName;
    @FindBy(id = "accountSelect")
    WebElement accountSelect;
    @FindBy(xpath = "/html/body/div[3]/div/div[1]/button[2]")
    WebElement buttonLogout;

    public cucumberLoginPage(WebDriver driver) throws InterruptedException{
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOpenWebsite() {
        customerLogin.click();
    }
    public void clickUserSelect()  {
        userSelect.click();
    }

    public void choseUserName() {
        Name.click();
    }
    public  void verifyLoginButton(){
       String textButtonLogin = buttonLogin.getText();
            if (textButtonLogin.equalsIgnoreCase("Login")){
                System.out.println("Login successfully");
            }else {
                System.out.println("Login unsuccessfully");
            }
                 }
     public void clickLoginButton() throws InterruptedException{
         buttonLogin.click();
     }

    public  void verifyLogoutButton(){
        String textButtonLogin = buttonLogout.getText();
        if (textButtonLogin.equalsIgnoreCase("Logout")){
            System.out.println("Logout successfully");
        }else {
            System.out.println("Logout unsuccessfully");
        }
    }

    public void clickLogoutButton() throws InterruptedException{
        buttonLogout.click();
    }






}
