package magento.MoonAudio;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagebject.categoriesgo;
import resources.baseclass;

public class categorieslink  extends baseclass{
	private static Logger log =LogManager.getLogger(baseclass.class.getName());		
					
@BeforeTest	
public void initialize() throws IOException
	{

		driver=initializeDriver();
		driver.navigate().to(prop.getProperty("url"));
		
	}	
	
	
@Test

public void homecat() throws IOException, InterruptedException
{
	//	create object to the invoke the methods
	categoriesgo headphonecat= new categoriesgo(driver);
	headphonecat.catheadphones().click();
	
	headphonecat.addproduct().click();
	log.info("product was clicked");
	
	if(driver.getPageSource().contains("Sub88total"))
	  {
	    log.info("test case passed");
	  }
	else
	  {
		log.info("test case failed");
	  }
	driver.manage().window().fullscreen();
	driver.manage().window().wait();
	WebElement s= driver.findElement(By.xpath(""));

 Select ss= new Select(s);
 
 ss.selectByIndex(0);
}
@AfterTest

public void closebrowser()

{
	
	driver.close();
}
}
