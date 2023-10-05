package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.BaseClass;
import Resources.Constants;
import Resources.commonMethods;

import pageObjectModel.LoginPageObject;
import pageObjectModel.SignupPageObjects;


public class SignupTestCases extends BaseClass {
	
	@Test
	public void verifySignup() throws IOException, InterruptedException {
		
	
		LoginPageObject lpo=new LoginPageObject (driver);
		lpo.clickOntryForFree().click();
		
		
		SignupPageObjects spo=new SignupPageObjects(driver);
		
	
		Thread.sleep(5000);
		spo.enterFirstName().sendKeys(Constants.firstName);
		
		spo.enterLastName().sendKeys(Constants.lastName);
		
		spo.enterJobTitle().sendKeys(Constants.jobTitle);
		
		spo.clickOnNextButton().click();
		
		commonMethods.selectDropdown(spo.selectEmployees(), 2); //employee dropdown
		
		spo.enterCompanyName().sendKeys("test");
		commonMethods.selectDropdown(spo.selectCountry(), 4);
	//	commonMethods.selectDropdownWithVisbleTExt(spo.selectCountry(), "India");
		spo.clickOnNextButton().click();
		
		commonMethods.verifyAssertions(spo.signupPageConfirmation(), Constants.expectedTextSignupText, "Valid signup text is not showing");
		
	
	}
	
	

}
