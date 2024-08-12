package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.LoggedInCartPage;
import pageObjects.LoggedInHomePage;
import pageObjects.LoggedInPDP;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_002_AddingProductToCart extends BaseClass {
	@Test(groups= {"sanity", "regression", "master"})
	public void addToCart() {
		
		//Creating Objects
		
		try {
			logger.info("Staring TC_002_AddingProductToCart");
			HomePage hp = new HomePage(driver);
			LoginPage lp = new LoginPage(driver);
			LoggedInHomePage lhp = new LoggedInHomePage(driver);
			LoggedInPDP pdp = new LoggedInPDP(driver);
			LoggedInCartPage cartPage = new LoggedInCartPage(driver);
			CheckoutPage checkoutPage = new CheckoutPage(driver);

			hp.loginOrSignUpElementButton();
			lp.emailAddressTextBox(p.getProperty("emailId"));
			lp.passwordTextBox(p.getProperty("password"));
			lp.loginButton();
			
			String expectedResult=lhp.checkLoginSuccessOrFailure();
			if(expectedResult.contains("Ajay")) {
				logger.info("User SuccessFully LoggedIn");
				Assert.assertTrue(true);
			}
			else {logger.info("User Unable to Login ");
			
			Assert.fail();}
			
			lhp.clickOnWomenDropdown();
			lhp.clickOnDressButton();
			lhp.clickOnViewProductButton();
			pdp.enterTheQuantity();
			logger.info("entered the product quantity");
			pdp.clickOnAddCartButton();
			logger.info("add to cart successfull");
			pdp.clickOnViewCart();
			cartPage.clickOnProceedCheckOut();
			logger.info("clicked on checkout successful");
			
			if(checkoutPage.getBillingAddress().contains("Hyderabad Telangana 500008")) {
				Assert.assertTrue(true);
			}
			else {
				logger.info("order placed Unsuccesfull");
				Assert.fail();
			}
			
			lhp.clickOnLogout();
			logger.info("logout done");
			
			
		} catch (Exception e) {
			
			Assert.fail();
		}
	}

}
