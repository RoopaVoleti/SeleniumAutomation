package TestSuits;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {
  @Test
  public void FirstTest() {
	  System.setProperty("webdriver.chrome.driver", "/Users/roopavoleti/Downloads/selenium-java-4/selenium-chrome-driver-4.0.0.jar");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://yourautomatedpractice.com");
	  driver.manage().window().maximize();
	 driver.findElement(By.xpath(""));
  }
}
