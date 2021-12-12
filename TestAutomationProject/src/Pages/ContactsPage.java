package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactsPage {
	WebDriver driver ;
	public ContactsPage(WebDriver driver) {
		
		this.driver=driver; 
	}
	public void printListOfOptions() {
		List<WebElement> elements=driver.findElements(By.className("ct-text-block"));
		System.out.println("Number of elements:" +elements.size());
	}

}
