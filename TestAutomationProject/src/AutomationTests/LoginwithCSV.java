package AutomationTests;

import org.testng.annotations.Test;

import Pages.MyProfilePage;
import Pages.phpTravelLoginPage;

import org.testng.annotations.BeforeTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

@SuppressWarnings("unused")
public class LoginwithCSV {
	public WebDriver driver;
	
    /* @SuppressWarnings("resource")
   @Test
  public void LoginTestwithCSVCredentials() throws IOException {
	  
	 File file = new File(Fpath);

	    BufferedReader bufRdr;
	    bufRdr = new BufferedReader(new FileReader(file));

	    while((line = bufRdr.readLine()) != null){
	        System.out.println(line);       
	        String[] cell= line.split(",");
	            String email=cell[0];
	            String password=cell[1];
	            driver.findElement(By.name("email")).sendKeys(email);
	            driver.findElement(By.name("password")).sendKeys(password);
	            driver.findElement(By.linkText("Login")).click();
	            String title=driver.getTitle();
	            //String verifyAssertNull=null;
	            boolean verifyTitle=driver.getTitle().equalsIgnoreCase("PHPTRAVELS");
	            System.out.println(title+" Login Successful");
	            //Assert.assertEquals(title,"PHPTRAVEL");
	            //assertNull(verifyAssertNull);
	            Assert.assertTrue(verifyTitle);
	            }  
	  
	  
  }*/
  @Test(priority=1,groups= {"smoke"})
  public void TestProfilePage() throws Exception {
	  phpTravelLoginPage loginPage=new phpTravelLoginPage(driver);
	  loginPage.loginPHPTravel();
	           //driver.findElement(By.partialLinkText("Profile")).click();
	           // MyProfilePage myProfilePage=new MyProfilePage(driver);
	      	 // myProfilePage.ValidateAddress();
	  
  }
 /* @Test(priority=2,groups= {"smoke"})
  public void testJSEandWaits() {
	  MyProfilePage myProfilePage=new MyProfilePage(driver);
	  myProfilePage.ValidateAddress();
	  
  }*/
@BeforeTest
  public void beforeTest() throws IOException {
	  System.setProperty("webdriver.chrome.driver", "/Users/roopavoleti/Downloads/ChromeDriverExecutable/chromedriver");
	  driver= new ChromeDriver();
	  driver.get("https://www.phptravels.net/login");
	  driver.manage().window().maximize();
	  
	  
  }
  

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
