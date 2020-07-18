package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utilities.ConfigReader;
import utilities.Driver;

public abstract class TestBase {
	
	String st;
	
protected WebDriver driver;
protected Actions actions;

protected static ExtentReports reporter;
protected static ExtentSparkReporter htmlReporter;
protected static ExtentTest logger;

	@BeforeSuite
	public void setUpSuite() {
		reporter = new ExtentReports();
		String path = System.getProperty("user.dir")+"/test-output/ExtentReports/report.html";
		
		htmlReporter = new ExtentSparkReporter(path);
		htmlReporter.config().setReportName("Web Orders Automation Test Reports");
		
		reporter.attachReporter(htmlReporter);
		
		reporter.setSystemInfo("Tester", "John Doe");
		reporter.setSystemInfo("ENV", "Staging/Pre-Production");
		reporter.setSystemInfo("OS", System.getProperty("os.name"));
		reporter.setSystemInfo("browser", ConfigReader.getProperty("browser"));
		
	}



	
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
	
	
	@AfterSuite
	
	public void tearDownSuite() {
		reporter.flush();
	}
	
	
	

}
