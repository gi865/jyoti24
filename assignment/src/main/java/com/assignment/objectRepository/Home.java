package com.assignment.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.assignment.Genericlib.WebDriverCommonLib;

public class Home extends WebDriverCommonLib {
	
	 @FindBy(xpath="//button[text()='✕']")
	 private WebElement Hiddenwindow;
	
	 @FindBy(name="q")
	 private WebElement flipsearchbtn;
	 
	 @FindBy(id="twotabsearchtextbox")
	 private WebElement amazsearchbtn;
	 
	 public WebElement getHiddenwindow() {
			return Hiddenwindow;
		}

		public WebElement getFlipsearchbtn() {
			return flipsearchbtn;
		}

		public WebElement getAmazsearchbtn() {
			return amazsearchbtn;
		}

	 
	 
	 
	
}
