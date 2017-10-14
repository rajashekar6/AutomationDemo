package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.baseclass;

public class boxadds extends baseclass {
	
	public WebDriver driver;
	
	By Clouds	   = By.xpath(prop.getProperty("Clouds"));
	By Box 		   = By.xpath(prop.getProperty("Box"));
	By BUsername   = By.xpath(prop.getProperty("BUsername"));
	By BPassword   = By.xpath(prop.getProperty("BPassword"));
	By BLogin 	   = By.xpath(prop.getProperty("BLogin"));
	By Grantaccess = By.xpath(prop.getProperty("Grantaccess"));
	By All_files   = By.xpath(prop.getProperty("All_files"));
	By Allfiles    = By.xpath(prop.getProperty("Allfiles"));
	By Cloud1      = By.xpath(prop.getProperty("Cloud1"));
	By boxname     = By.xpath(prop.getProperty("cloudDispName"));
	By Upload	   = By.id(prop.getProperty("Upload"));
	By Uploadpopup = By.xpath(prop.getProperty("Uploadpopup"));
	
	
	public boxadds(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	//boxadd
	public  WebElement Clouds(){
		 return driver.findElement(Clouds);
		}
	public  WebElement Box(){
			return driver.findElement(Box);
		}
	public  WebElement BUsername(){
		return driver.findElement(BUsername);
		}
	public  WebElement BPassword(){
		return driver.findElement(BPassword);
		}
	public  WebElement BLogin(){
		return driver.findElement(BLogin);
		}
	
	public  WebElement Grantaccess(){
		return driver.findElement(Grantaccess);
		}
	
	public  WebElement All_files(){
		return driver.findElement(All_files);
		}
	
	public  WebElement Allfiles(){
		return driver.findElement(Allfiles);
		
		}
	
	public  WebElement Cloud1(){
		return driver.findElement(Cloud1);
		
		}
	public  WebElement boxname(){
		return driver.findElement(boxname);
		
		}
	
	public  WebElement Upload(){
		return driver.findElement(Upload);
		}
	
	
	public  WebElement Uploadpopup(){
		return driver.findElement(Uploadpopup);
		
		}
	
//
}
