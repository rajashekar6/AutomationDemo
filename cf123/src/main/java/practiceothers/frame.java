package practiceothers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class frame {

	public static void main(String[] args) throws Exception 
	{
		

	//prop.getProperty("oneproduct")
		   WebDriver driver = new FirefoxDriver();
		   try{
			   
		driver.manage().window().maximize();
		
		driver.navigate().to("https://fantasycricket.dream11.com/in/");
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='m_rtxtEmail1']")).sendKeys("nareshanna123111@gmail.com");
		driver.findElement(By.xpath(".//*[@id='m_rtxtPassword']")).sendKeys("naresh@6");
		
		Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='m_selDate']")));
		dropdown.selectByVisibleText("7");
		
		Select dropdown1 = new Select(driver.findElement(By.xpath(".//*[@id='m_selMonth']")));
		dropdown1.selectByVisibleText("April");
		
		Select dropdown2 = new Select(driver.findElement(By.xpath(".//*[@id='m_selYear']")));
		dropdown2.selectByVisibleText("1997");
		
		driver.findElement(By.xpath(".//*[@id='m_frmRegister']/div[6]/p")).click();
		driver.findElement(By.xpath(".//*[@id='registerClick']")).click();
		
		
		   }
		   
		   catch (UnhandledAlertException e){
		       System.err.println("Caught UnhandledAlertException: ");    
		   }
		  
}

}

