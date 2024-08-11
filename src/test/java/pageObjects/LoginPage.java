package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//input[@data-qa='login-email']")
	@CacheLookup
	private WebElement emailAddressTextBox;
	@FindBy(xpath = "//input[@placeholder='Password']")
	@CacheLookup
	private WebElement passwordTextBox;
	@FindBy(xpath = "//button[normalize-space()='Login']")
	@CacheLookup
	private WebElement loginButton;

	@FindBy(xpath = "//body")
	@CacheLookup
	private WebElement bodyElement;

	// Action methods

	public String emailAddressTextBox(String email) {
		emailAddressTextBox.sendKeys(email);
		return email;
	}

	public String passwordTextBox(String password) {
		passwordTextBox.sendKeys(password);
		return password;
	}

	public void loginButton() {
		loginButton.click();
	}

	

}
