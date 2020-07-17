package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class AllOrdersPage {
	
	
	public AllOrdersPage() {
		
		PageFactory.initElements(Driver.getDriver(), this); // This statement is initializing the variables that are tagged
																//with @FindBy annotations
			
		}
	
	
	
	@FindBy (xpath = "//ul[@id='ctl00_menu']//li")
	public List<WebElement> list;
	
	
	
	@FindBy (id = "ctl00_MainContent_btnCheckAll")
	public WebElement checkAllButton;
	
	@FindBy (className = "btnDeleteSelected")
	public WebElement deleteButton;
	
	@FindBy (id = "ctl00_MainContent_orderMessage")
	public WebElement message;
	
	@FindBy (xpath = "//a[.='View all products']")
	public WebElement productPageLink;
	
	
	
	
	
	

}
