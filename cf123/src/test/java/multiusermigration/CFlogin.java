package multiusermigration;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.loginpage;
import resources.baseclass;

public class CFlogin extends baseclass {
		// TODO Auto-generated method stub
		private static Logger log =LogManager.getLogger(baseclass.class.getName());	
	
	public CFlogin(WebDriver driver) {
			// TODO Auto-generated constructor stub	
	}


	@Test
	
		public void loginCF() throws IOException, InterruptedException
		{
		
		 		driver =initializeDriver();
		 		driver.get(prop.getProperty("URL"));

			//	create object to the invoke the methods
			loginpage lgn=new loginpage(driver);
			
			lgn.Enter_email().sendKeys("raja@cloudfuze.com");
			lgn.Enter_password().sendKeys("cloudfuze");
			lgn.Login_button().click();
			
		
			log.info("logged into account");
			
		}
	
	
		}
		
	


