package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoggedInHomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;


public class TC_001_LoginTest extends BaseClass {
@Test(groups= {"sanity", "regression", "master"})
	public void loginTest() {

		try {
			logger.info("Staring TC_001_LoginTest");
			HomePage hp = new HomePage(driver);
			LoginPage lp = new LoginPage(driver);
			LoggedInHomePage lhp = new LoggedInHomePage(driver);

			hp.loginOrSignUpElementButton();
			lp.emailAddressTextBox(p.getProperty("emailId"));
			lp.passwordTextBox(p.getProperty("password"));
			lp.loginButton();
			
			String expectedResult=lhp.checkLoginSuccessOrFailure();
			if(expectedResult.contains("Ajay")) {
				logger.info("LoginTest Passed");
				Assert.assertTrue(true);
			}
			else {logger.info("Login Test failed ");
			
			Assert.fail();}
			
			
		} catch (Exception e) {
			
			Assert.fail();
		}
	}

}
