package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.ConfigReader;
import utilities.Driver;

public class TestBase {
	
	
	
WebDriver driver;
Actions actions;

	
	@BeforeMethod (alwaysRun = true)
	public void setUpMethod() {
		
		driver = Driver.getDriver();
		actions = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(
				Long.parseLong(ConfigReader.getProperty("implicitWait")), TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(ConfigReader.getProperty("url"));
		
		
	}
	
	@AfterMethod (alwaysRun = true)
	public void tearDownMethod() {
		Driver.quit();
	}
	
	
	

}
