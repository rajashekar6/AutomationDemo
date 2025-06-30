package b1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//WebDriver driver = new EdgeDriver();

		//driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");

		
		// Inner text method 
		driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		driver.findElement(By.xpath("//span[text()='Tomorrow, 9 September']")).click();  //text only 

		
		driver.findElement(By.xpath("//span[normalize-space(text())='Tuesday 10 September'   ]")).click();  //text with spaces and all  

		
		
		//contains method 
		driver.findElement(By.xpath("//div[contains(@id,'glow-ingress-block')]")).click();
		driver.findElement(By.xpath("//div[contains(@id,'glow-inc')]")).click(); //it will work with partial text
		driver.findElement(By.xpath("//div[starts-with(@id,'glow-in')]")).click(); //it will work with beginning text

		//chained path
		driver.findElement(By.xpath("//div[@id='nav-global-location-slot']/span/a/div[1]\r\n")).click(); 
		
		
		//above 30 review for mobies  
		driver.findElement(By.xpath("//span[contains(@class,'a-size-base s-underline-text') and text()>30]\r\n")).click();
		
		
		
		//parent 
		driver.findElement(By.xpath("//span[normalize-space(text())='Tuesday 10 September'  ]/parent::span")).click();  //only one parent can be found 
		
		//following  
		driver.findElement(By.xpath("//span[normalize-space(text())='₹16,877'  ]//following::span[1]")).click();
		driver.findElement(By.xpath("//a[text()='Protect and Build Your Brand']/following::a[4]")).click();

		
		//preceding
		driver.findElement(By.xpath("//span[normalize-space(text())='₹16,877'  ]/preceding::span[3]")).click();
		driver.findElement(By.xpath("//a[text()='Protect and Build Your Brand']/preceding::a[1]")).click();

		
		//following -sibling 
		driver.findElement(By.xpath("//span[normalize-space(text())='₹16,877'  ]/following-sibling::span")).click();
		
		//preceding-sibling 
		driver.findElement(By.xpath("//span[@class='a-price-whole' and text()='16,877']/preceding-sibling::span")).click();

		//ancestor
		driver.findElement(By.xpath("//span[@class='a-price-whole' and text()='16,877']/ancestor::div[1]")).click();

		//descendant
		driver.findElement(By.xpath("//span[@class='aok-inline-block s-image-logo-view']/descendant::i")).click();

		boolean status = driver.findElement(By.xpath("")).isDisplayed(); //isselected(); isEnabled();
		driver.findElement(By.xpath("")).click();

		driver.findElement(By.xpath("")).click();

		driver.findElement(By.xpath("")).click();

		driver.findElement(By.xpath("")).click();

		driver.findElement(By.xpath("")).click();


		
		
	}

}
