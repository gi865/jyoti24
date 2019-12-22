package com.assignment.amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.assignment.Genericlib.BaseClass;
import com.assignment.objectRepository.Home;
import com.assignment.objectRepository.Resultpage;

public class iponeprics extends BaseClass {
	
@Test
	
	public void iphoneprice() {
		
		Home home=PageFactory.initElements(driver,Home.class);
		
		/* search for iphone xr 64 GB yellow */
		home.getAmazsearchbtn().sendKeys("iphone xr 64 GB yellow",Keys.ENTER);
		
		Resultpage resultpage=PageFactory.initElements(driver, Resultpage.class);
		/* get the iphone price */
		resultpage.getAmazprice().getText().replaceAll(",", "");
		/* prinitng the iphone price on console */
		Reporter.log("Amazon ==> "+resultpage, true);

				
	}
	

}



