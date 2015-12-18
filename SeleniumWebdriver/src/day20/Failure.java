package day20;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Failure  extends Constants{
	@Test
	public void failureTest()
	{
		driver.findElement(By.id("abc")).click();
	}


}
