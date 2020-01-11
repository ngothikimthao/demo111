package pages;

import org.openqa.selenium.WebElement;
import runner.TestRunner;

/**
 * Created by kimthao.
 */
public class CommonPage {

    public void closeAlertPopup() {
        try {
            TestRunner.driver.switchTo().alert().accept();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public String getAlertPopup() {
        return TestRunner.driver.switchTo().alert().getText();
    }

    public boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public boolean exists(WebElement element)
    {
        if (element == null)
        { return false; }
        return true;
    }
}
