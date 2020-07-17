package tests;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.AllOrdersPage;
import pages.LoginPage;
import pages.ProductsPage;

public class ProductsTest extends TestBase{
	
	@Test
	public void verifyProductNames() {
		
	LoginPage lp = new LoginPage();
		
	lp.login();
	
	AllOrdersPage ap = new AllOrdersPage();
	
	ap.productPageLink.click();
	
	ProductsPage pp = new ProductsPage();
	
	List<String> expected = Arrays.asList("MyMoney", "FamilyAlbum", "ScreenSaver");
	List<String> actual = new ArrayList<String>();
	
	for (WebElement el : pp.list) {
		actual.add(el.getText());
		
	}
	
	assertEquals(actual, expected);
	
	
	
		
		
		
	}

}
