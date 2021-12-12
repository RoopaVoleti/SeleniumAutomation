package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	//System.setProperty("webdriver.chrome.driver", "/Users/roopavoleti/Downloads/selenium-java-4/selenium-chrome-driver-4.0.0.jar");
	
	WebDriver driver ;
	public HomePage(WebDriver driver) {
		this.driver=driver; 
	}
	public void navigateToHamburgerMenu(){
		 driver.findElement(By.className("hamburger-box")).click();
		
		}
	public  void clickOnContacts() {
		driver.findElement(By.id("menu-item-876")).click();
	}
	
}
    