package day22;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class FileDownlaodAutoit {

	public static void main(String[] args) throws IOException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://docs.seleniumhq.org");
		driver.findElement(By.linkText("Download")).click();
		driver.findElement(By.linkText("2.48.2")).click();
		Sleeper.sleepTightInSeconds(4);
		java.lang.Runtime.getRuntime().exec("c:\\users\\sai\\desktop\\download.exe");
		
		

	}

}
