package tests;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.AllOrdersPage;
import pages.LoginPage;

public class OrdersInfoTest extends TestBase{
	
	
	@Test
	
	public void verifyLinks() {
		LoginPage lp = new LoginPage();
		lp.login();
		
		AllOrdersPage ap = new AllOrdersPage();
		
		List<String> expectedList = Arrays.asList("View all orders", "View all products", "Order");
		
		List<WebElement> webelements = ap.list;
		
		List<String> actualList = new ArrayList<String>();
		
		for (WebElement webElement : webelements) {
			actualList.add(webElement.getText());
		}
		
		
		assertEquals(actualList, expectedList);
		
	}

}
