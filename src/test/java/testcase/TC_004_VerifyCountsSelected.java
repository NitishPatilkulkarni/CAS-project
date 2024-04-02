package testcase;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.holidayCalendarpage;
import pageObjects.india_AmericaCalendarpage;

public class TC_004_VerifyCountsSelected extends TC_003_VerifyHolidayCalendars2024Text{
	
	@Test(priority=4)
	public void VerifyCountsSelected()
	{
		logger.info("***** Starting TC_004_VerifyCountsSelected *****");

		holidayCalendarpage hcp= new holidayCalendarpage(driver);
		
		india_AmericaCalendarpage IAC = new india_AmericaCalendarpage(driver);
		
		
		Actions act = new Actions(driver);
		act.moveToElement(hcp.HoverOnIndiaAmericaUK()).perform();
		logger.info("Hovered On India America UK Calendar Area");

		
		hcp.ClickOnIndiaAmericaUK();
		logger.info("Clicked On India_America_UK_Calendar");
		
		IAC.ClickOnSelectAllRadioBtn();
		logger.info("Clicked On Select All Radio button");
		
		logger.info("Validating Count Of Selected Documents...");
		String size1 =IAC.getTotalCountSelected();
		String size2 =IAC.getTotalCountSelected2();
		
		SoftAssert sa = new SoftAssert();
		if(size1.equals(size2)) {
			logger.info("Count verified...");
			sa.assertTrue(true);
		}
		else {
			logger.error("Invalid Counts...");
			sa.fail();
		}
		logger.info("***** Ending TC_004_VerifyCountsSelected *****");

	}
		
		
		

	
	
	


}
