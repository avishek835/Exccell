package pageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageClass {
	
	WebDriver driver; //interphase
	
	By bannerName= By.xpath("/html/body/div[3]/div/div/div/div/h1");
	By readMore1=By.xpath("/html/body/div[3]/section[1]/div/div/div[2]/div/a");
	By logo=By.xpath("//*[@id=\"page_head\"]/nav/div/div[1]/a/img");
	By About=By.xpath("/html/body/div[2]/div/div/div/div/h2");
	By readMore2=By.xpath("/html/body/div[3]/section[3]/div/div[2]/div[1]/div[2]/div/a");
	By readMore3=By.xpath("/html/body/div[3]/section[3]/div/div[2]/div[2]/div[1]/div[1]/div/a");
	By readMore4=By.xpath("/html/body/div[3]/section[3]/div/div[2]/div[2]/div[2]/div/div[2]/div/a");
	By residential=By.xpath("/html/body/div[3]/section[4]/div[1]/div/div/h3/a");
	By commercial=By.xpath("/html/body/div[3]/section[4]/div[2]/div/div/h3/a");
	By majorRenovations=By.xpath("/html/body/div[3]/section[4]/div[3]/div/div/h3/a");
	By newConstruction=By.xpath("/html/body/div[3]/section[4]/div[4]/div/div/h3/a");
	
	public HomePageClass(WebDriver driver) {
	this.driver=driver;
	}
	
	public String getBannername()
	{
		return driver.findElement(bannerName).getText();
	}
	
	public  void getReadMore()
	{
		 driver.findElement(readMore1).click();
	}
	
	public String getAboutUs()
	{
		return driver.findElement(About).getText();
	}
	
	public void getLogo()
	{
		driver.findElement(logo).click();
	}
	
	public void readMore2()
	{
		driver.findElement(readMore2).click();
	}
	
	public void readMore3()
	{
		driver.findElement(readMore3).click();
	}
	
	public void readMore4()
	{
		driver.findElement(readMore4).click();
	}
	
	public void residential()
	{
		driver.findElement(residential).click();
	}
	
	public void commercial()
	{
		driver.findElement(commercial).click();
	}
	
	public void majorRenovations()
	{
		driver.findElement(majorRenovations).click();
	}
	
	public void newConstruction()
	{
		driver.findElement(newConstruction).click();
	}
	
	public void back()
	{
		driver.navigate().back();
	}
	
	
	
	

}
