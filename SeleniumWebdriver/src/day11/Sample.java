package day11;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	@Test(priority=0)
	public void loginTest()
	{
		System.out.println("This is for login app");
	}
	@Test(priority=1)
	public void registation()
	{
		System.out.println("This is for reg");
	}
	@Test(enabled=false)
	public void logoutTest()
	{
		System.out.println("This is for logout");
	}
	@BeforeMethod
	public void samplefunction()
	{
		System.out.println("ABC");
	}

}
