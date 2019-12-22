package com.assignment.flipkart;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.assignment.Genericlib.BaseClass;
import com.assignment.objectRepository.Home;
import com.assignment.objectRepository.Resultpage;

@Listeners

public class iphonepirce extends BaseClass {
	
	@Test
	
	public void iphoneprice() {
		
		Home home=PageFactory.initElements(driver,Home.class);
		/* click on hidden window */
		home.getHiddenwindow().click();
		/* search for iphone xr 64 GB yellow */
		home.getFlipsearchbtn().sendKeys("iphone xr 64 GB yellow",Keys.ENTER);
		
		Resultpage resultpage=PageFactory.initElements(driver, Resultpage.class);
		/* get the iphone price */
		resultpage.getflipprice().getText().replace("₹", "").replaceAll(",", "");
		/* prinitng the iphone price on console */
		Reporter.log("FLipkart ==> "+resultpage, true);

				
	}
	

}
