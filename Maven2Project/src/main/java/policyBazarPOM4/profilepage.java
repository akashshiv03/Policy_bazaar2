package policyBazarPOM4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class profilepage
{
	@FindBy(xpath="//div[@class='textCapitalize sc-ckVGcZ kWpXlQ']")private WebElement username;
	@FindBy(className="h_l")private WebElement logoutbutton;

	public profilepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public String Actualusername(String un)
	{
		Reporter.log("logoutbutton", true);
		String actual = username.getText();
		return actual;

	}
					
	
	public void clicklogoutbutton()
	{
		logoutbutton.click();
		Reporter.log("logoutbutton", true);
	}
}
