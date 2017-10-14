package multiusermigration;

import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageobject.multiuser;
import resources.baseclass;

public class Multicloudadding extends baseclass  {
	
	private static Logger log =LogManager.getLogger(baseclass.class.getName());	//logs
    
	/*
	@BeforeSuite 
    public void home() throws IOException, InterruptedException
    {
    	CFlogin c = new CFlogin(driver);
		c.loginCF()
    }*/
	
	// BFBA adding
	@Test  
	public void bfbaadd() throws IOException, InterruptedException   // BFBA cloud 
	{
		multiuser m = new multiuser(driver);
		m.BFBA().click();
		
		String winHandleBefore = driver.getWindowHandle();
		windowhandle();
		m.BFBAEmail().sendKeys("melvin@joukuu.net");
		m.BFBAPwd().sendKeys("CloudFuze2017");
		m.BFBAAuth().click();
		m.BFBAGrant().click();
		
		driver.switchTo().window(winHandleBefore);
		log.info("BFBA added");
	}
	
	//GSUITE adding
	@Test  
	public void Gsuiteadd() throws IOException, InterruptedException   // BFBA cloud 
	{
		multiuser m = new multiuser(driver);
		m.GSUITE().click();
		
		String winHandleBefore = driver.getWindowHandle();
		driver.switchTo().window(driver.getWindowHandle());
		
		m.GSUITEGrntAD().click();
		windowhandle();
		m.GSUITEEmail().sendKeys("Melvin@jookuu.com");
		m.GSUITNext1().click();
		m.GSUITEpwd().sendKeys("CloudFuze2017");
		m.GSUITNext2().click();
		m.GSUITAllow().click();
		
		driver.switchTo().window(winHandleBefore);
		log.info("Gsuite added");
	}
	
	@AfterSuite 
	public void deletecookies()
	{
		deleteAllCookiesExample();
		log.info("cookies got deleted");
	}

	}