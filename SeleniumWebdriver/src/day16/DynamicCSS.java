package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicCSS {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUP()
	{
		driver=new FirefoxDriver();
		driver.get("http://enterprise.demo.orangehrmlive.com/");
	}
	@Test
	public void CSSTest()
	{
		driver.findElement(By.cssSelector("input[id^='txtUser']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[id$='Password']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[id*='nLog']")).click();
	}

}
