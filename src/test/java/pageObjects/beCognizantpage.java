package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class beCognizantpage extends basePage{
	WebDriver driver;
	
	//Constructor
	public beCognizantpage(WebDriver driver)
	{
		super(driver);
	}

	//Elements
	
	//For clicking on User Symbol
	@FindBy(xpath="//div[@class='_8ZYZKvxC8bvw1xgQGSkvvA==']")
	WebElement linkclkOnUserSymbol;
	
	//For capturing User name
	@FindBy(xpath="//div[@id='mectrl_currentAccount_primary']")
	WebElement linkgetUserName;
	
	//For capturing User Email id
	@FindBy(xpath="//div[@id='mectrl_currentAccount_secondary']")
	WebElement linkgetUserEmailid;
	
	//For clicking on User Symbol again
	@FindBy(xpath="(//div[@id='mectrl_headerPicture'])")
	WebElement linkclkOnUserSymbolagain;
	
	//For clicking on Holiday Calendars
	@FindBy(xpath="//div[@title='Holiday Calendars']")
	WebElement element_holidaycalendar;
	
	//Actions Methods
	
	
	public void clickOnUserSymbol()
	{
		linkclkOnUserSymbol.click();
	}
	
	public String captureUserName()
	{
		return linkgetUserName.getText();
		
	}
	
	public String captureUserEmailid()
	{
		return linkgetUserEmailid.getText();
	}
	
	public void clickOnUserSymbolAgain()
	{
		linkclkOnUserSymbolagain.click();
	}

	public WebElement scrollTillHolidayCalendar()
	{
		return element_holidaycalendar;
		
	}
	
	public void clickOnHolidayCalendar()
	{
		element_holidaycalendar.click();
	}
	
	
	
	
	
}
