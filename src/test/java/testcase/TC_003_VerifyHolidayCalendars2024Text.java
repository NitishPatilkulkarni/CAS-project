package testcase;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.holidayCalendarpage;

public class TC_003_VerifyHolidayCalendars2024Text extends TC_002_VerifyNavigationOfHolidaySchedulePage{
	
	@Test(priority=3)
	public void VerifyHolidayCalendars2024Text()
	{
		logger.info("***** Starting TC_003_VerifyHolidayCalendars2024Text *****");
		
		
		holidayCalendarpage hcp= new holidayCalendarpage(driver);
		
		logger.info("Validating Holiday Calendars - 2024 Text...");
		String ActualholidayCalendarsText=hcp.validateholidayscheduleTitle();
		String ExpectedholidayCalendarsText= p.getProperty("ExpHC24_text");
		SoftAssert sa = new SoftAssert();
		if(ActualholidayCalendarsText.equals(ExpectedholidayCalendarsText)) {
			logger.info("Holiday Calendars - 2024 Text verified...");
			sa.assertTrue(true);
		}
		else {
			logger.error("Invalid Text...");
			sa.fail();
		}
		logger.info("***** Ending TC_003_VerifyHolidayCalendars2024Text *****");

		
		
		
	}

}
