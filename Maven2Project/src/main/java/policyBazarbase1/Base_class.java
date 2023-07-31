package policyBazarbase1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import policyBazaruitilityclase3.Utility;

public class Base_class
{
	protected WebDriver driver;
	public void lonchingthe_Browser() throws InterruptedException
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);
		Reporter.log("lounching the browser", true);
		driver.get("https://www.policybazaar.com/");
		Utility.wait(1000);
		driver.manage().window().maximize();
		
	}
	public void closethe_Browser() throws InterruptedException
	{
		driver.quit();
		Utility.wait(2000);
		
		
	}

}
