package day9;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.os.WindowsUtils;

public class KillingwindowProcesses {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WindowsUtils.killByName("firefox.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		Thread.sleep(4000);
		driver.close();
		
		WindowsUtils.killByName("eclipse.exe");
	}

}
