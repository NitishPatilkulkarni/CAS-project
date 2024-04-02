package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class india_AmericaCalendarpage extends basePage {

	WebDriver driver;
	
	//Constructor
	
	public india_AmericaCalendarpage(WebDriver driver)
	{
		super(driver);
	}
	
	
	//Elements
	
	//for clicking on select all radio button
	@FindBy(xpath="(//i[@data-icon-name='StatusCircleCheckmark'])[1]")
	WebElement Element_Select_All_Button;
	
	//for taking the count of calendars Selected
	@FindBy(xpath="(//div[@data-automationid='ListCell'])")
	List<WebElement> total_count_of_selected;
	
	//To Validate if We can download them or no
	@FindBy(xpath="(//i[@data-icon-name='download'])")
	public WebElement Element_Download_Button;
		
	//To validate element of "12 selected"
	@FindBy(xpath="(//span[contains(text(),'selected')])")
	WebElement Selected_Count_txt_element;
		
	//for Clicking on De - selecting  all the selected documents
	@FindBy(xpath="(//i[@data-icon-name='StatusCircleCheckmark'])[1]")
	WebElement De_Select;
		
	//for Moving mouse and Clicking on India_Holiday_Calendars_2024 Document
	@FindBy(xpath="(//div[@data-automationid='DetailsRowCell'])[47]")
	WebElement India_Holiday_Calendars_2024_Doc;
	
	
	
	//Action Methods
	
	public void ClickOnSelectAllRadioBtn()
	{
		Element_Select_All_Button.click();
	}
	
	public String getTotalCountSelected() {
		int selectedSize = total_count_of_selected.size();
		return String.valueOf(selectedSize);
	}
	
	public String getTotalCountSelected2() {
		String Selected_Count_txt = Selected_Count_txt_element.getText();
		String Selected_Count_txt_num=Selected_Count_txt.split("\\s+")[0];
		return Selected_Count_txt_num;
	}
	
	
	public boolean isClickable(WebElement element, String string) {
		// TODO Auto-generated method stub
		try {
			return element.isEnabled() && element.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	public void clickonDownloadBtn()
	{
		Element_Download_Button.click();
	}
	public void clickOnSelectAllAgain()
	{
		De_Select.click();
	}
	
	public WebElement hoverOnIndiaCalendar()
	{
		
		return India_Holiday_Calendars_2024_Doc;
		
		
		
	}
	
	public void ClickOnIndiaCalendar()
	{
		
		India_Holiday_Calendars_2024_Doc.click();
		
	}
	

}
