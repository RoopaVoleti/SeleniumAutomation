package TestSuits;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest1 {
	
	
  @Test
  public void testCaseOne() {
	  System.setProperty("webdriver.chrome.driver", "/Users/roopavoleti/Documents/AutomationTestingSetup/ChromeDriverExecutable/chromedriver");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://yourautomatedpractice.com");
	  driver.manage().window().maximize();
	 driver.findElement(By.xpath(""));
	 
  }
 
 


 

}
