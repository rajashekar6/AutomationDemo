package multiusermigration;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.multiuser;
import resources.baseclass;

public class testmultiuser extends baseclass {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		
	
			
			CFlogin c= new CFlogin(driver);
			c.loginCF();
			
			// TODO Auto-generated method stub
			multiuser b= new multiuser(driver);
			//	create object to the invoke the method
			b.GSUITE().click();
			driver.switchTo().window(driver.getWindowHandle());
			b.GSUITEGrntAD().click();
			
			windowhandle();
			b.GSUITEEmail().sendKeys("melvin@joukuu.us");
			b.GSUITNext1().click();
			
			b.GSUITEpwd().sendKeys("CloudFuze2017");
			b.GSUITNext2().click();
			
			b.GSUITAllow().click();
			
			
			Thread.sleep(5000);
			b.Cloud().click();
			
			//	create object to the invoke the methods
			b.Cloud().click();
			
		//multiuser b= new multiuser(driver);
			b.BFBA().click();
		
		windowhandle();

			b.BFBAEmail().sendKeys("melvin@mahabot.com");
			b.BFBAPwd().sendKeys("CloudFuze2017");
			b.BFBAAuth().click();
			b.BFBAGrant().click();
			
		
			
			b.DBFBA().click();
			
			windowhandle();
			
			b.DBFBAEmail().sendKeys("Melvin@jookuu.com");
			b.DBFBAPwd().sendKeys("CloudFuze2017");
			b.DBFBLogin().click();
			
			
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

