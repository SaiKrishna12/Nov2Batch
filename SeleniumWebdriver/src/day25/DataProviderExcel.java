package day25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExcel {
	
	@DataProvider(parallel=true)
	public Object[][] getData() throws IOException
	{
		FileInputStream f=new FileInputStream("E:\\Nov2Batch\\SeleniumWebdriver\\src\\com\\qedge\\excelfiles\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		int r=ws.getLastRowNum();
		Row row=ws.getRow(0);
		int c=row.getLastCellNum();
		System.out.println(r);
		System.out.println(c);
	
		Object[][] data=new Object[r+1][c];
		for(int i=0;i<=r;i++)
		{
			for(int j=0;j<c;j++)
			{
				data[i][j]=ws.getRow(i).getCell(j).getStringCellValue();
			}
			
		}
		
		
		
		
		return data;
	}
	
	
	
	@Test(dataProvider="getData")
	public void loginTest(String u,String p,String b) throws MalformedURLException
	{
		System.out.println(b);
		DesiredCapabilities cap=null;
		if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(b.equals("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("http://opensource.demo.orangehrm.com/index.php/auth/login");
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("txtUsername")).sendKeys(u);
		driver.findElement(By.id("txtPassword")).sendKeys(p);
		driver.findElement(By.id("btnLogin")).click();
		
		
	}

}
