package tests;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AllOrdersPage;
import pages.LoginPage;

public class OrdersInfoTest extends TestBase{
	
	AllOrdersPage ap;
	
	
	@BeforeMethod
	public void setupOrdersPage() {
		new LoginPage().login(); 
	}
	
	@Test
	public void verifyLinks() {
		
		// Use only when you a single instance of that class
		
		ap = new AllOrdersPage();
		
		List<String> expectedList = Arrays.asList("View all orders", "View all products", "Order");
		
		List<WebElement> webelements = ap.list;
		
		List<String> actualList = new ArrayList<String>();
		
		for (WebElement webElement : webelements) {
			actualList.add(webElement.getText());
		}
		
		
		assertEquals(actualList, expectedList);
		
	}
	
	@Test
	public void verifyDeleteAllButton() {
		
		ap = new AllOrdersPage();
		
		ap.checkAllButton.click();
		ap.deleteButton.click();
		String expected = "List of orders is empty. In order to add new order use this link.";
		String actual = ap.message.getText();
		
		assertEquals(actual, expected);
		
	}

}
