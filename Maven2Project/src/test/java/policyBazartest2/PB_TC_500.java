package policyBazartest2;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.devtools.v112.profiler.model.Profile;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import policyBazarPOM4.Homepage;
import policyBazarPOM4.profilepage;
import policyBazarbase1.Base_class;
import policyBazaruitilityclase3.Utility;

public class PB_TC_500 extends Base_class
{
	Homepage home;
    profilepage prof;
	@BeforeClass
	public void openBrowser() throws InterruptedException //launching bowser
	{
		lonchingthe_Browser();
		home=new Homepage(driver);
		prof=new profilepage(driver);
		Utility.wait(1000);
	}
	@BeforeMethod
	public void logintopolicybazaar() throws InterruptedException//to get the data 
, EncryptedDocumentException, IOException
	{
		home.clickhomepagesigninbutton();
		Utility.wait(1000);
		home.sendmobilenofiled(Utility.readDataFromExcel(1, 0));
		Utility.wait(1000);
		home.clicksigninbutton();
		Utility.wait(1000);
		home.sendpasswordfield(Utility.readDataFromExcel(1, 1));
		Utility.wait(1000);
		home.clickpasswordsigninbutton();
		Utility.wait(1000);
		home.clickmyaccountbutton();
		Utility.wait(50);
		home.clickmyprofilebutton();
		Utility.wait(2000);
		
		//
		Set<String> allID = driver.getWindowHandles();
		List<String> al=new ArrayList<>(allID);
		String mainID = al.get(0);
		Utility.wait(2000);
	    String child = al.get(1);
	    Utility.wait(2000);
	    driver.switchTo().window(child);
	    Utility.wait(2000);	
	}
	@Test
	public void validateusername() throws EncryptedDocumentException, IOException
	{
		String expected = Utility.readDataFromExcel(1, 2);
		String actualun = prof.Actualusername(expected);
		//Assert.assertequals(actual,expected,"bothe are not maching test case fail");
		//Assert.assertEquals(actualun, expected, "Tc fail Actual and exp not matching");
		assertEquals(actualun, expected,"bothe are not maching test case fail");
		Utility.takescreenshot(driver);
		
	}
	@AfterMethod
	public void logoutfrompolicybazaar()
	{
		prof.clicklogoutbutton();
	}
	@AfterClass
	public void quiteBrowser() throws InterruptedException
	{
		closethe_Browser();
	}
	
	
 
}
