package practiceothers;

import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitweights {

	public static void main(String[] args) throws Exception 
	{
		

	//prop.getProperty("oneproduct")
		   WebDriver driver = new FirefoxDriver();
		   try{
			   
		driver.manage().window().maximize();
		
		driver.navigate().to("https://fantasycricket.dream11.com/in/");
		
		WebDriverWait wt = new WebDriverWait(driver, 10);
		wt.until(ExpectedConditions.alertIsPresent());
		
		
		   }
		   
		   catch (UnhandledAlertException e){
		       System.err.println("Caught UnhandledAlertException: ");    
		   }
		  
}

}
