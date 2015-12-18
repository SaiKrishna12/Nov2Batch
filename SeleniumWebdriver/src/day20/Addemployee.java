package day20;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Addemployee extends Constants{
	@Test
	public void addEmployeeTest()
	{
		Actions action=new Actions(driver);
		WebElement pim=driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b"));
		action.moveToElement(pim).build().perform();
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.linkText("Add Employee")).click();
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.id("firstName")).sendKeys("Sai");
		driver.findElement(By.id("middleName")).sendKeys("Krishna");
		driver.findElement(By.id("lastName")).sendKeys("g");
		driver.findElement(By.id("employeeId")).sendKeys("111");
		driver.findElement(By.id("btnSave")).click();
		
		
	}

}
