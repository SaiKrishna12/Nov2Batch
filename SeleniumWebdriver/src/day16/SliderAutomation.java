package day16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SliderAutomation {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUP()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.cleartrip.com/flights/international/results?from=HYD&to=ISB&depart_date=27/11/2015&adults=1&childs=0&infants=0&class=Economy&airline=&carrier=&intl=y&sd=1448513023215&domain=www.cleartrip.com&countryCode=in&channel=B2C&tripType=OneWay&price=62446-108359&tripDuration=7-42&layoverDuration=0-22");
	}
	@Test
	public void sliderTest()
	{
		Actions action=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement slider=driver.findElement(By.xpath("//*[@id='ResultContainer_1_1']/section[2]/section/aside[1]/div[1]/form/div/div[2]/div/div/a[1]"));
		int x=slider.getLocation().x;
		int y=slider.getLocation().y;
		System.out.println(x+"--"+y);
		action.dragAndDropBy(slider,x, 45).build().perform();
		
		//action.doubleClick(Webelement).build().perform();
		
	}

}
