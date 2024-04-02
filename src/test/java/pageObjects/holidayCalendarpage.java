package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class holidayCalendarpage extends basePage{

	WebDriver driver; 
	
	//Constructor
	public holidayCalendarpage(WebDriver driver)
	{
		super(driver);
	}
	
	
	//Get URL of The page twice Pending
	
	//Elements
	
	//for Capturing Info of holidayCalendar page
	@FindBy(xpath="//*[@id=\"7d9c4d31-51ad-4f1c-bf62-199efc659c76\"]/div/div")
	WebElement holidayCalendarInfoCapture;
	
	//for Validating holidayscheduleTitle
	@FindBy(xpath="(//div[@title='Holiday Schedules'])")
	WebElement element_holidayscheduleTitle;
		
	//for Clicking on people
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/button[1]/span[1]/span[1]/span[1]")
	WebElement lnkClickonPeople;
		
	//to hover on Element_Rewards_life_work
	@FindBy(xpath="//span[normalize-space()='Rewards, Life and Work']")
	WebElement Element_Rewards_life_work;

	//for clicking on Holiday_Schedules
	@FindBy(xpath="//span[normalize-space()='Holiday Schedules']")
	WebElement Element_Holiday_Schedules;
		
	//for validating text Holiday_Calendars_2024
	@FindBy(xpath="//*[@id='holiday-calendars-2024']/span[1]/strong")
	WebElement Holiday_Calendars_2024_text_element;
		
	//for Hovering on India_America_UK_Calendar Area
	@FindBy(xpath="(//div[@data-automation-id='CanvasSection'])[4]")
	WebElement India_America_UK_Calendar_area;
		
	//for clicking India_America_UK_Calendar_Button
	@FindBy(xpath="//span[@id='id__49']")
	WebElement India_America_UK_Calendar_Button;
	
	
	//Action Methods
	
	
	public String captureHolidayCalendarPageInfo()
	{
		return holidayCalendarInfoCapture.getText();
	}
	
	
	//validate holidayscheduleTitle
	public String validateholidayscheduleTitle()
	{
		return element_holidayscheduleTitle.getText();
	}
	
	
	public void ClickonPeople()
	{
		lnkClickonPeople.click();
	}
	
	
	public WebElement hoverOnRewards_life_work()
	{
		
		return Element_Rewards_life_work;
	}
	
	public String CurrentURL()
	{
		return driver.getCurrentUrl();
	}
	
	public void ClickOnHoliday_Schedules()
	{
		Element_Holiday_Schedules.click();
	}
	
	
	//validating text Holiday_Calendars_2024
	public String validateTextHolidayCalendars()
	{
		return Holiday_Calendars_2024_text_element.getText();
	}
	
	public WebElement HoverOnIndiaAmericaUK()
	{
		return India_America_UK_Calendar_area;
		
	}
	
	public void ClickOnIndiaAmericaUK()
	{
		India_America_UK_Calendar_Button.click();
	}
	
}


