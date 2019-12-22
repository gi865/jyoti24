package com.assignment.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Resultpage {
	
	@FindBy(xpath="//div[text()='Apple iPhone XR (Yellow, 64 GB)']/ancestor::div[contains(@class,'row')]/descendant::div[contains(text(),'₹')]")
	private  WebElement flipprice;
	
	@FindBy(xpath="//span[text()='Apple iPhone XR (64GB) - Yellow']/ancestor::div[@class='sg-row']/following-sibling::div[@class='sg-row']/descendant::span[@class='a-price-whole']")
	private WebElement amazprice;

	public WebElement getflipprice() {
		return  flipprice;
	}

	public WebElement getAmazprice() {
		return amazprice;
	}

	
	}
	
    

