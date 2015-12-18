package com.orangehrm.baseclass;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.server.handler.CaptureScreenshot;

import com.orangehrm.utilty.CapturingScreenshots;
import com.orangehrm.utilty.ExcelOperations;

public class Constants {
	
	static RemoteWebDriver driver=null;
	CapturingScreenshots scr=new CapturingScreenshots();
	ExcelOperations eo=new ExcelOperations();
	String empList="E:\\Nov2Batch\\OrangeHRM\\src\\com\\orangehrm\\excelfiles\\EmployeeList.xlsx";
	String screenshotPath="E:\\Nov2Batch\\OrangeHRM\\src\\com\\orangehrm\\screenshots";
	String dataengine="E:\\Nov2Batch\\OrangeHRM\\src\\com\\orangehrm\\dataengine\\DataEngine.xlsx";
}
