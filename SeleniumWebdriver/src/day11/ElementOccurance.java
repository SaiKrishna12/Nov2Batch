package day11;

import java.sql.Driver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementOccurance {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUP()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		driver=new FirefoxDriver(fp);
		driver.get("https://en.wikipedia.org/wiki/Rajinikanth");
	}
	@Test
	public void occuranceTest()
	{
		String str=driver.getPageSource();
		String[] a=str.split("Rajinikanth");
		System.out.println(a.length-1);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	
	
	
	

}
