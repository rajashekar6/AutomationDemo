package jmetertes;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sampletesting {

	@Test
	
	public void testing()
	{
	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://ebay.com");
		System.out.println(driver.getTitle());
		
	
		
		
	}
	
	
}
