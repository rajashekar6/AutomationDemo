package ma.MoonAudio;

import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Createlogin {

	public static void main(String[] args) throws Exception
	
	{
		   WebDriver driver = new FirefoxDriver();
		   try{
			   
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.flirtyaprons.com/");
		Thread.sleep(4000);
		driver.switchTo().window(driver.getWindowHandle());
		driver.findElement(By.xpath("html/body/div[9]/div/a")).click();
		
		
		
		driver.findElement(By.xpath("html/body/header/div/div[2]/div/div[1]/div[7]/a")).click(); //Login button
		
		//Loginpage
		driver.findElement(By.xpath(".//*[@id='login-form']/div/div[1]/div[2]/a[1]")).click();
		
		Thread.sleep(3000);
		//create account
		driver.findElement(By.xpath(".//*[@id='firstname']")).sendKeys("david");
		driver.findElement(By.xpath(".//*[@id='lastname']")).sendKeys("broad");
		driver.findElement(By.xpath(".//*[@id='email_address']")).sendKeys("david@gmail.com");
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("david123");
		driver.findElement(By.xpath(".//*[@id='confirmation']")).sendKeys("david12");
		driver.findElement(By.xpath(".//*[@id='form-validate']/fieldset/div[3]/button")).click();
		
		
		
		
		
	
		Thread.sleep(4000);   
		   }
		  
		   catch (UnhandledAlertException e){
		       System.err.println("Caught UnhandledAlertException: ");    
		   }
	}

}
