package practiceothers;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.os.WindowsUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class screenshotnother {

	public static void main(String[] args)throws Exception 
	{
	
		   WebDriver driver = new FirefoxDriver();
		   try{
			   
			   driver.get("https://www.google.co.in/");
		//casting screenshot to class
			   driver.findElement(By.cssSelector("#gs_htif0")).sendKeys("cloudfuze");
			   
			File srcFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			// do actioins screenshots
			
			FileUtils.copyFile(srcFile, new File("C:\\drivers\\screen22.png"));
			
		   }
		   
		   catch (UnhandledAlertException e){
		       System.err.println("Caught UnhandledAlertException: ");    
		   }
		  
}

}
