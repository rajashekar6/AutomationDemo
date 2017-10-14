package pageobject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.baseclass;

public class loginpage extends baseclass{
	
	public WebDriver driver;
		//login	
		By Enter_email 	  = By.xpath(prop.getProperty("Enter_email"));
		By Enter_password = By.xpath(prop.getProperty("Enter_password"));
		By Login_button   = By.xpath(prop.getProperty("Login_button"));
		
	
		public loginpage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
		}
		
		//login
		public  WebElement Enter_email(){
			 return driver.findElement(Enter_email);
			}
		
		public  WebElement Enter_password(){
			
			return driver.findElement(Enter_password);
			}
		

		public  WebElement Login_button(){
			return driver.findElement(Login_button);
			}
		
		
	
	
	
	
}
