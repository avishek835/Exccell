package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class Util {

	private static File screenshotFile;
	private static ExtentReports extent;
	public  static ChromeDriver openBrowser() 
	{
	System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Drivers\\chromedriver.exe");
	
	return new ChromeDriver();
		}
	
	public static  void  maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	public static void exccellURL(WebDriver driver)
	{
		driver.get("http://demo.switch2webpro.com/exccell/");
	}
	
	public static ExtentReports getInstance()
	{
		if(extent==null){
			Date d=new Date();
			String fileName=d.toString().replace(":","_").replace(" ","_")+".html";
			extent=new ExtentReports("E:\\SELENIUM\\report\\"+fileName, true, DisplayOrder.NEWEST_FIRST);
			extent.loadConfig(new File(System.getProperty("user.dir")+"//ReportsConfig.xml"));
		}
		return extent;

	}
	
	public static String takeScreenShot(WebDriver chDriver, String filePath, String fileName) 
	{
		String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		screenshotFile = ((TakesScreenshot)chDriver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotFile, new File(filePath+"\\"+fileName+timeStamp+".png"));
			return filePath+"\\"+fileName+timeStamp+".png";
			}
		catch(IOException e) 
							{
								e.printStackTrace();
								return "Unable to get file!!";
							}
	}
}
