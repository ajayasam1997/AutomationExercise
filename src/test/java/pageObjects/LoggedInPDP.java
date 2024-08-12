package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoggedInPDP extends BasePage {

	public LoggedInPDP(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@id='quantity']")
	@CacheLookup
	private WebElement quantity;
	@FindBy(xpath = "//button[normalize-space()='Add to cart']")
	@CacheLookup
	private WebElement addToCart;

	@FindBy(xpath = "//u[normalize-space()='View Cart']")
	@CacheLookup
	private WebElement viewCart;

	// Action Methods
	public void enterTheQuantity() {
		quantity.sendKeys("2");
	}

	public void clickOnAddCartButton() {
		addToCart.click();
	}

	public void clickOnViewCart() {
		viewCart.click();
	}
}
