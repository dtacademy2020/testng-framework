package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class ProductsPage {

	public ProductsPage() {

		PageFactory.initElements(Driver.getDriver(), this); // This statement is initializing the variables that are
															// tagged
															// with @FindBy annotations

	}
	
	@FindBy (xpath = "//table[@class='ProductsTable']//tr//td[1]")
	public List<WebElement> list;
	
	

}
