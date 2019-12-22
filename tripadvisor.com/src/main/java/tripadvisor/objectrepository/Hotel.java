package tripadvisor.objectrepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class Hotel {
	
	@FindBy(linkText="Write a review")
	private WebElement writereviewbtn;
	
	@FindBy(id="bubble_rating")
	private WebElement ratingbtn;
	
	@FindBy(id="ReviewTitle")
	private WebElement titleofreviewbtn;
	
	@FindBy(id="ReviewText")
	private WebElement reviewtextbtn;
	
	@FindBy(xpath="//div[text()='Hotel Ratings']")
	private WebElement hotelratingbtn;
	
	@FindBy(xpath="//span[contains(@class,'answersBubbles ui_bubble_rating')]")
	private WebElement Hratingbtn;
	
	@FindBy(id="noFraud")
	private WebElement submitbtn;

	public WebElement getWritereviewbtn() {
		return writereviewbtn;
	}

	public WebElement getRatingbtn() {
		return ratingbtn;
	}

	public WebElement getTitleofreviewbtn() {
		return titleofreviewbtn;
	}

	public WebElement getReviewtextbtn() {
		return reviewtextbtn;
	}

	public WebElement getHotelratingbtn() {
		return hotelratingbtn;
	}

	public WebElement getHratingbtn() {
		return Hratingbtn;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}
	
	
}
