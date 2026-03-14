package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import utils.BaseTest;

public class CheckoutTests extends BaseTest {

    @Test
    public void completeCheckout() throws InterruptedException {
    	test = extent.createTest("Complete Checkout Test");
        
        // Step 1 - Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
        Thread.sleep(2000);

        // Step 2 - Add product to cart
        CartPage cartPage = new CartPage(driver);
        cartPage.addFirstProductToCart();
        Thread.sleep(2000);

        // Step 3 - Go to cart
        cartPage.goToCart();
        Thread.sleep(2000);

        // Step 4 - Checkout
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.clickCheckout();
        Thread.sleep(2000);

        // Step 5 - Enter details
        checkoutPage.enterDetails("Lavanya", "Lakshmanan", "560001");
        checkoutPage.clickContinue();
        Thread.sleep(2000);

        // Step 6 - Finish order
        checkoutPage.clickFinish();
        Thread.sleep(2000);

        // Step 7 - Verify success message
        String msg = checkoutPage.getSuccessMessage();
        System.out.println("Order message: " + msg);
        Assert.assertEquals(msg, "Thank you for your order!");
    }
}