package day14;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Explicitwait_Fluentwait {
	public class ExplicitWait_webdriverwait {
		FirefoxDriver driver;
		@BeforeMethod
		public void setUP()
		{
			driver=new FirefoxDriver();
			driver.get("https://pvrcinemas.com");
		}
		@Test
		public void  waitTest()
		{
			FluentWait<WebDriver> fwait=new FluentWait<WebDriver>(driver).withTimeout(45,TimeUnit.SECONDS).pollingEvery(2,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
			fwait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='carousel-example-generic']/div/div[1]/div/div/div/span/a")));
			fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='carousel-example-generic']/div/div[2]/div/div/div/span/a"))).click();
		}
	}

}
