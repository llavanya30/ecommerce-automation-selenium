package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    // Constructor
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By addToCartBtn = By.xpath("//button[text()='Add to cart']");
    By cartIcon = By.className("shopping_cart_link");
    By cartItem = By.cssSelector("div.cart_item");


    // Actions
    public void addFirstProductToCart() {
        driver.findElement(addToCartBtn).click();
    }

    public void goToCart() {
        driver.findElement(cartIcon).click();
    }

    

    public boolean isItemInCart() {
        try {
            Thread.sleep(2000);
            return driver.findElement(
                By.cssSelector("div.cart_item")).isDisplayed();
        } catch (Exception e) {
            System.out.println("Cart item not found: " + e.getMessage());
            return false;
        }
    }
}