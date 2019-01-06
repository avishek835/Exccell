package pageTest;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import base.Base;
import pageClass.AboutUsPageClass;
import utility.Util;

public class AboutUsPageTest extends Base{
	
ExtentReports rep=Util.getInstance();
	
	String s;
	AboutUsPageTest() {
		super();
			}

	@Test
	public void aboutUs()
	{
		test.log(LogStatus.INFO, "ABOUT US PAGE TESTING.");
		
		AboutUsPageClass aupc= new AboutUsPageClass(driver);
		aupc.aboutUsMenu();
		test.log(LogStatus.INFO, "Clicked on About Us Menu.");
		Util.takeScreenShot(driver,"E:\\SELENIUM\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, " Screen Shot: "+test.addScreenCapture(Util.takeScreenShot(driver, "E:\\SELENIUM\\ScreenShot", "ss.png")));
		
		aupc.aboutUsHyperlink();
		test.log(LogStatus.INFO, "Clicked on About us Hyperlink.");
		Util.takeScreenShot(driver,"E:\\SELENIUM\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, " Screen Shot: "+test.addScreenCapture(Util.takeScreenShot(driver, "E:\\SELENIUM\\ScreenShot", "ss.png")));
		
		aupc.ourMissionHyperlink();
		test.log(LogStatus.INFO, "Clicked on Our Mission Hyperlink.");
		Util.takeScreenShot(driver,"E:\\SELENIUM\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, " Screen Shot: "+test.addScreenCapture(Util.takeScreenShot(driver, "E:\\SELENIUM\\ScreenShot", "ss.png")));
		
		
		s=aupc.dummyTextHeading();
		if(s!=null)
		{
			System.out.println(s);
			test.log(LogStatus.INFO, "Dummy text 'Lorem Ipsum' is showing.");
			Util.takeScreenShot(driver,"E:\\SELENIUM\\ScreenShot", "ss.png");
			test.log(LogStatus.INFO, " Screen Shot: "+test.addScreenCapture(Util.takeScreenShot(driver, "E:\\SELENIUM\\ScreenShot", "ss.png")));
			
		}
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 250);");
		test.log(LogStatus.INFO, "Clicked on get touch button.");
		aupc.getinTouchButton();
		test.log(LogStatus.INFO, "Contact us page is showing.");
		Util.takeScreenShot(driver,"E:\\SELENIUM\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, " Screen Shot: "+test.addScreenCapture(Util.takeScreenShot(driver, "E:\\SELENIUM\\ScreenShot", "ss.png")));
		test.log(LogStatus.INFO, "Clicked on logo from Contact Us page.");
		aupc.logo();
		test.log(LogStatus.INFO, "Now Home page  is showing.");
		Util.takeScreenShot(driver,"E:\\SELENIUM\\ScreenShot", "ss.png");
		test.log(LogStatus.INFO, " Screen Shot: "+test.addScreenCapture(Util.takeScreenShot(driver, "E:\\SELENIUM\\ScreenShot", "ss.png")));
		
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
		
	}

}
