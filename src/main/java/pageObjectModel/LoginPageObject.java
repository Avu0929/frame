package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	WebDriver driver;
	
	private By username = By.xpath("//input[@name='username']");
    private By password = By.xpath("//input[@name='pw']");
    private By loginbutton=By.xpath("//input[@name='Login']");
    
    
    public LoginPageObject(WebDriver driver) {
		
    	this.driver=driver;
	}

	public WebElement enterUserName() {
    	return driver.findElement(username);
    }
    
    public WebElement enterPassword() {
    	return driver.findElement(password);
    }
    
    public WebElement clickLoginButton() {
    	return driver.findElement(loginbutton);
    }
    
    
    
    
}
