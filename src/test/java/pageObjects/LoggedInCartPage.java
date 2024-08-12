package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoggedInCartPage extends BasePage {

	public LoggedInCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[normalize-space()='Proceed To Checkout']")
	@CacheLookup
	private WebElement proceedToCheckout;

	// Action Methods

	public void clickOnProceedCheckOut() {
		proceedToCheckout.click();
	}

}
