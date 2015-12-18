package day14;

import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class SleeperClassExample {
	@Test
	public void sampleTest()
	{
		System.out.println("ABC");
		Sleeper.sleepTightInSeconds(5);
		System.out.println("XYZ");
		Sleeper.sleepTightInSeconds(5);
		System.out.println("DEF");
	}

}


