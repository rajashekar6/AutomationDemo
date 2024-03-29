package CF.cf123;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class settings {

	public static void main(String[] args) throws InterruptedException
	{
		

	  	File file = new File("src/test/java/cloud/properties/xpaths.properties");
		  
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
		
		WebDriver driver = new FirefoxDriver();
		
		try{
		
		driver.manage().window().maximize();	
		driver.navigate().to(prop.getProperty("URL"));
		//login page 
		driver.findElement(By.xpath(prop.getProperty("Enter_email"))).sendKeys("raja@cloudfuze.com");
		driver.findElement(By.xpath(prop.getProperty("Enter_password"))).sendKeys("cloudfuze");
		driver.findElement(By.xpath(prop.getProperty("Login_button"))).click();
		Thread.sleep(2000);			
		
		driver.findElement(By.xpath(prop.getProperty("Settings"))).click();
		//Name edit
		driver.findElement(By.xpath(prop.getProperty("NameEdit"))).click();	
		driver.findElement(By.xpath(prop.getProperty("Namefield"))).sendKeys("raja1");
		driver.findElement(By.xpath(prop.getProperty("NameOk"))).click();
		//Password Edit
		driver.findElement(By.xpath(prop.getProperty("PasswordEdit"))).click();
		driver.findElement(By.xpath(prop.getProperty("Passwordfield"))).sendKeys("cloudfuze"); 
		driver.findElement(By.xpath(prop.getProperty("PasswordCfield"))).sendKeys("cloudfuze");
		driver.findElement(By.xpath(prop.getProperty("PasswordOk"))).click();
		
		
		//Payment info
		driver.findElement(By.xpath(prop.getProperty("Paymentinfo"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(prop.getProperty("M.basic"))).click();
	
		Thread.sleep(3000);
		driver.switchTo().window(driver.getWindowHandle());
		
		driver.findElement(By.xpath(prop.getProperty("Couponcode"))).sendKeys("CF20");
		driver.findElement(By.xpath(prop.getProperty("CouponApply"))).click();	
		
		if(driver.getPageSource().contains("Your Coupon has been Applied Successfully"))
		  {
		    System.out.println("1. coupon applied successfully");
		  }
		else
		  {
		    System.out.println("coupon is invalid");
		  }
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("Checkout"))).click();
		
		Thread.sleep(8000);
		if(driver.getPageSource().contains("Agree and Continue"))
		  {
		    System.out.println("PayPal page landed successfully");
		  }
		else
		  {
		    System.out.println("PayPal page failed");
		  }
		
			//driver.close();
			
		}catch (UnhandledAlertException e){
			System.err.println("Caught UnhandledAlertException: ");
		}
	}
}

