package day21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginusingProperties {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com/index.php/auth/login");
	}
	@Test
	public void loginTest() throws IOException
	{
		FileInputStream f=new FileInputStream("E:\\Nov2Batch\\SeleniumWebdriver\\OrangeHRM.properties");
		Properties pr=new Properties();
		pr.load(f);
		driver.findElement(By.id(pr.getProperty("userName"))).sendKeys("Admin");
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys("admin");
		driver.findElement(By.id(pr.getProperty("login"))).click();
	}
	

}
