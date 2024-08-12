package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoggedInHomePage extends BasePage {

	public LoggedInHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//body")
	@CacheLookup
	private WebElement bodyElement;

	@FindBy(xpath = "//a[normalize-space()='Logout']")
	@CacheLookup
	private WebElement logoutButton;

	@FindBy(xpath = "//a[normalize-space()='Women']")
	@CacheLookup
	private WebElement womenDropdown;
	@FindBy(xpath = "//div[@id='Women']//a[contains(text(),'Dress')]")
	@CacheLookup
	private WebElement dressButton;

	@FindBy(xpath = "//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]")
	@CacheLookup
	private WebElement viewProductButton;

	// Action Methods

	public String checkLoginSuccessOrFailure() {
		String nameOfUser = bodyElement.getText();
		return nameOfUser;

	}

	public void clickOnWomenDropdown() {
		womenDropdown.click();
	}

	public void clickOnDressButton() {
		dressButton.click();
	}

	public void clickOnViewProductButton() {
		viewProductButton.click();
	}
	
	public void clickOnLogout() {
		logoutButton.click();
	}
}
