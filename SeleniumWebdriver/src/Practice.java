import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.os.WindowsUtils;

import com.thoughtworks.selenium.webdriven.Windows;






public class Practice {

	
	public static void main(String[] args) throws MalformedURLException, IOException {
		//WindowsUtils.killByName("iexplore.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8090/orangehrm");
		driver.findElement(By.cssSelector("input[id*='rname']")).sendKeys("Admin");
		/*String response=null;
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			 response=brokenlinks(new URL(links.get(i).getAttribute("href")));
		}*/
		driver.close();
		WindowsUtils.tryToKillByName("eclipse.exe");
		

	}
	public static String brokenlinks(URL url) throws IOException
	{
		String response=null;
		HttpURLConnection conn=(HttpURLConnection)url.openConnection();
		try
		{
			conn.connect();
			response=conn.getResponseMessage();
			conn.disconnect();
		}
		catch(Exception e)
		{
			response=e.getMessage();
		}
		return response;
		
	}

}
