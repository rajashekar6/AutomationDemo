package ma.MoonAudio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Shoppingcart {

	public static void main(String[] args)throws Exception 
		{
		
		File file = new File("src/test/java/ma/properties/Xpath.properties");
		  
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		
		//load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//prop.getProperty("oneproduct")
			   WebDriver driver = new FirefoxDriver();
			   try{
				   
			driver.manage().window().maximize();
			
			driver.navigate().to(prop.getProperty("URL"));
			Thread.sleep(4000);
			driver.switchTo().window(driver.getWindowHandle());
			
			//driver.findElement(By.xpath(".//*[@id='popup-newsletter-form']/input")).sendKeys("hai"); 
			
			driver.findElement(By.cssSelector(prop.getProperty("close"))).click(); 
			//home icon
			
            driver.findElement(By.xpath(prop.getProperty("Homeicon"))).click(); // home page
            
            
			driver.findElement(By.xpath(prop.getProperty("customeapprons"))).click();
		
			driver.findElement(By.xpath(prop.getProperty("oneproduct"))).click();
			driver.findElement(By.xpath(".//*[@id='options_92_text']")).sendKeys("Honey");
			driver.findElement(By.xpath(".//*[@id='customid182']/a/div")).click();
			driver.findElement(By.xpath(".//*[@id='custom_font_id']")).click();
			driver.findElement(By.xpath(".//*[@id='options-89-list']/li/span/label")).click();
			driver.findElement(By.xpath(".//*[@id='qty']")).clear();
			driver.findElement(By.xpath(".//*[@id='qty']")).sendKeys("3");
			
			driver.findElement(By.cssSelector(".btn-cart")).click();
				Thread.sleep(4000);
				
			   Select dropdown = new Select(driver.findElement(By.id("country")));
			   dropdown.selectByValue("US"); // country
			 
			   Select dropdown1 = new Select(driver.findElement(By.id("region_id")));
			   dropdown1.selectByValue("44"); // state
			   driver.findElement(By.xpath(".//*[@id='postcode']")).sendKeys("22709");  //zipcode 	
			     
			   driver.findElement(By.xpath(" .//*[@id='shipping-zip-form']/div/button")).click(); //get quote
			   
			   Thread.sleep(4000);
			   
			   driver.findElement(By.xpath(".//*[@id='s_method_ups_GND']")).click();  //select ups
			   
			   driver.findElement(By.xpath(".//*[@id='co-shipping-method-form']/div/button")).click();  //update total
			   
			   Thread.sleep(4000);
			    
			   /*float subtotal = 95.85f ;
			   float ground = 14.26f ;	   
			   float total = subtotal + ground ;
			   float Gtotal=95.85f;
			   
			     if(total==Gtotal){
			    	 System.out.println("amount matched");
	  	 
			     }else
			     {
			    	 System.out.println("mis matched");
			     }*/
			     
			
			   
			  
			   }
			   catch (UnhandledAlertException e){
			       System.err.println("Caught UnhandledAlertException: ");    
			   }
			  
}

}


			
			
			
		
		
		
		
		
		
		
		
			 
