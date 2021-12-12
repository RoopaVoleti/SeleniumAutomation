package AutomationTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(AutomationTests.MyListeners.class)

public class TestListenersOnSelenimpracticeWebsite {
	public WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/roopavoleti/Downloads/ChromeDriverExecutable/chromedriver");  
		   driver=new ChromeDriver();
		   driver.get("http://www.seleniumframework.com/Practiceform/");
		  
	  }
	
  @Test
  public void f() {
	  
	  driver.findElement(By.linkText("CONTACT")).click();  
  }
  @Test
  public void failOnPurpose() {
	  driver.findElement(null);
  }
  @Test(dependsOnMethods="failOnPurpose")
  public void skiptest() {
	  System.out.println("method is supposed to be skipped");
  }
	  @AfterTest
	  public void terminateBrowser() {
		  driver.quit();
	  }
	  
  
  
}
