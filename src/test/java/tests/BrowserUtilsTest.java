package tests;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import utilities.BrowserUtilities;
import utilities.Driver;

public class BrowserUtilsTest {



	
	@Test
	public void test1() {
		System.out.println(System.getProperty("user.dir"));
//		Driver.getDriver().get("https://www.duotech.io/");
//		Driver.getDriver().findElement(By.id("comp-k043kr8ilabel")).click();
//		
//		BrowserUtilities.switchToWindow("AWS Certified Solutions Architect – Associate Certification");
//		
//		System.out.println(Driver.getDriver().getTitle());
		
//		 TakesScreenshot ts = (TakesScreenshot) Driver.getDriver(); //create the object of TakesScreenshot interface
//	     
//		 File source = ts.getScreenshotAs(OutputType.FILE);
//		 
//		 String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	     
		// String path = System.getProperty("user.dir") + "/test-output/Screenshots/" + fileName + date + ".png";
	     
	//     File finalDestination = new File(path);
	     
	  //   FileUtils.copyFile(source, finalDestination);
		
		
	}

}
