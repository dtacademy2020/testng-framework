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
import utilities.BrowserUtilities;

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
		
//		List<WebElement> webelements = ap.list;
//		
//		List<String> actualList = new ArrayList<String>();
//		
//		for (WebElement webElement : webelements) {
//			actualList.add(webElement.getText());
//		}
		
		List<String> actualList = BrowserUtilities.getElementsText(ap.list);
		
		
		assertEquals(actualList, expectedList);
		
	}
	
	@Test
	public void verifyDeleteAllButton() {
		reporter.createTest("Verify delete all button");
		
		ap = new AllOrdersPage();
		
		
		
		logger.info("Clicking on check all button");
		ap.checkAllButton.click();
		logger.info("Clicking on delete button");
		ap.deleteButton.click();
		String expected = "List of orders is empty. In order to add new order use this link.";
		String actual = ap.message.getText();
		logger.info("Verifying the the expected message");
		assertEquals(actual+"cavnsba", expected);
    	logger.pass("Verified the the expected message");
		
	}

}
