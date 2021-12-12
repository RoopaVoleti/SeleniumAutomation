package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyProfilePage {
	WebDriver driver;

	public MyProfilePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
	}
	public void ValidateAddress() {
		//WebElement element=driver.findElement(By.name("address1"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String phone=js.executeScript("return document.getElementByName('phone').innerText()").toString();
		System.out.println(phone);
		//js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
}
