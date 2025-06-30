package ba;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//WebDriver driver = new EdgeDriver();

		//driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");

		driver.navigate().to("url");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus mobile");
		
		Thread.sleep(3000);
		
		List<WebElement> sug = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		
		for(WebElement s : sug) {
		
		String ss = s.getAttribute("aria-label");
	
		
		System.out.println(ss);
		
		if(ss.equalsIgnoreCase("oneplus mobile under 20000"))
			s.click();
		}
	}
	}


