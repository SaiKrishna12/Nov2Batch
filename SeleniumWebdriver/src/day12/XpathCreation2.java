package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class XpathCreation2 {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUP()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.eenadu.net/");
	}
	@Test
	public void xpathTest()
	{
		driver.findElement(By.xpath("//a[@href='Homeinner.aspx?item=break78']")).click();
	
	}

}
