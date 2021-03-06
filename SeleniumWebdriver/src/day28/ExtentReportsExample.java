package day28;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ExtentReportsExample {


	public static void main(String[] args) throws IOException {
		ExtentReports reports=new ExtentReports("E:\\Nov2Batch\\SeleniumWebdriver\\src\\com\\qedge\\reports\\Google.html",true);
		ExtentTest test=reports.startTest("Sample Test");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		test.log(LogStatus.INFO,"Navigated to url");
		driver.findElement(By.name("q")).sendKeys("selenium");
		test.log(LogStatus.INFO,"entered selenium in search box");
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File("E:\\Nov2Batch\\SeleniumWebdriver\\src\\com\\qedge\\screenshots\\Google.png"));
		test.addScreenCapture("E:\\Nov2Batch\\SeleniumWebdriver\\src\\com\\qedge\\screenshots\\Google.png");
		reports.endTest(test);
		reports.flush();
	}

}
