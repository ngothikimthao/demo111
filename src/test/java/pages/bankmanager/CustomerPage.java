package pages.bankmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import runner.TestRunner;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;
import static org.testng.AssertJUnit.assertEquals;

public class CustomerPage {
    private WebDriver webDriver;

    @FindBy(tagName = "table")
    WebElement customerTable;

    @FindBy(xpath = "//button[contains(text(), 'Customers')]")
    WebElement customerTab;

    @FindBy(xpath = "//input[@placeholder='Search Customer']")
    WebElement keySearchField;

    public CustomerPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickCustomerTab() {
        this.customerTab.click();
    }

    public void checkOpenAccountInformation(String firstName, String lastName, String accountNumber) {

        List<WebElement> rows = customerTable.findElements(By.tagName("tr"));
        boolean check = false;

        for (int i = 1; i < rows.size(); i++) {
            List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));

            if (cols.get(0).getText().equals(firstName) && cols.get(1).getText().equals(lastName) && cols.get(3).getText().contains(accountNumber)) {
                check = true;
            }
        }

        assertEquals(check, true);
    }

    public void clickDeleteButton(String firstName, String lastName, String postcode, String accountNumber) {

        List<WebElement> rows = customerTable.findElements(By.tagName("tr"));

        for (int i = 1; i < rows.size(); i++) {
            List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
            if (cols.get(0).getText().equals(firstName) && cols.get(1).getText().equals(lastName)
                    && cols.get(2).getText().equals(postcode) && cols.get(3).getText().contains(accountNumber)) {
                TestRunner.driver.findElement(By.xpath("//tr[" + i + "]//button")).click();
            }
        }
    }

    public void checkDeleteCustomerSuccessfully(String firstName, String lastName, String postcode, String accountNumber) {

        List<WebElement> rows = customerTable.findElements(By.tagName("tr"));
        boolean check = true;

        for (int i = 1; i < rows.size(); i++) {
            List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));

            if (cols.get(0).getText().equals(firstName) && cols.get(1).getText().equals(lastName)
                    && cols.get(2).getText().equals(postcode) && cols.get(3).getText().contains(accountNumber)) {
                check = false;
            }
        }

        assertEquals(check, true);
    }

    public void setKeySearch(String keySearch) {
        this.keySearchField.clear();
        this.keySearchField.sendKeys(keySearch);
    }

    public void verifySearchCustomerSuccessfully(String keysearch, List<WebElement> customerlist) {
        //get list search customer
        keysearch=keysearch.trim().toLowerCase();
        List<WebElement> expectrows = new ArrayList<WebElement>();
        for (int i = 1; i < customerlist.size(); i++) {
            try {
                List<WebElement> cols = customerlist.get(i).findElements(By.tagName("td"));
                if (cols.get(0).getText().toLowerCase().contains(keysearch) || cols.get(1).getText().toLowerCase().contains(keysearch)
                        || cols.get(2).getText().toLowerCase().contains(keysearch) || cols.get(3).getText().toLowerCase().contains(keysearch)) {
                    expectrows.add(customerlist.get(i));
                }
            } catch (Exception e) {
                e.getStackTrace();
            }
        }

        //verify list search result
        List<WebElement> searchrows = customerTable.findElements(By.tagName("tr"));
        assertEquals(searchrows.containsAll(expectrows), true);
    }

    public List<WebElement> getCustomerList() {
        return customerTable.findElements(By.tagName("tr"));
    }

}
