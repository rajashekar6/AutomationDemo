package b1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdowns {
	public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//WebDriver driver = new EdgeDriver();

	//driver.get("https://www.google.com");
	driver.manage().window().maximize();
	driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	
	driver.findElement(By.xpath("//button[contains(@class, 'multiselect')]")).click();
	
	List<WebElement> options =driver.findElements(By.xpath("//ul[contains(@class, 'multiselect-')]//label"));
	
	for(WebElement e: options)
	{
		String s= e.getText();
		if(s.equals("HTML") || s.equals("Java") || s.equals("Oracle"))
		{
		e.click();
	}
	}
		
	}
}
