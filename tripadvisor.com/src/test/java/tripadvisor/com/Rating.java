package tripadvisor.com;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.tripadvisor.Genericlib.Baseclass;
import com.tripadvisor.Genericlib.WebDriverCommonLib;

import tripadvisor.objectrepository.Homepage;
import tripadvisor.objectrepository.Hotel;

public class Rating extends Baseclass {

	
	
	@Test
	
	public void rating() {
		
		WebDriverCommonLib Lib=new WebDriverCommonLib();
		

		int count = 0;

		while(count<=5)
		{
		try
		{
		//*click on searchbtn
		Homepage home =PageFactory.initElements(driver, Homepage.class);
		home.getSearchbtn().click();
		
		//*click on main searchbtn
		home.getMainsearchbtn().sendKeys("Club Mahindra",Keys.ENTER);
		
		Lib.waitAndClick(home.getResultpanel());
		
		home.getResultpanel().click();
		
		int time=0;
		while(time<=60)
		{
		try
		{
		Hotel hotel=PageFactory.initElements(driver, Hotel.class);
		hotel.getWritereviewbtn().click();
		break;
		}
		
		catch(Throwable e)
		{
		time++;
		}
		
		Lib.getAllWindowIds();
		
		Hotel hotel=PageFactory.initElements(driver, Hotel.class);
		
		
		Lib.mouseMovement(hotel.getRatingbtn(), driver, 50);
		 
		 
		hotel.getWritereviewbtn().sendKeys("Random Review Title");
		
		hotel.getReviewtextbtn().sendKeys("Random Review Text");
		
		try {
			
		  hotel.getHotelratingbtn().click();
			
		  hotel.getHratingbtn();
			  
		  Lib.mouseMovement(hotel.getHratingbtn(), driver, 40);
		  {
		  hotel.getSubmitbtn().click();
		  }
		}
		  catch(Throwable e)
		{
		Reporter.log("Hotel rating Section is not exists");
		}
		break;

		}
		}
		catch(Throwable e) 
		{
		Reporter.log(count + " <- Attempt to GET UI");
		Lib.deletecookies();
		Lib.refresh();
		count++;
		}
	  }
	}
}

	
		
		
	
			  
		  
			
		



		
				
		
		
		
			
		
		