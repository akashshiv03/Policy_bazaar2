package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class flipkart {
  @Test
  public void flipkart2() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
  }
}
