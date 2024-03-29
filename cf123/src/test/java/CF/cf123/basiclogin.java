package CF.cf123;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basiclogin 
{
    public static void main( String[] args ) throws InterruptedException
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
					try {
						driver.manage().window().maximize();
        
						driver.navigate().to(prop.getProperty("URL"));	
     
        //login page 
		driver.findElement(By.xpath(prop.getProperty("Enter_email"))).sendKeys("raja@cloudfuze.com");
		driver.findElement(By.xpath(prop.getProperty("Enter_password"))).sendKeys("cloudfuze");
		driver.findElement(By.xpath(prop.getProperty("Login_button"))).click();
	
		
		Thread.sleep(4000);
 
		//Clouds page
		driver.findElement(By.xpath(prop.getProperty("Clouds"))).click();
		
		
		//1 Add Amazon cloud 
		
		driver.findElement(By.xpath(prop.getProperty("Amazon"))).click();
		Thread.sleep(2000);
		
		
		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;
		
	
			Set<String> handles = driver.getWindowHandles(); // get all window handles
			Iterator<String> iterator = handles.iterator();
			while (iterator.hasNext()){
			    subWindowHandler = iterator.next();
		}
		
		driver.switchTo().window(subWindowHandler); // switch to popup window

		// Now you are in the popup window, perform necessary actions here
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("A.Username"))).sendKeys("fff");
		driver.findElement(By.xpath(prop.getProperty("A.Password"))).sendKeys("fff");
		driver.findElement(By.xpath(prop.getProperty("A.Login"))).click();  //login amazon
		
		driver.close();
		driver.switchTo().window(parentWindowHandler);  // switch back to parent window
		
		
		
		
		
		//2 AmazonS3 popup
		driver.findElement(By.xpath(prop.getProperty("AmazonS3"))).click();
		Thread.sleep(3000);		
							
		driver.switchTo().window(driver.getWindowHandle());
		driver.findElement(By.xpath(prop.getProperty("s3.email"))).sendKeys("fff");
		driver.findElement(By.xpath(prop.getProperty("s3.key"))).sendKeys("fff");
		driver.findElement(By.xpath(prop.getProperty("s3.display"))).sendKeys("fff");
		driver.findElement(By.xpath(prop.getProperty("s3.refreshtoken"))).sendKeys("fff");
		driver.findElement(By.xpath(prop.getProperty("s3.add"))).sendKeys("fff");
				
		Thread.sleep(2000);
				
		driver.findElement(By.xpath(prop.getProperty("s3.cancel"))).click();
		Thread.sleep(2000);


		//3 Add Box
	/*	driver.findElement(By.xpath(prop.getProperty("Box"))).click();
		Thread.sleep(2000);		
		

		Set<String> handles1 = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator1 = handles1.iterator();
		while (iterator1.hasNext()){
		    subWindowHandler = iterator1.next();
		    }
		
		driver.switchTo().window(subWindowHandler);
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("B.Username"))).sendKeys("fff");
		driver.findElement(By.xpath(prop.getProperty("B.Password"))).sendKeys("fff");
		driver.findElement(By.xpath(prop.getProperty("B.Login"))).click();*/
				
		//driver.findElement(By.xpath(prop.getProperty("Grantaccess"))).click();		
				
		driver.close();
		driver.switchTo().window(parentWindowHandler);  // switch back to parent window
		
		/*		
		//4 Add Dropbox
		driver.findElement(By.xpath(prop.getProperty("Dropbox"))).click();
		Thread.sleep(5000);		
		
		Set<String> handles2= driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator2 = handles2.iterator();
		while (iterator2.hasNext()){
		    subWindowHandler = iterator2.next();
		    }

		driver.switchTo().window(subWindowHandler);
		Thread.sleep(3000);
		driver.findElement(By.className(prop.getProperty("D.Username"))).sendKeys("fff");
		driver.findElement(By.className(prop.getProperty("D.Password"))).sendKeys("fff");
		driver.findElement(By.xpath(prop.getProperty("D.Login"))).click();
		
		
		driver.findElement(By.xpath(prop.getProperty("D.Allow"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("D.Cancel"))).click();
		
		
		Thread.sleep(4000);
		driver.close();
		driver.switchTo().window(parentWindowHandler);  // switch back to parent window
		*/
		
		//5 FTP cloud
		
		driver.findElement(By.xpath(prop.getProperty("FTP"))).click();
		// FTP popup			
		driver.switchTo().window(driver.getWindowHandle());
		driver.findElement(By.xpath(prop.getProperty("F.DisplayName"))).sendKeys("fff");
		driver.findElement(By.xpath(prop.getProperty("F.UserName"))).sendKeys("fff");
		driver.findElement(By.xpath(prop.getProperty("F.Password"))).sendKeys("fff");
		driver.findElement(By.xpath(prop.getProperty("F.Server"))).sendKeys("fff");
		driver.findElement(By.xpath(prop.getProperty("F.PortNumber"))).sendKeys("fff");
		driver.findElement(By.xpath(prop.getProperty("F.Add"))).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath(prop.getProperty("F.cancel"))).click();
		Thread.sleep(2000);
		
		
		
		//6 Add GoogleDrive
	    driver.findElement(By.xpath(prop.getProperty("GoogleDrive"))).click();
		Thread.sleep(2000);		
		
		Set<String> handles3 = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator3 = handles3.iterator();
		while (iterator3.hasNext()){
		    subWindowHandler = iterator3.next();
		    }
		
		driver.switchTo().window(subWindowHandler);
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("G.Email"))).sendKeys("rajashekar.beeram");
		driver.findElement(By.xpath(prop.getProperty("G.Next"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("G.Password"))).sendKeys("rajashekar");
		driver.findElement(By.xpath(prop.getProperty("G.Next2"))).click();
		
		
		
		//driver.findElement(By.xpath(prop.getProperty("G.Allow"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("G.Cancel"))).click();
		
		driver.close();
		driver.switchTo().window(parentWindowHandler);  // switch back to parent window
		
		//7 Add Onedrive
		driver.findElement(By.xpath(prop.getProperty("Onedrive"))).click();
		Thread.sleep(2000);		
		
		
		Set<String> handles4 = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator4 = handles4.iterator();
		while (iterator4.hasNext()){
		    subWindowHandler = iterator4.next();
		    }
		
		driver.switchTo().window(subWindowHandler);
		
		driver.findElement(By.xpath(prop.getProperty("O.Username"))).sendKeys("fff");
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("O.Password"))).sendKeys("fff");
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("O.Signin"))).click();
		driver.findElement(By.xpath(prop.getProperty("O.Back"))).click();
		
		driver.close();
		driver.switchTo().window(parentWindowHandler);  // switch back to parent window
		
		//8 Adding ODFB
        driver.findElement(By.xpath(prop.getProperty("ODFB"))).click();
		Thread.sleep(2000);		
		
		Set<String> handles5 = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator5 = handles5.iterator();
		while (iterator5.hasNext()){
		    subWindowHandler = iterator5.next();
		    }
		
		driver.switchTo().window(subWindowHandler);
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("ODFB.Username"))).sendKeys("fff");
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("ODFB.Password"))).sendKeys("fff");
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("ODFB.Login"))).click();
		//driver.findElement(By.xpath(prop.getProperty("O.Back"))).click();
		
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parentWindowHandler);  // switch back to parent window
		Thread.sleep(2000);
		
	
    	//driver.close();
    
    }
   
   catch (UnhandledAlertException e) {
       System.err.println("Caught UnhandledAlertException: ");                 
   }
 }
}
 
    
    
    
