package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class indiaCalendar2024page extends basePage {
	
	WebDriver driver;
	
	//Constructor
	public indiaCalendar2024page(WebDriver driver)
	{
		super(driver);
	}

	
	//Elements

	//To Validate if we are navigating to India_Holiday_Calendars_2024_Document or no(Title of Doc)
	@FindBy(xpath="(//span[normalize-space()='India- Holiday Calend....pdf'])[3]")
	public WebElement DocumentNameTitleElement;
			
	//For Clicking on Download button
	@FindBy(xpath="(//i[@data-icon-name=\"Download\"])")
	public WebElement Button_Download;
		
	//For Clicking on options ...
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[4]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/button[1]/span[1]/i[1]")
	WebElement Options_3Dots_Button_Element;
		
	//To validate version history Appearing or no(Capture version history option)
	@FindBy(xpath="//span[normalize-space()='Version history']")
	public WebElement Version_History_element;
		
	//For clicking on version hisory Button
//	@FindBy(xpath="//span[normalize-space()='Version history']")
//	WebElement Version_History_Button;
		
	//To print the version history Contents in console 
	@FindBy(xpath="//div[@id='DeltaPlaceHolderMain']")
	WebElement versionHistoryInfo;
		
	
	
	
	
	//Action Methods
	
	
	
//	public void clickOnDownloadBtn()
//	{
//		Button_Download.click();
//	}
	
	public void clickOnOptions()
	{
		Options_3Dots_Button_Element.click();
	}
	
	
	public void clickOnVersionHistory()
	{
		Version_History_element.click();
	}
	
	public String captureVersionHistoryText()
	{
		return Version_History_element.getText();
	}
	
	public String captureVersionHisDetails()
	{
		return versionHistoryInfo.getText();
	}
	

	
}


