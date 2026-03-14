package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import utils.BaseTest;

public class LoginTest extends BaseTest {

	@Test
	public void validLogin() throws InterruptedException {
	    
	    // Add this line first!
	    test = extent.createTest("Valid Login Test");
	    
	    LoginPage loginPage = new LoginPage(driver);
	    loginPage.enterUsername("standard_user");
	    loginPage.enterPassword("secret_sauce");
	    loginPage.clickLogin();
	    Thread.sleep(3000);
	    System.out.println("Login Successful!");
	}
        
    
    
}