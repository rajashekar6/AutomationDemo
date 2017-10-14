package CF.cf123;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class cloudadd {

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
		driver.navigate().to(prop.getProperty("URL"));
		//login page 
		driver.findElement(By.xpath(prop.getProperty("Enter_email"))).sendKeys("raja@cloudfuze.com");
		driver.findElement(By.xpath(prop.getProperty("Enter_password"))).sendKeys("cloudfuze");
		driver.findElement(By.xpath(prop.getProperty("Login_button"))).click();
		Thread.sleep(2000);			
		
		//Clouds page
	
		
		driver.findElement(By.xpath(prop.getProperty("Clouds"))).click();
		driver.findElement(By.xpath(prop.getProperty("FTP"))).click();
		// FTP popup			
		driver.switchTo().window(driver.getWindowHandle());
		driver.findElement(By.xpath(prop.getProperty("F.DisplayName"))).sendKeys("FTP");
		driver.findElement(By.xpath(prop.getProperty("F.UserName"))).sendKeys("ftpdeamon");
		driver.findElement(By.xpath(prop.getProperty("F.Password"))).sendKeys("mmhpsrJZWscAZN6y");
		driver.findElement(By.xpath(prop.getProperty("F.Server"))).sendKeys("65.60.27.99");
		//driver.findElement(By.xpath(prop.getProperty("F.PortNumber"))).sendKeys("21");
		driver.findElement(By.xpath(prop.getProperty("F.Add"))).click();
		Thread.sleep(4000);
		
		
		//Manageclouds
		
		driver.findElement(By.xpath(prop.getProperty("Manageclouds"))).click();
		// Verify Email
		Thread.sleep(2000);
		if(driver.getPageSource().contains("ftpdeamon"))
		  {
		    System.out.println("1FTP Cloud is added successfully");
		  }
		else
		  {
		    System.out.println("FTP cloud adding is Failed");
		  }
			Thread.sleep(3000);
			
		//All files
			driver.findElement(By.xpath(prop.getProperty("All_files"))).click();
			driver.findElement(By.xpath(prop.getProperty("Allfiles"))).click();
		
			Thread.sleep(120000);
			
			driver.findElement(By.xpath(prop.getProperty("All_files"))).click();
			
			//Basic operations
			
			//Search
			
			driver.findElement(By.xpath(prop.getProperty("Search"))).sendKeys("Yahoo_Screen");
			driver.findElement(By.xpath(prop.getProperty("Search"))).sendKeys(Keys.ENTER);
			Thread.sleep(15000);
			/*//Preview
			driver.findElement(By.cssSelector(prop.getProperty("SelectFIle"))).click();
			driver.findElement(By.xpath(prop.getProperty("Preview"))).click();
			Thread.sleep(4000);
			driver.switchTo().window(driver.getWindowHandle());
		
			driver.findElement(By.cssSelector(prop.getProperty("PreviewClosed"))).click();
			
			
			//download
			
			//Downloadpopup
			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("browser.download.folderList", 2);
			profile.setPreference("browser.download.dir", "C:\\Users\\Exinent\\Downloads");
			profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "Yahoo_Screen");
			profile.setPreference("pdfjs.disabled", true);  // disable the built-in PDF viewer

			driver.findElement(By.cssSelector(prop.getProperty("SelectFIle"))).click();
			driver.findElement(By.xpath(prop.getProperty("Download"))).click();
			Thread.sleep(3000);
			
			Rename
			driver.findElement(By.cssSelector(prop.getProperty("SelectFIle"))).click();
			driver.findElement(By.xpath(prop.getProperty("Rename"))).click();
			driver.findElement(By.cssSelector(prop.getProperty("RenameEditfield"))).sendKeys("Vine1");
			driver.findElement(By.xpath(prop.getProperty("RenameOk"))).click();
			*/
			//Foldecreated
			driver.findElement(By.xpath(prop.getProperty("CreateFolder"))).click();
			driver.findElement(By.xpath(prop.getProperty("FolderNameField"))).sendKeys("testdelete");
			driver.findElement(By.xpath(prop.getProperty("FolderOk"))).sendKeys("Vine1");
			Thread.sleep(2000); 
			if(driver.getPageSource().contains("testdelete"))
			  {
			    System.out.println("2Folder created successfully");
			  }
			else
			  {
			    System.out.println("Folder creation is Failed");
			  }
			//Upload
			driver.findElement(By.xpath(prop.getProperty("Upload"))).click();
			driver.switchTo().window(driver.getWindowHandle());
			
	
			driver.close();
		
				
			}catch (UnhandledAlertException e){
				System.err.println("Caught UnhandledAlertException: ");
			}
	}


}



