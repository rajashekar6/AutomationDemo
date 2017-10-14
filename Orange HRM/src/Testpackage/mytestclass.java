package Testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mytestclass {

	
	public static void main(String[] args) throws InterruptedException {

	// open the firefoxbrowser
		WebDriver driver=new FirefoxDriver();
	//maximize the browser
		driver.manage().window().maximize();
	
		driver.navigate().to("http://127.0.0.1/orangehrm-2.5.0.2/login.php");	

		driver.findElement(By.name("txtUserName")).sendKeys("selenium");

		driver.findElement(By.name("txtPassword")).sendKeys("selenium123");
		
		driver.findElement(By.name("Submit")).click();
	
		
	
	}
}