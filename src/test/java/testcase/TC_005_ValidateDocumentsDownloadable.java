package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.india_AmericaCalendarpage;

public class TC_005_ValidateDocumentsDownloadable extends TC_004_VerifyCountsSelected{

	
	@Test(priority = 5)
	public void ValidateDocumentsDownloadable()
	{
		logger.info("***** Starting TC_005_ValidateDocumentsDownloadable *****");
		
		india_AmericaCalendarpage IAC = new india_AmericaCalendarpage(driver);
	
//		WebElement ele= IAC.validateDownloadable();
//		SoftAssert sa = new SoftAssert();
		Assert.assertTrue(IAC.isClickable(IAC.Element_Download_Button, "Element is not clickable"));
		
		logger.info("***** Ending TC_005_ValidateDocumentsDownloadable *****");
	}
	
}
