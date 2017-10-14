package pagebject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class footelinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://www.moon-audio.com/");
		
		WebElement footer = driver.findElement(By.xpath(".//*[@id='root-wrapper']/div/div/div[3]/div/div[2]/div/div/div[1]/div[2]/div/div"));
		
		System.out.println("footerlinks are "+ footer.findElements(By.tagName("a")).size());
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int i = footer.findElements(By.tagName("a")).size();
		
		for(int j=0; j<i; j++)
		{
			footer = driver.findElement(By.xpath(".//*[@id='root-wrapper']/div/div/div[3]/div/div[2]/div/div/div[1]/div[2]/div/div"));
			footer.findElements(By.tagName("a")).get(j).getText();
			footer.findElements(By.tagName("a")).get(j).click();
			Thread.sleep(5000);
			
			
			System.out.println(driver.getTitle());

			System.out.println("");
			
			if(driver.getTitle().contains("404"))
			{
			System.out.println("404found");	
			}
			driver.navigate().back();
			Thread.sleep(4000);
			
		}	
	}

}
