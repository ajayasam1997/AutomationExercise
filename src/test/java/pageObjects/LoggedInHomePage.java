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
	
	public String checkLoginSuccessOrFailure() {
		String nameOfUser=bodyElement.getText();
		return nameOfUser;

	}

}
