package b1;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frames_alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//WebDriver driver = new EdgeDriver();

		//driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		Alert a = driver.switchTo().alert();
		a.accept();
		a.dismiss();
		a.sendKeys("ss");
		
		WebElement ele= driver.findElement(By.xpath(""));
		
		//frames
		driver.switchTo().frame("name");
		driver.switchTo().frame(0);
		driver.switchTo().frame(ele);
		driver.switchTo().frame("id");
		
		driver.switchTo().defaultContent();  //come out of frame to main webpage
		
		//INner frame /nested frame 
		driver.switchTo().frame(0); //index as we have only one inside frame
		
		//Select 
		
		Select s = new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("value");
		s.selectByVisibleText("visible text on UI");
		
		s.deselectByIndex(0);
		s.deselectAll();
		List<WebElement> all = s.getOptions();
		all.size();
		
		
	}

}
