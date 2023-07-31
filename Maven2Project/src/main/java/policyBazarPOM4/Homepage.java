package policyBazarPOM4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Homepage
{
	//variable
	
	@FindBy(xpath="//a[@class='sign-in']")private WebElement homepagesigninbutton;
	@FindBy(xpath="(//input[@type='number'])[2]")private WebElement entermobileno;
	@FindBy(xpath="(//a[@id=\"central-loggin-with-pwd\"])[2]")private WebElement signinbutton;
	@FindBy(name="password")private WebElement enterpassword;
	@FindBy(id="login-in-with-password")private WebElement passwordsigninbutton ;
	@FindBy(xpath="//div[text()='My Account']")private WebElement myaccountbutton;
	@FindBy(xpath="//span[text()=' My profile ']")private WebElement myprofilebutton;
	
	//constructor
	public Homepage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Methods
	
	public void clickhomepagesigninbutton()
	{
		homepagesigninbutton.click();
		Reporter.log("clickonhome signinbutton", true);
	}
	public void sendmobilenofiled(String mno)
	{
		entermobileno.sendKeys(mno);
		Reporter.log("entermobile number", true);

	}
	public void clicksigninbutton()
	{
		signinbutton.click();
		Reporter.log("clicksigninbutton", true);

	}
	public void sendpasswordfield(String pass)
	{
		enterpassword.sendKeys(pass);
		Reporter.log("enterpassword", true);

	}
	public void clickpasswordsigninbutton()
	{
		passwordsigninbutton.click();
		Reporter.log("clickonpassword", true);

	}
	public void clickmyaccountbutton()
	{
		myaccountbutton.click();
		Reporter.log("clickon myaccountbutton", true);

	}
	public void clickmyprofilebutton()
	{
		myprofilebutton.click();
		Reporter.log("clickonmyprofilebutton", true);

	}

}
