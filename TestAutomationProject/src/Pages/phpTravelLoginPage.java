package Pages;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class phpTravelLoginPage {
WebDriver driver;
public String Fpath ="/Users/roopavoleti/Desktop/Credentials.csv";   
String line;
	public phpTravelLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void safeJavaScriptClick(WebElement element) throws Exception {
		try {
			if (element.isEnabled() && element.isDisplayed()) {
				System.out.println("Clicking on element with using java script click");
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", element);
			} else {
				System.out.println("Unable to click on element");
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document "+ e.getStackTrace());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM "+ e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Unable to click on element "+ e.getStackTrace());
		}
	}
	@SuppressWarnings("resource")
	public void loginPHPTravel() throws Exception {
		File file = new File(Fpath);

	    BufferedReader bufRdr;
	    bufRdr = new BufferedReader(new FileReader(file));

	    line = bufRdr.readLine();
	        System.out.println(line);       
	        String[] cell= line.split(",");
	            String email=cell[0];
	            String password=cell[1];
	            driver.findElement(By.name("email")).sendKeys(email);
	            driver.findElement(By.name("password")).sendKeys(password);
	            WebElement LoginButton=driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg btn-block effect ladda-button waves-effect' and @type='submit']"));
	            safeJavaScriptClick(LoginButton);  
	            Thread.sleep(10000);
	           // Select dropDown=new Select(driver.findElement(By.id("")));
	}

}
