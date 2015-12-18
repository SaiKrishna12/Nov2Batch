package day30;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class JavaScriptExecutorExample {

	
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('Hello Friends');");
		Sleeper.sleepTight(4);
		Alert alert=driver.switchTo().alert();
		alert.accept();

	}

}