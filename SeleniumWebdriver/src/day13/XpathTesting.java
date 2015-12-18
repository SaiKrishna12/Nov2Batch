package day13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class XpathTesting {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUP()
	{
		driver=new FirefoxDriver();
		driver.get("https://news.google.co.in/");
	}
	@Test
	public void xpathTest()
	{
		List<WebElement> headlines=driver.findElements(By.xpath("//h2/a/span[@class='titletext']"));
		for(int i=0;i<headlines.size();i++)
		{
			System.out.println(headlines.get(i).getText());
		}
	}
}
