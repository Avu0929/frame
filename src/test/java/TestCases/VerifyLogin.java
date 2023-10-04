package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.BaseClass;
import Resources.Constants;
import pageObjectModel.LoginPageObject;
import utilities.DataProviders;

public class VerifyLogin extends BaseClass{
	
	// public WebDriver driver;
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class)
	//@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
	public void InvalidLogin(String username, String pass) throws IOException {
		//Intializer();
		
	//	driver.get("https://login.salesforce.com/");
		
//		logger.info("**** Start of logger here *********");
		
		
		logger.debug("**** debug automation ****");
		logger.info("**** verifyLogin ***");
		LoginPageObject lpo = new LoginPageObject(driver);
		
		lpo.enterUserName().sendKeys(username);
		lpo.enterPassword().sendKeys(pass);
		lpo.clickLoginButton().click();
		logger.info("***** Login Button Clicked *******");
		
	//	logger.info("**** End of Logger here *****");
		
		logger.info("******** End of Logger *******");
		
		
	}

}
