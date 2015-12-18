package stepDefinition;

import org.junit.Test;
import org.openqa.selenium.By;


public class Failure  extends Constants{
	@Test
	public void failureTest()
	{
		driver.findElement(By.id("abc")).click();
	}


}
