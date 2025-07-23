package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class newprogram {

	WebDriver driver;
	  
	 //@BeforeClass defines this Test has to run before every @Test methods in the current class/program

	 @BeforeClass
	 public void openbrowser() { 
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	 }


	 //test	
	 @Test
	 public void VerifyTitle() {
		
	   String title = driver.getTitle();
	   System.out.print("Current page title is : "+title);
	Assert.assertEquals(title, "OrangeHRM - New Level of HR Management");
	 
	 }
	
	 //@AfterClass defines this Test has to run after every @Test methods in the current class/program
	 @AfterClass
	 public void closebrowser() {
	
	  driver.quit();
	 }
	
}


