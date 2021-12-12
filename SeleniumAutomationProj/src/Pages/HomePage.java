package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	//System.setProperty("webdriver.chrome.driver", "/Users/roopavoleti/Downloads/selenium-java-4/selenium-chrome-driver-4.0.0.jar");
	  WebDriver driver = new ChromeDriver();
	public void navigateToHamburgerMenu(){
		driver.findElement(By.className("hamburger-box")).click();
		
		}
	public void clickOnContacts() {
		driver.findElement(By.xpath("//a[@href='https://yourautomatedpractice.com/contact/']")).click();
	}
	
}
