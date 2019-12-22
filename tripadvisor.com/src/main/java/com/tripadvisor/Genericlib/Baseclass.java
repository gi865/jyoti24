package com.tripadvisor.Genericlib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Baseclass {
	public static Filelib eLib = new Filelib();
	public ExtentReports extent;
	public ExtentTest logger;
	public static WebDriver driver;


@BeforeClass
public void configBc() throws Throwable, InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException{
	
	String browser = eLib.getPropertyFileData("browser");
	String url = eLib.getPropertyFileData("url");

	if(browser.equals("firefox")){
	   driver = new FirefoxDriver();
	}else if(browser.equals("chrome")){
		driver = new ChromeDriver();	
	}else if(browser.equals("ie")) {
		
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(url);
}

}
