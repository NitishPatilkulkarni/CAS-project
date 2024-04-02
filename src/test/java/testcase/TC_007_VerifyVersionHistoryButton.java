package testcase;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.indiaCalendar2024page;
import utilities.TakeScreenshot;

public class TC_007_VerifyVersionHistoryButton extends TC_006_VerifyIndiaHolidayCalendarsDocTitle{

	
	@Test(priority = 7)
	public void VerifyVersionHistoryButton() throws IOException, InterruptedException
	{
		logger.info("***** Starting TC_007_VerifyVersionHistoryButton *****");
		
		indiaCalendar2024page ICP = new indiaCalendar2024page(driver);
		
		ICP.Button_Download.click();
		logger.info("Clicked on Download Button");
		
		Thread.sleep(4000);
		TakeScreenshot ts = new TakeScreenshot(driver);
		
		ts.takeScreenshot(driver, "Firstscreenshot.png");
		
		ICP.clickOnOptions();
		logger.info("Clicked on Options ... Button");
		
		logger.info("Verfying Display of Option Version History...");
		String actualOption=ICP.captureVersionHistoryText();
		String ExpectedOptions=p.getProperty("ExpOption");
		SoftAssert sa = new SoftAssert();
		if(actualOption.equals(ExpectedOptions)) {
			logger.info("Option Verified...");
			sa.assertTrue(true);
		}
		else {
			logger.error("Invalid Option...");
			sa.fail();
		}
		
		
		ICP.clickOnVersionHistory();
		logger.info("Clicked on Version History Button");
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		String capture = ICP.captureVersionHisDetails();
		System.out.println(capture);
		logger.info("Version History Details printed in Console");
		
		logger.debug("application logs end........");
		logger.info("***** Ending TC_007_VerifyVersionHistoryButton *****");
	}
}
