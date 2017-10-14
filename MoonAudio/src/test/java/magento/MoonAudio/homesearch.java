package magento.MoonAudio;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pagebject.landingpage;
import resources.baseclass;

public class homesearch  extends baseclass{
	
	private static Logger log =LogManager.getLogger(baseclass.class.getName());	

@BeforeTest	 
public void initialize() throws IOException
	{

		driver=initializeDriver();
		log.info("driver is initialized");
		
		driver.navigate().to(prop.getProperty("url"));
		log.info("webesite launched");
	}
			
	
	
@Test

public void homepagesearch() throws IOException, InterruptedException
{
	
	
	//	create object to the invoke the methods
	landingpage searchbar= new landingpage(driver);
	searchbar.getsearch().sendKeys("sennheiser");
	log.info("searchbar entered some text");
	
	searchbar.getsearchclick().click();
	log.info("clicked search bar");
	

}
@AfterTest

public void closebrowser()

{
	
	driver.close();
}
}
