package AutomationTests;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitsTest {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "/Users/roopavoleti/Downloads/ChromeDriverExecutable/chromedriver");
	  driver= new ChromeDriver();
	  driver.navigate().to("https://yourautomatedpractice.com");
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.manage().window().maximize();
	  driver.findElement(By.id("svg-fancy_icon-38-878")).click();
	  //Explicit Wait
	  
	 // WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	  //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
	  
	  //Fluent Wait
	 // WebElement element=driver.findElement(By.id("svg-fancy_icon-38-878"));
	 
	FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
			  .withTimeout(Duration.ofSeconds(30))
			  .pollingEvery(Duration.ofSeconds(5))
			  .ignoring(Exception.class);
	  
	  fwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("svg-fancy_icon-38-878")));
	  //element.click();
  }
}
