package magento.MoonAudio;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pagebject.landingpage;
import pagebject.loginpage;

import resources.baseclass;

public class homepage  extends baseclass{
	private static Logger log =LogManager.getLogger(baseclass.class.getName());	
	
@BeforeTest

public void initialize() throws IOException
{

	driver=initializeDriver();
	driver.navigate().to(prop.getProperty("url"));
	
}
	
	
	
@Test
//(dataProvider="getdata")

public void basepagehome() throws IOException, InterruptedException
{
	
	//	create object to the invoke the methods
	landingpage l=new landingpage(driver);
	l.getlogin().click();
	 
	loginpage lemail=new loginpage(driver);
	lemail.getemail().sendKeys("jo4hndoe@domain.com");
	log.info("email entered");
	lemail.getpassword().sendKeys("Padsdssword");
	lemail.getloginsbmt().click();
	
	log.info("clicked submit button");
	 

	if(driver.getPageSource().contains("Invalid login or password."))
	  {
	    log.info("test case passed");
	  }
	else
	  {
		log.info("test case failed");
	  }
	
	//Assert.assertEquals(ff, Invalid login or password.);
	
	
} 

/*
	@DataProvider
	public Object[][] getdata()
	{
		//row stands for how many different data type test should run
	Object[][] data = new Object[3][3];
	//0 th row same for all
	data[0][0]="johndddoe@domain.com";
	data[0][1]="23344"; 
	data[0][2]="restricted user";
	//1st row
	data[1][0]="johndfvdsgfoe@domain.com";
	data[1][1]="2334433";
	data[1][2]="non-restricted user";
			
	data[2][0]="joh4ndoe@domain.com.";
	data[2][1]="23344--";
	data[2][2]="restricted-- user";
	
	return data;
	
	}*/
	
@AfterTest

public void closebrowser()

{
	
	driver.close();
}


}
