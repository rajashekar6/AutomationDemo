package b1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class n1 {

	public static void main(String arg[]) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//WebDriver driver = new EdgeDriver();

		//driver.get("https://www.google.com");
		driver.get("https://demo.opencart.com");
		
		String pagetile= driver.getTitle();
		String exptitle = "Your store";
		
		if(exptitle.equalsIgnoreCase(pagetile))
			System.out.println("test passed");
		else
		{
			System.out.println("not passed");
		}
		
		WebElement searchbox = driver.findElement(By.name("search"));
		searchbox.sendKeys("macbook");
		Thread.sleep(5000);
		driver.close();
	}
	
	
	
}
