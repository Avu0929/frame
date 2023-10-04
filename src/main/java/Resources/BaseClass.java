package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;




public class BaseClass {
	
	public WebDriver driver;
	
	public Properties prop;
	
	public Logger logger;
	
	public void Intializer() throws IOException {
		
		logger=LogManager.getLogger(BaseClass.class);
	
		FileInputStream fs = new FileInputStream("C:\\Users\\Avinash\\eclipse-workspace\\SeleniumProject\\src\\main\\java\\Resources\\data.properties");
		
		 prop = new Properties();
		prop.load(fs);
		
		String BrowserName =prop.getProperty("browser");
		
		if(BrowserName.equalsIgnoreCase("chrome")) {
			
			 driver = new ChromeDriver();
		}else if(BrowserName.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
		}
		
	}
	
	@BeforeMethod
	public void URLInvoke() throws IOException {
		
       Intializer();
		
		driver.get(prop.getProperty("url"));
	}
	@AfterMethod
	public void CloseBrowser() {
		driver.quit();
	}

}
