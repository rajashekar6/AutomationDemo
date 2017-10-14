package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.baseclass;


public class multiuser extends baseclass  {

		public WebDriver driver;
		
		
		//BFBA	
		By BFBA 	 = By.id(prop.getProperty("BFBA"));
		By BFBAEmail = By.xpath(prop.getProperty("BFBAEmail"));
		By BFBAPwd 	 = By.xpath(prop.getProperty("BFBAPwd"));
		By BFBAAuth  = By.xpath(prop.getProperty("BFBAAuth"));
		By BFBAGrant = By.xpath(prop.getProperty("BFBAGrant"));
		By Cloudss   = By.xpath(prop.getProperty("Clouds"));
		
        //DBFBA
		By DBFBA = By.id(prop.getProperty("DBFBA"));
		By DBFBAEmail = By.name(prop.getProperty("DBFBAEmail"));
		By DBFBAPwd = By.name(prop.getProperty("DBFBAPwd"));
		By DBFBLogin = By.cssSelector(prop.getProperty("DBFBLogin"));
		
		//GSUITE
		By GSUITE = By.id(prop.getProperty("GSUITE"));
		By GSUITEGrntAD = By.xpath(prop.getProperty("GSUITEGrntAD"));
		By GSUITEEmail = By.xpath(prop.getProperty("GSUITEEmail"));
		By GSUITNext1 = By.xpath(prop.getProperty("GSUITNext1"));
		
		
		By GSUITEpwd = By.xpath(prop.getProperty("GSUITEpwd"));
		By GSUITNext2 = By.xpath(prop.getProperty("GSUITNext2"));
		By GSUITAllow = By.xpath(prop.getProperty("GSUITAllow"));
		
		
		public multiuser(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
		}
		
		//BFBA
		public  WebElement BFBA(){
			return driver.findElement(BFBA);
			}
		
		public  WebElement BFBAEmail(){
			return driver.findElement(BFBAEmail);
			}

		public  WebElement BFBAPwd(){
			return driver.findElement(BFBAPwd);
			}
		
		public  WebElement BFBAAuth(){
			return driver.findElement(BFBAAuth);
			}
			
		public  WebElement BFBAGrant(){
			return driver.findElement(BFBAGrant);
			}
	
		
		//DBFBA
			
		
		public  WebElement Cloud(){
			return driver.findElement(Cloudss);
			}	
		
		
		public  WebElement DBFBA(){
			return driver.findElement(DBFBA);
			}	
		public  WebElement DBFBAEmail(){
			return driver.findElement(DBFBAEmail);
			}
		
		
		public  WebElement DBFBAPwd(){
			return driver.findElement(DBFBAPwd);
			}
		
		public  WebElement DBFBLogin(){
			return driver.findElement(DBFBLogin);
			}
	

	
	
// Gsuite
		public  WebElement GSUITE(){
			return driver.findElement(GSUITE);
			}
		
		public  WebElement GSUITEGrntAD(){
			return driver.findElement(GSUITEGrntAD);
			}
		
		public  WebElement GSUITEEmail(){
			return driver.findElement(GSUITEEmail);
			}
		
		public  WebElement GSUITNext1(){
			return driver.findElement(GSUITNext1);
			}
		
		public  WebElement GSUITEpwd(){
			return driver.findElement(GSUITEpwd);
			}
		
		public  WebElement GSUITNext2(){
			return driver.findElement(GSUITNext2);
			}

		public  WebElement GSUITAllow(){
			return driver.findElement(GSUITAllow);
			}
		
		

}
	
	
	
	
		
