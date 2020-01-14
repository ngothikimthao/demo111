package pages.bankcustomer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;
import static tests.PageProvider.getCommonPage;

public class TransactionPage {
    WebDriver webDriver;

    @FindBy(xpath = "//button[contains(text(),'Transactions')]")
    WebElement transactionsTab;

    @FindBy(xpath = "//table[@class='table table-bordered table-striped']")
    WebElement transactionTable;

    @FindBy(xpath = "//button[text()='Back']")
    WebElement backButton;

    @FindBy(xpath = "//button[text()='Reset']")
    WebElement resetButton;

    @FindBy(xpath = "//table//tr//td[1]/a")
    WebElement dateTimeSort;

    public TransactionPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickTransactionTab() {
        this.transactionsTab.click();
    }

    public void clickBackButton() {
        this.backButton.click();
    }

    public void clickResetButton() {
        this.resetButton.click();
    }

    public void clickDateTimeTransactionSort() {
        this.dateTimeSort.click();
    }

    public void verifyTransactionSuccessfully(String depositAmount, String withdrawalAmount, String depositTime, String withdrawalTime) throws ParseException {
        List<WebElement> rows = transactionTable.findElements(By.tagName("tr"));
        boolean check = false;
        int count = 0;

        for (int i = 1; i < rows.size(); i++) {
            List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
            if (cols.get(2).getText().equals("Credit")) {
                if (getCommonPage().formatDateTime(cols.get(0).getText()).equals(depositTime) && cols.get(1).getText().equals(depositAmount)) {
                    count++;
                }
            }
            if (cols.get(2).getText().equals("Debit")) {
                if (getCommonPage().formatDateTime(cols.get(0).getText()).equals(withdrawalTime) && cols.get(1).getText().equals(withdrawalAmount)) {
                    count++;
                }
            }
        }

        if (count == 2) {
            check = true;
        }

        assertEquals(check, true);
    }

    public void verifyDepositSuccessfully(String depositAmount, String depositTime) throws ParseException {
        List<WebElement> rows = transactionTable.findElements(By.tagName("tr"));
        boolean check = false;

        for (int i = 1; i < rows.size(); i++) {
            List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
            if (cols.get(2).getText().equals("Credit")) {
                if (getCommonPage().formatDateTime(cols.get(0).getText()).equals(depositTime) && cols.get(1).getText().equals(depositAmount)) {
                    check = true;
                }
            }
        }

        assertEquals(check, true);
    }

    public void verifyWithdrawalSuccessfully(String withdrawalAmount, String withdrawalTime) throws ParseException {
        List<WebElement> rows = transactionTable.findElements(By.tagName("tr"));
        boolean check = false;

        for (int i = 1; i < rows.size(); i++) {
            List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
            if (cols.get(2).getText().equals("Debit")) {
                if (getCommonPage().formatDateTime(cols.get(0).getText()).equals(withdrawalTime) && cols.get(1).getText().equals(withdrawalAmount)) {
                    check = true;
                }
            }
        }

        assertEquals(check, true);
    }

    public void verifyTransactionSortSuccessfully(List<String> transactionTimeList) {
        int count = 0;
        boolean check = false;
        Collections.sort(transactionTimeList);
        List<String> sortTransactionList = getCustomerTransactionTimeList();

        for (int i = 0; i < transactionTimeList.size(); i++) {
            try {
                System.out.println(transactionTimeList.get(i).equals(sortTransactionList.get(i)));
                if (transactionTimeList.get(i).equals(sortTransactionList.get(i))) {
                    count++;
                }
            } catch (Exception e) {
                e.getStackTrace();
            }
        }

        if (count == sortTransactionList.size()) {
            check = true;
        }

        assertEquals(check, true);
    }

    public List<String> getCustomerTransactionTimeList() {
        List<WebElement> rows = transactionTable.findElements(By.tagName("tr"));
        List<String> transactionTimeList = new ArrayList<String>();
        for (int i = 1; i < rows.size(); i++) {
            try {
                List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
                transactionTimeList.add(getCommonPage().formatDateTime(cols.get(0).getText()));
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
        return transactionTimeList;
    }

    public void verifyResetTransactionSuccessfully() {
        List<WebElement> rows = transactionTable.findElements(By.tagName("tr"));
        assertEquals(rows.size()-1, 0);
    }

}
