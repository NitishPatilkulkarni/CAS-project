package testcase;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.beCognizantpage;
import pageObjects.holidayCalendarpage;
import testBase.baseClass;

public class TC_001_VerifyHolidayScheduleTitle extends baseClass{
	
	@Test(priority=1)
	public void VerifyHolidayScheduleTitle()
	{
		
		logger.info("***** Starting TC_001_VerifyHolidayScheduleTitle *****");
		
		beCognizantpage bcp= new beCognizantpage(driver);
		
		holidayCalendarpage hcp= new holidayCalendarpage(driver);
		
		logger.debug("application logs started........");
		
		bcp.clickOnUserSymbol();
		logger.info("Clicked on User Symbol Button");
		
		String userName=bcp.captureUserName();
		System.out.println(userName);
		logger.info("Captured User Name");
		
		String userEmailid=bcp.captureUserEmailid();
		System.out.println(userEmailid);
		logger.info("Captured User Email Id");
		
		bcp.clickOnUserSymbolAgain();
		logger.info("Clicked on User Symbol Button Again");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", bcp.scrollTillHolidayCalendar());
			
		bcp.scrollTillHolidayCalendar();
		logger.info("Scrolled Till WebElement Holiday Calendar");
		
		bcp.clickOnHolidayCalendar();
		logger.info("Clicked On Holiday Calendar Element");
		
		String HolidayCalendarPageInfo=hcp.captureHolidayCalendarPageInfo();
		System.out.println(HolidayCalendarPageInfo);
		logger.info("Captured Holiday Calendar Page Information Displaying");
		
		//validate Holiday schedules text
		logger.info("Validating Holiday Schedules Title...");
		String ActualholidayscheduleTitle=hcp.validateholidayscheduleTitle();
		String ExpectedholidayscheduleTitle= p.getProperty("ExpHS_title");
		SoftAssert sa = new SoftAssert();
		if(ActualholidayscheduleTitle.equals(ExpectedholidayscheduleTitle)) {
			logger.info("Holiday Schedules Title verified...");
			sa.assertTrue(true);
		}
		else {
			logger.error("Invalid Title...");
			sa.fail();
		}
		logger.info("***** Ending TC_001_VerifyHolidayScheduleTitle *****");
		
	}

}
