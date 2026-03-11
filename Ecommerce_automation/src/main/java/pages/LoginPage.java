package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {
	WebDriver driver;
	
	//constructor
	public LoginPage(WebDriver driver) {
		this.driver=driver;

	}
	//Locators
	By username=By.id("user-name");
	By password=By.id("password");
	By loginbtn=By.id("login-button");
	
	public void enterUsername(String user) {
		driver.findElement(username).sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void clickLogin() {
		driver.findElement(loginbtn).click();
	}

}
