package CF.cf123;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class migration {

	public static void main(String[] args) throws InterruptedException
	{
		

	  	File file = new File("src/test/java/cloud/properties/xpaths.properties");
		  
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		
		//load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		WebDriver driver = new FirefoxDriver();		
		try{
		
		driver.manage().window().maximize();	
		Thread.sleep(3000);
		driver.navigate().to(prop.getProperty("URL"));
		//login page Box
		driver.findElement(By.xpath(prop.getProperty("Enter_email"))).sendKeys("raja@cloudfuze.com");
		driver.findElement(By.xpath(prop.getProperty("Enter_password"))).sendKeys("cloudfuze");
		driver.findElement(By.xpath(prop.getProperty("Login_button"))).click();
		Thread.sleep(2000);			
		
		//Clouds page
		
		driver.findElement(By.xpath(prop.getProperty("Clouds"))).click();
		
		//Box	driver.findElement(By.xpath(prop.getProperty("Box"))).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath(prop.getProperty("Box"))).click();
		Thread.sleep(2000);	
		
		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;
		
		

		Set<String> handles1 = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator1 = handles1.iterator();
		while (iterator1.hasNext()){
		    subWindowHandler = iterator1.next();
		    }
		
		driver.switchTo().window(subWindowHandler);
		Thread.sleep(2000);	
		driver.findElement(By.xpath(prop.getProperty("B.Username"))).sendKeys("dineshmahesh501@gmail.com");
		driver.findElement(By.xpath(prop.getProperty("B.Password"))).sendKeys("accountpassword");
		driver.findElement(By.xpath(prop.getProperty("B.Login"))).click();
		Thread.sleep(2000);		
		driver.findElement(By.xpath(prop.getProperty("Grantaccess"))).click();		
				
		
		driver.switchTo().window(parentWindowHandler);  // switch back to parent window	driver.close();
		Thread.sleep(2000);		
	
		driver.findElement(By.xpath(prop.getProperty("Clouds"))).click();
		
		// Gdrive
		driver.findElement(By.xpath(prop.getProperty("GDrive"))).click();
		Thread.sleep(2000);		
		
		Set<String> handles3 = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator3 = handles3.iterator();
		while (iterator3.hasNext()){
		    subWindowHandler = iterator3.next();
		    }
		
		driver.switchTo().window(subWindowHandler);
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("G.Email"))).sendKeys("dineshmahesh501@gmail.com");
		driver.findElement(By.xpath(prop.getProperty("G.Email"))).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(prop.getProperty("G.Password"))).sendKeys("accountpassword");
		driver.findElement(By.cssSelector(prop.getProperty("G.Password"))).sendKeys(Keys.ENTER);
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("G.Allow"))).click();
		
		driver.switchTo().window(parentWindowHandler);
		Thread.sleep(25000);
		
		driver.findElement(By.xpath(prop.getProperty("Clouds"))).click();
		driver.findElement(By.xpath(prop.getProperty("Manageclouds"))).click();
		// Verify Email
		Thread.sleep(2000);
		if(driver.getPageSource().contains("dineshmahesh501@gmail.com"))
		  {
		    System.out.println("1 Box Cloud is added successfully");
		  }
		else
		  {
		    System.out.println("Box cloud adding is Failed");
		  }
			
			
		
		
		Thread.sleep(40000);
		//Migrate
		driver.findElement(By.xpath(prop.getProperty("Migrate"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("SourceCloud2"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("SourceCheckall"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("DestnCloud1"))).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("MigrateButton"))).click();
		Thread.sleep(5000);
		
		
		
		driver.switchTo().window(driver.getWindowHandle());
		driver.findElement(By.xpath(prop.getProperty("ConfirmMigration"))).click();
		
		Thread.sleep(42000);
		//driver.findElement(By.xpath(prop.getProperty("MigrationReports"))).click();

		driver.findElement(By.xpath(prop.getProperty("Refreshstatus"))).click();
		
		Thread.sleep(5000);	
		driver.findElement(By.xpath(prop.getProperty("InitateMove"))).click();
		
		
		Thread.sleep(5000);	
		driver.findElement(By.xpath(prop.getProperty("Logout_link"))).click();
		
		driver.close();
		
		}catch (UnhandledAlertException e){
			System.err.println("Caught UnhandledAlertException: ");
		
		}
		
	}
}

