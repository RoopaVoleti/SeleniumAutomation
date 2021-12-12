package AutomationTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ExecuteFromMiddle {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","/Users/roopavoleti/Downloads/ChromeDriverExecutable/chromedriver");
	  
	
	ChromeOptions opt=new ChromeOptions();
	opt.setExperimentalOption("debuggerAddress","localhost:9222");
	 WebDriver driver=new ChromeDriver(opt);
	 
	
	//driver.get("http://facebook.com");
	driver.get("https://test.salesforce.com/");
	//Actions action =new Actions(driver);
WebElement logo=driver.findElement(By.xpath("//img[@id='logo']"));
//	action.moveToElement(logo, 0, 0).clickAndHold().moveToElement(logo, 
//		    logo.getSize().getWidth(), logo.getSize().getHeight()).release();
//	action.build().perform();

JavascriptExecutor js= (JavascriptExecutor)driver;
js.executeScript("arguments[0].setAttribute('style','background: yellow');", logo);
	Thread.sleep(5000);
  }
}
