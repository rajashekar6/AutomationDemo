package b1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> authors = driver.findElements(By.xpath("//table[@name='BookTable']//tr/td[2]"));
	
		for(WebElement e : authors)
		{
			String s= e.getText();
			
			if(s.equals("Mukesh"))
			{
				
				String ss =driver.findElement(By.xpath("//table[@name='BookTable']//td[2]/preceding::td[1]")).getText();
				
				System.out.println(ss + " "+s);
				
			}
		}
		
		List<WebElement> ll= driver.findElements(By.xpath("//table[@name='BookTable']//td[4]"));
		int t= 0;
		for(WebElement e : ll)
		{
			String s =e.getText();
			
			t= t+Integer.parseInt(s);
			
			
		}
		System.out.println(t);
	}

}
