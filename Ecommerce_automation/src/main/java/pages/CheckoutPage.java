package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;

    // Constructor
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By checkoutBtn = By.id("checkout");
    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By postalCode = By.id("postal-code");
    By continueBtn = By.id("continue");
    By finishBtn = By.id("finish");
    By successMsg = By.className("complete-header");

    // Actions
    public void clickCheckout() {
        driver.findElement(checkoutBtn).click();
    }

    public void enterDetails(String fname, String lname, String zip) {
        driver.findElement(firstName).sendKeys(fname);
        driver.findElement(lastName).sendKeys(lname);
        driver.findElement(postalCode).sendKeys(zip);
    }

    public void clickContinue() {
        driver.findElement(continueBtn).click();
    }

    public void clickFinish() {
        driver.findElement(finishBtn).click();
    }

    public String getSuccessMessage() {
        return driver.findElement(successMsg).getText();
    }
}