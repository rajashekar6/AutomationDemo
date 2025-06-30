package b1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAUtosuggestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("mobile");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<WebElement> list1 = driver.findElements(By.xpath("//form[@action='/search']/ul/li/div/a/div[2]")); //flipkart search
		
		System.out.println(list1.size());
		
		for(WebElement e : list1)
		{
			String s= e.getText();
			System.out.println(s);
			
			if(s.equals("mobile under 12000"))
			{
				e.click();
			}
		}
		
		
		
		
	}

}
