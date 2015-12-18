package day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://msn.com");
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File("C:\\Users\\sai\\Desktop\\msn.png"));

	}

}
