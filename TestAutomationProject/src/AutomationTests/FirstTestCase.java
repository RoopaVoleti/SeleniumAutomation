package AutomationTests;

import org.testng.annotations.Test;

import Pages.ContactsPage;
import Pages.HomePage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

@SuppressWarnings("unused")
public class FirstTestCase {

	public WebDriver driver;

	@Test(priority=1,groups= {"smoke"})
  public void test1() {
	  //driver.findElement(By.id("menu-item-876")).click();
	  HomePage homePage = new HomePage(driver);
	homePage.clickOnContacts();
	}
	 @Test(priority=2)
	 public void test2() {
		 ContactsPage contactsPage= new ContactsPage(driver);
		 contactsPage.printListOfOptions();
		 
 }
	 
	 
  

	@BeforeTest(groups= {"smoke"})

	public void launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/roopavoleti/Downloads/ChromeDriverExecutable/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://yourautomatedpractice.com");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.id("svg-fancy_icon-38-878")).click();
		System.out.println("alert dismissed");

	}

	@AfterTest(groups= {"smoke"})
	public void terminateBrowser() {
		driver.quit();
	}

}
