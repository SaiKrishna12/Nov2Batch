package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicXpaths {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUP()
	{
		driver=new FirefoxDriver();
		driver.get("https://yahoo.com");
	}
	@Test
	public void xpathTest()
	{
		driver.findElement(By.xpath("//*[starts-with(@id,'yui_3_12_0_1_14480')]/div/ul[1]/li[13]/a")).click();
	}

}
