package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;
import utils.BaseTest;

public class CartTest extends BaseTest{
	
	 @Test
	    public void addProductToCart() throws InterruptedException {
	        // Step 1 - Login first
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.enterUsername("standard_user");
	        loginPage.enterPassword("secret_sauce");
	        loginPage.clickLogin();
	        Thread.sleep(2000);

	        // Handle Chrome password alert
	        try {
	            driver.switchTo().alert().accept();
	        } catch (Exception e) {
	            // No alert, continue
	        }
	        Thread.sleep(2000);
	        // Step 2 - Add product to cart
	        CartPage cartPage = new CartPage(driver);
	        cartPage.addFirstProductToCart();
	        Thread.sleep(5000);

	        // Step 3 - Go to cart
	        cartPage.goToCart();
	        Thread.sleep(2000);

	        // Step 4 - Verify item is in cart
	        Assert.assertTrue(cartPage.isItemInCart());
	        System.out.println("Product added to cart successfully!");
	    }

}
