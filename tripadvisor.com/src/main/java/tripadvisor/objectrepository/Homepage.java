package tripadvisor.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tripadvisor.Genericlib.WebDriverCommonLib;

public class Homepage extends WebDriverCommonLib{
	
	@FindBy(xpath="//div[@title='Search']")
	private WebElement searchbtn;
	  
	@FindBy(id="mainSearch")
	private WebElement mainsearchbtn;
	
    @FindBy(xpath="//div[contains(@class,'search_overlay')]/descendant::div[contains(@class,'results_panel')]/descendant::li")
    private WebElement resultpanel;

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getMainsearchbtn() {
		return mainsearchbtn;
	}

	public WebElement getResultpanel() {
		return resultpanel;
	}
    
    
}
