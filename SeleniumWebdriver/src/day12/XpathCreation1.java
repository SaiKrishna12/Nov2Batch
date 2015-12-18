package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class XpathCreation1 {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUP()
	{
		driver=new FirefoxDriver();
		driver.get("http://gmail.com");
	}
	@Test
	public void xpathTest()
	{
		String x=driver.findElement(By.xpath("//p[@class='tagline']")).getText();
		System.out.println(x);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
