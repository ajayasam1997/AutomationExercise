package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

	public CheckoutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//ul[@id='address_invoice']//li[@class='address_city address_state_name address_postcode'][contains(text(),'Hyderabad Telangana')]")
	@CacheLookup
	private WebElement address;

	// Action Methods

	public String getBillingAddress() {
		String myAddress = address.getText();
		return myAddress;
	}
}
