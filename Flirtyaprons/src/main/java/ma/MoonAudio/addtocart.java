package ma.MoonAudio;

import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class addtocart {

	public static void main(String[] args)throws Exception
 {
		// TODO Auto-generated method stub
			
			{
				   WebDriver driver = new FirefoxDriver();
				   try{
					   
				driver.manage().window().maximize();
				
				driver.navigate().to("https://www.flirtyaprons.com/");
				Thread.sleep(4000);
				driver.switchTo().window(driver.getWindowHandle());
				
				//driver.findElement(By.xpath(".//*[@id='popup-newsletter-form']/input")).sendKeys("hai"); 
				
				driver.findElement(By.cssSelector(".dialogClose.style3.overlay2")).click(); 
				//Login
                driver.findElement(By.xpath("html/body/header/div/div[1]/a/img")).click();
                
				driver.findElement(By.xpath(".//*[@id='nav']/li[4]/a/span")).click();
				
				
				
				driver.findElement(By.xpath(".//*[@id='nav']/li[4]/a/span")).click();
				driver.findElement(By.xpath("html/body/section/div/article/div[4]/ul/li[1]/div/div[2]/div/div[1]/a")).click();
				driver.findElement(By.xpath(".//*[@id='options_92_text']")).sendKeys("Honey");
				driver.findElement(By.xpath(".//*[@id='customid182']/a/div")).click();
				driver.findElement(By.xpath(".//*[@id='custom_font_id']")).click();
				driver.findElement(By.xpath(".//*[@id='options-89-list']/li/span/label")).click();
				driver.findElement(By.xpath(".//*[@id='qty']")).sendKeys("2");
				
					
				driver.findElement(By.cssSelector(".btn-cart")).click();
				driver.findElement(By.cssSelector(".btn-proceed-checkout")).click();
				//driver.findElement(By.xpath(".//*[@id='options_114_5']")).click();
			
				Thread.sleep(4000);   
				   }
				  
				   catch (UnhandledAlertException e){
				       System.err.println("Caught UnhandledAlertException: ");    
				   }

	}

 }
}

