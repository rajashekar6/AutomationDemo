package multiusermigration;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageobject.multiuser;
import pageobject.muserMigration;
import resources.baseclass;

public class Multiusrmigration extends baseclass  {
		
	private static Logger log =LogManager.getLogger(baseclass.class.getName());	//logs
	static muserMigration m;
	
	@Test
	//(dataProvider="getdata")
	public  static void multiMigrate() throws IOException, InterruptedException
	{ 
		
		
		m= new muserMigration(driver);
	
		m.Migrate().click(); //migrate button click
		m.SourceCloud1().click(); //src cloud1 click
		m.DestnCloud2().click(); //dstn cloud2 click
		
		
		String Verifytext= prop.getProperty("SALLtext");
		Assert.assertEquals(Verifytext, "Select All");
		log.info("mapped users window logged");
		
		m.Mapselect1().click(); //selecting mapped user
		m.Mapselect2().click();
		m.Mapselect3().click();
		m.Mapselect4().click();
		
		//m.Mapremove5().click(); // remove cloud
		m.Unmapusersrc1().click();
		m.Unmapuserdstn1().click();
		log.info("one unmapped users clicked");
		m.MigrateButton().click();
	
	}
		
	@Test
	
	public static void reports()
	
	{
		//muserMigration m= new muserMigration(driver);
	
		m.MigrationReports().click();
		m.Refreshstatus().click();
		
		/*WebElement Verifytext= m.Status();
		Assert.assertEquals(Verifytext, "NOT_PROCESSED");*/
		
		
	}
	

	/*@AfterTest

	public void closebrowser()

	{
		
		driver.close();
	}*/


	}
	