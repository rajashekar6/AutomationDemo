package CF.cf123;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import multiusermigration.CFlogin;
import pageobject.boxadds;
import resources.baseclass;

public class boxopernts extends baseclass{

	// TODO Auto-generated method stub
			private static Logger log =LogManager.getLogger(baseclass.class.getName());	
		
		public boxopernts(WebDriver driver) {
				// TODO Auto-generated constructor stub	
		}
		public static boxadds b; 

		
		@Test
		
		public static void boxadd() throws IOException, InterruptedException
		{
			CFlogin c = new CFlogin(driver);
			c.loginCF();
			
		b = new boxadds(driver);
		/*b.Clouds().click();
		b.Box().click();
		String winHandleBefore = driver.getWindowHandle();
		windowhandle();
		b.BUsername().sendKeys("dineshmahesh501@gmail.com");
		b.BPassword().sendKeys("accountpassword");
		b.BLogin().click();
		b.Grantaccess().click();
		
		driver.switchTo().window(winHandleBefore);
		log.info("Box is  added")*/;
		
		b.All_files().click();
		log.info("allfiles clicked");
		
		//b.Allfiles().click();
		//b.Cloud1().click();
		Thread.sleep(6000);
		b.boxname().click();
		log.info("box cloud dinesh p clicked");
		//String dinesh = new String(b.boxname().getAttribute("value"));
		/*
		if(dinesh=="dinesh p")
		{*/
		//Find the element of upload button and send the path
		Thread.sleep(4000);
		b.Upload().click();
		b.Upload().click();
		
		log.info("upload bututton clicked");
		Thread.sleep(4000);
		
		b.Uploadpopup().click();
		log.info("upload popup clicked");
		
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("C:\\Users\\Exinent\\Desktop\\auttoit\\Script.exe");
		Thread.sleep(5000);
		
		log.info("file uploaded");
		
	//	}
		}
		
	
	
}
