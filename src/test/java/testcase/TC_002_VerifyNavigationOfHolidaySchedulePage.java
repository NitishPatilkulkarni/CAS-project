package testcase;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.holidayCalendarpage;

public class TC_002_VerifyNavigationOfHolidaySchedulePage extends TC_001_VerifyHolidayScheduleTitle{

	
	@Test(priority=2)
	public void VerifyNavigationOfHolidaySchedulePage()
	{
		logger.info("***** Starting TC_002_VerifyNavigationOfHolidaySchedulePage *****");
		
		holidayCalendarpage hcp= new holidayCalendarpage(driver);
		
		System.out.println();
		String FirstURL=driver.getCurrentUrl();
		hcp.ClickonPeople();
		logger.info("Clicked On People Button");
		
		
		Actions act = new Actions(driver);
		act.moveToElement(hcp.hoverOnRewards_life_work()).perform();
		logger.info("Hovered On Rewards_life_work option");
		
		hcp.ClickOnHoliday_Schedules();
		logger.info("Clicked On Holiday Schedules Option");
		
		System.out.println(driver.getCurrentUrl());
		
		String SecondURL=driver.getCurrentUrl();
		
		//validate URL VerifyNavigationOfHolidaySchedulePage
		logger.info("Validating URL of Holiday Schedules Page...");
		SoftAssert sa = new SoftAssert();
	
		if(FirstURL.equals(SecondURL))
		{
			logger.info("Holiday Schedules Page URL verified...");
			sa.assertTrue(true);
		}
		else
		{
			logger.error("Invalid URL...");
			sa.fail();
		}
		
		logger.info("***** Ending TC_002_VerifyNavigationOfHolidaySchedulePage *****");

	}
}
