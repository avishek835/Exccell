package pageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutUsPageClass {
	WebDriver driver;
	
	By AboutUsMenu= By.xpath("//*[@id=\"menu-item-18\"]/a");
	By AboutUsHyperlink=By.xpath("/html/body/div[2]/section/div/div/div[2]/div/div/ul/li[2]/a");
	By OurMissionHyperlink=By.xpath("/html/body/div[2]/section/div/div/div[2]/div/div/ul/li[3]/a");
	By GetinTouchButton=By.xpath("/html/body/div[2]/section/div/div/div[2]/div/div/a");
	By DummyTextHeading=By.xpath("/html/body/div[2]/section/div/div/div[2]/div/h2");
	By Logo=By.xpath("//*[@id=\"page_head\"]/nav/div/div[1]/a/img");
	
	public AboutUsPageClass(WebDriver driver) {
	this.driver=driver;
	}
	
	public void aboutUsMenu()
	{
		 driver.findElement(AboutUsMenu).click();
	}
	
	public  void aboutUsHyperlink()
	{
		 driver.findElement(AboutUsHyperlink).click();
	}
	
	public void  ourMissionHyperlink()
	{
		 driver.findElement(OurMissionHyperlink).click();
	}
	
	public String dummyTextHeading()
	{
		return driver.findElement(DummyTextHeading).getText();
	}
	
	public void getinTouchButton()
	{
		 driver.findElement(GetinTouchButton).click();
	}
	
	public void logo()
	{
		 driver.findElement(Logo).click();
	}

}
