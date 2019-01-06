package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utility.Util;

public class Base {
	
	 
	ExtentReports rep=Util.getInstance();
	protected WebDriver driver;
	protected ExtentTest test;
	protected Base()
	{
		test=rep.startTest("Project Exccell Testing");
		test.log(LogStatus.INFO, "Open Browser");
		driver= Util.openBrowser();
		test.log(LogStatus.INFO, "Maximize the window");
		Util.maximizeWindow(driver);
		test.log(LogStatus.INFO, "URL is loaded");
		Util.exccellURL(driver);
	}
	
	
	@BeforeTest
	
	public void browser()
	{
		
		//Base b=new Base();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
               
	}
	
	@AfterTest
	public void quit()
	{
		driver.quit();
	}
	
}
