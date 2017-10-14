package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.baseclass;


public class muserMigration extends baseclass  {

		public WebDriver driver;
		
		By Migrate 	    = By.xpath(prop.getProperty("Migrate"));   //migrate  button
 		By SourceCloud1 = By.xpath(prop.getProperty("SourceCloud1"));  //source cloud1
		By DestnCloud2  = By.xpath(prop.getProperty("DestnCloud2")); // destination cloud1
		
		//mapped users
		By MapSelectAll = By.xpath(prop.getProperty("MapSelectAll"));
		By Mapselect1 	= By.xpath(prop.getProperty("Mapselect1"));
		By Mapselect2 	= By.xpath(prop.getProperty("Mapselect2"));
		By Mapselect3 	= By.xpath(prop.getProperty("Mapselect3"));
		By Mapselect4 	= By.xpath(prop.getProperty("Mapselect4"));
		
		// ....select according to requrirment
		//cancel  as many as Repeat this steps
		By Mapcancel 	= By.xpath(prop.getProperty("Mapcancel")); 
		
		//Unmapped
		By Unmapusersrc1     = By.xpath(prop.getProperty("Unmapusersrc1"));
		By Unmapusersrc2     = By.xpath(prop.getProperty("Unmapusersrc2"));
		By Unmapuserdstn1    = By.xpath(prop.getProperty("Unmapuserdstn1"));
		By Unmapuserdstn2    = By.xpath(prop.getProperty("Unmapuserdstn2"));
		
		//migrate
		By MigrateButton     = By.xpath(prop.getProperty("MigrateButton"));
		By MigrationReports  = By.xpath(prop.getProperty("MigrateButton"));
		By Refreshstatus 	 = By.xpath(prop.getProperty("MigrateButton"));
		
		
		//Remove clouds by abslt xpaths
		By Mapremove2 	= By.xpath(prop.getProperty("Mapremove2"));
		By Mapremove3 	= By.xpath(prop.getProperty("Mapremove3"));
		By Mapremove4 	= By.xpath(prop.getProperty("Mapremove4"));
		By Mapremove5 	= By.xpath(prop.getProperty("Mapremove5"));
		By Mapremove6 	= By.xpath(prop.getProperty("Mapremove6"));
		
		
		By Status 		= By.cssSelector(prop.getProperty("Status"));
				
		public muserMigration(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
		}
		
		
		//source and destination
		public  WebElement Migrate(){
			return driver.findElement(Migrate);
			}
		
		public  WebElement SourceCloud1(){
			return driver.findElement(SourceCloud1);
			}

		public  WebElement DestnCloud2(){
			return driver.findElement(DestnCloud2);
			}
		

	
		
		
		//mapped users
		public  WebElement MapSelectAll(){
			return driver.findElement(MapSelectAll);
			}
		
		public  WebElement Mapselect1(){
			return driver.findElement(Mapselect1);
			}
		
		public  WebElement Mapselect2(){
			return driver.findElement(Mapselect2);
			}
		public  WebElement Mapselect3(){
			return driver.findElement(Mapselect3);
			}
		public  WebElement Mapselect4(){
			return driver.findElement(Mapselect4);
			}
		
		public  WebElement Mapcancel(){
			return driver.findElement(Mapcancel);
			}
		

		
		//Unmapped users
		public  WebElement Unmapusersrc1(){
			return driver.findElement(Unmapusersrc1);
			}
	
		public  WebElement Unmapusersrc2(){
			return driver.findElement(Unmapusersrc2);
			}
		public  WebElement Unmapuserdstn1(){
			return driver.findElement(Unmapusersrc1);
			}
		public  WebElement Unmapuserdstn2(){
			return driver.findElement(Unmapuserdstn2);
			}

		//Migrate & Reports status

		
		public  WebElement MigrateButton(){
			return driver.findElement(MigrateButton);
			}
		
		public  WebElement MigrationReports(){
			return driver.findElement(MigrateButton);
			}
		
		public  WebElement Refreshstatus(){
			return driver.findElement(MigrateButton);
			}
		
		
		public  WebElement Status(){
			return driver.findElement(Status);
			}
		
		
		// For remove mapped users
		public  WebElement Mapremove2(){
			return driver.findElement(Mapremove2);
			}
		
		public  WebElement Mapremove3(){
			return driver.findElement(Mapremove3);
			}
		
		public  WebElement Mapremove4(){
			return driver.findElement(Mapremove4);
			}
		
		public  WebElement Mapremove5(){
			return driver.findElement(Mapremove5);
			}
		
		public  WebElement Mapremove6(){
			return driver.findElement(Mapremove6);
			}
		
	
		
	}


	

	
	
		
