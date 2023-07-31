package policyBazaruitilityclase3;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility
{
	public static void takescreenshot(WebDriver driver) throws IOException
	  {
		  Reporter.log("Taking Screenshot", true);
		  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//String ran = RandomString.make(4);
			File Dest=new File("C:\\seleniumjar\\Screenshot\\screenshot\\1.png");
			FileHandler.copy(src, Dest);
		  Reporter.log("taken Screenshot and saved at location--> "+Dest,true);
	  }
	  public static void scroolIntoView(WebElement element, WebDriver driver)
	  {
		  Reporter.log("Scroll Into View" ,true);
		  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);  
	  }
	  public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException
	  {
		File myfile = new File("C:\\seleniumjar\\policybazar.xlsx");
		String value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
		Reporter.log("Reading data from excel from rownum"+row+"cellnum "+cell);
		return value;	  
	  }
	  public static void wait(int waitTimesec) throws InterruptedException
	  {
		  Thread.sleep(waitTimesec);
		  Reporter.log("Waiting for"+ waitTimesec+ "+ millisecond ", true);
	  }
	 
	 

}
