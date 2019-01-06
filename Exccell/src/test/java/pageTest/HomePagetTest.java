package pageTest;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import base.Base;
import pageClass.HomePageClass;
import utility.Util;



public class HomePagetTest extends Base{
	
	ExtentReports rep=Util.getInstance();
	
	String s;
	HomePagetTest() {
		super();
			}


		
	@Test
	public   void home()
	{
		test.log(LogStatus.INFO, "HOME PAGE TESTING.");
		HomePageClass hpc= new HomePageClass(driver);
		s=hpc.getBannername();
		if(s!=null)
		{
			System.out.println(s);
			test.log(LogStatus.PASS, "banner name 'Discover' is showing.");
			Util.takeScreenShot(driver,"E:\\SELENIUM\\ScreenShot", "ss.png");
			test.log(LogStatus.PASS, " Screen Shot: "+test.addScreenCapture(Util.takeScreenShot(driver, "E:\\SELENIUM\\ScreenShot", "ss.png")));
			
		}
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 750);");
		hpc.getReadMore();
		test.log(LogStatus.PASS, "Click on read more button.");
		s=hpc.getAboutUs();
		test.log(LogStatus.PASS, "About us page  is showing.");
		Util.takeScreenShot(driver,"E:\\SELENIUM\\ScreenShot", "ss.png");
		test.log(LogStatus.PASS, " Screen Shot: "+test.addScreenCapture(Util.takeScreenShot(driver, "E:\\SELENIUM\\ScreenShot", "ss.png")));
		
		if(s!=null)
		{
			System.out.println("Banner text in About Us page is: " +s);
			test.log(LogStatus.PASS, "About us text  is showing inside banner in about us page.");
			
		}
		hpc.getLogo();
		test.log(LogStatus.PASS, "Click on Exccell logo from About Us page.");
		Util.takeScreenShot(driver,"E:\\SELENIUM\\ScreenShot", "ss.png");
		test.log(LogStatus.PASS, " Screen Shot: "+test.addScreenCapture(Util.takeScreenShot(driver, "E:\\SELENIUM\\ScreenShot", "ss.png")));
		
		
		jse.executeScript("scroll(0, 1600);");
		hpc.readMore2();
		Util.takeScreenShot(driver,"E:\\SELENIUM\\ScreenShot", "ss.png");
		test.log(LogStatus.PASS, " Screen Shot: "+test.addScreenCapture(Util.takeScreenShot(driver, "E:\\SELENIUM\\ScreenShot", "ss.png")));
		
		hpc.getLogo();
		jse.executeScript("scroll(0, 2000);");
		hpc.readMore3();
		Util.takeScreenShot(driver,"E:\\SELENIUM\\ScreenShot", "ss.png");
		test.log(LogStatus.PASS, " Screen Shot: "+test.addScreenCapture(Util.takeScreenShot(driver, "E:\\SELENIUM\\ScreenShot", "ss.png")));
		
		hpc.getLogo();
		jse.executeScript("scroll(0, 2400);");
		hpc.readMore4();
		Util.takeScreenShot(driver,"E:\\SELENIUM\\ScreenShot", "ss.png");
		test.log(LogStatus.PASS, " Screen Shot: "+test.addScreenCapture(Util.takeScreenShot(driver, "E:\\SELENIUM\\ScreenShot", "ss.png")));
		
		hpc.getLogo();
		jse.executeScript("scroll(0, 2800);");
		hpc.residential();
		Util.takeScreenShot(driver,"E:\\SELENIUM\\ScreenShot", "ss.png");
		test.log(LogStatus.PASS, " Screen Shot: "+test.addScreenCapture(Util.takeScreenShot(driver, "E:\\SELENIUM\\ScreenShot", "ss.png")));
		
		hpc.back();
		hpc.commercial();
		Util.takeScreenShot(driver,"E:\\SELENIUM\\ScreenShot", "ss.png");
		test.log(LogStatus.PASS, " Screen Shot: "+test.addScreenCapture(Util.takeScreenShot(driver, "E:\\SELENIUM\\ScreenShot", "ss.png")));
		
		hpc.back();
		hpc.majorRenovations();
		Util.takeScreenShot(driver,"E:\\SELENIUM\\ScreenShot", "ss.png");
		test.log(LogStatus.PASS, " Screen Shot: "+test.addScreenCapture(Util.takeScreenShot(driver, "E:\\SELENIUM\\ScreenShot", "ss.png")));
		
		hpc.back();
		hpc.newConstruction();
		Util.takeScreenShot(driver,"E:\\SELENIUM\\ScreenShot", "ss.png");
		test.log(LogStatus.PASS, " Screen Shot: "+test.addScreenCapture(Util.takeScreenShot(driver, "E:\\SELENIUM\\ScreenShot", "ss.png")));
		
		hpc.back();
		Util.takeScreenShot(driver,"E:\\SELENIUM\\ScreenShot", "ss.png");
		test.log(LogStatus.PASS, " Screen Shot: "+test.addScreenCapture(Util.takeScreenShot(driver, "E:\\SELENIUM\\ScreenShot", "ss.png")));
		
		
		
		test.log(LogStatus.PASS, "Test Pass");
		
		rep.endTest(test);
		rep.flush();
		
	}

}
