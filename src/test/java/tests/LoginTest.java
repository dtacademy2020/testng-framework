package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ConfigReader;


public class LoginTest extends TestBase {
	
	
	@Test
	public void positiveLogin() {
		driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test" + Keys.ENTER);
		assertEquals(driver.getTitle(), "Web Orders");
	}
	
	
	
	@Test
	public void positiveLoginUsingPOM() {
		LoginPage loginPage = new LoginPage();
		
		loginPage.usernameField.sendKeys(ConfigReader.getProperty("username"));
		loginPage.passwordField.sendKeys(ConfigReader.getProperty("password"));
		loginPage.loginButton.click();
		
		assertEquals(loginPage.title, "Web Orders");
		
	}
	
	
	@Test
	public void positiveLoginUsingPOMwithMethods() {
		LoginPage loginPage = new LoginPage();
		
		loginPage.login();
		
		assertEquals(loginPage.title, "Web Orders Login");
		
	}

}
