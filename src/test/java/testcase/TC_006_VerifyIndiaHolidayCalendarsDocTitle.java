package testcase;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.indiaCalendar2024page;
import pageObjects.india_AmericaCalendarpage;
//import utilities.TakeScreenshot;


public class TC_006_VerifyIndiaHolidayCalendarsDocTitle extends TC_005_ValidateDocumentsDownloadable{

	@Test(priority = 6)
	public void VerifyIndiaHolidayCalendarsDocTitle() throws IOException, InterruptedException 
	{
		logger.info("***** Starting TC_006_VerifyIndiaHolidayCalendarsDocTitle *****");
		
		india_AmericaCalendarpage IAC = new india_AmericaCalendarpage(driver);
		
		indiaCalendar2024page ICP = new indiaCalendar2024page(driver);
		
		IAC.clickonDownloadBtn();
		logger.info("Clicked on Download Button");

		IAC.clickOnSelectAllAgain();
		logger.info("Clicked on De-Select");
		
		Actions act = new Actions(driver);
		act.moveToElement(IAC.hoverOnIndiaCalendar()).perform();
		logger.info("Hovered On India Calendar 2024 Document");
		
		IAC.ClickOnIndiaCalendar();
		logger.info("Clicked On India Calendar 2024 Document");
			
		logger.info("Validating India Calendar Document Title...");
		String actualTitleDoc= ICP.DocumentNameTitleElement.getText();
		String ExpTitleDoc=p.getProperty("ExpIndDoc_title");
		SoftAssert sa = new SoftAssert();
		if(actualTitleDoc.equals(ExpTitleDoc)) {
			logger.info("India Calendar Document Title verified...");
			sa.assertTrue(true);
		}
		else {
			logger.error("Invalid Document Title...");
			sa.fail();
		}
		
		logger.info("***** Ending TC_006_VerifyIndiaHolidayCalendarsDocTitle *****");
		

		
		
}
}

