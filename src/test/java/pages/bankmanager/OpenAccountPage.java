package pages.bankmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class OpenAccountPage {

    @FindBy(id = "userSelect")
    WebElement userSelect;

    @FindBy(xpath = "//div[2]/div/div[1]/button[2]")
    WebElement openAccountTab;

    @FindBy(id = "currency")
    WebElement currency;

    @FindBy(xpath = "//div[2]/div/div/form/button")
    WebElement processBtn;

    public void clickOpenAccountTab() {
        openAccountTab.click();
    }

    public boolean checkUserInformation(String fullname) {
        List<WebElement> userList = userSelect.findElements(By.tagName("option"));
        for (WebElement user : userList) {
            if (user.getText().equals(fullname)) {
                return true;
            }
        }
       return false;
    }


    public void getUserInformation(String usernameInput) {
        Select userSelects = new Select(userSelect);
        userSelects.selectByVisibleText(usernameInput);
    }

    public void getCurrency(String currencyInput) {
        Select userSelects = new Select(currency);
        userSelects.selectByVisibleText(currencyInput);
    }

    public void clickProcess() {
        processBtn.click();
    }

}
