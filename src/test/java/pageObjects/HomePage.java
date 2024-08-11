package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//a[normalize-space()='Signup / Login']")
	@CacheLookup
	private WebElement loginOrSignUpElement;

//Action Methods

	public void loginOrSignUpElementButton() {
		loginOrSignUpElement.click();
	}

}
