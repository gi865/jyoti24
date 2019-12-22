package com.assignment.Genericlib;

import java.io.File;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;



public class BaseClass {

	public static FileLib eLib = new FileLib();
	public ExtentReports extent;
	public ExtentTest logger;
	public static WebDriver driver;


@BeforeClass
public void configBc() throws Throwable, InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException{
	
	String browser = eLib.getPropertyFileData("browser");
	String url = eLib.getPropertyFileData("url");
	String url1=eLib.getPropertyFileData("url1");
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


