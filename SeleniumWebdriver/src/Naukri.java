import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Naukri {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.naukri.com/");
		driver.findElement(By.xpath("//*[@id='login_Layer']/span")).click();
		Set<String> windowids=driver.getWindowHandles();
		System.out.println(windowids.size());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='eLogin']")).sendKeys("admin");

	}

}
