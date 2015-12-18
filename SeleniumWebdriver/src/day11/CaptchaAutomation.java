package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptchaAutomation {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.harvard.edu/feedback");
		int l=0;
		while(l<10)
		{
			driver.findElement(By.id("edit-submitted-name")).sendKeys("tester");
			driver.findElement(By.id("edit-submitted-email")).sendKeys("tester@gmail.com");
			driver.findElement(By.id("edit-submitted-comment")).sendKeys("Stupid change the cpathca code");
			String x=driver.findElement(By.className("field-prefix")).getText();
			String[] a=x.split(" ");
			int i=Integer.parseInt(a[0]);
			int j=Integer.parseInt(a[2]);
			int k=i+j;
			String str=Integer.toString(k);
			driver.findElement(By.id("edit-captcha-response")).sendKeys(str);
			Thread.sleep(4000);
			//driver.findElement(By.name("op")).click();
			driver.navigate().refresh();
		}
	}

}
