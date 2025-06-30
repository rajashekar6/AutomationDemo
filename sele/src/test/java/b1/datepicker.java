package b1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class datepicker {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		
		driver.switchTo().frame("frame-one796456169");
		//WebElement cal= driver.findElement(By.id("q4_label"));
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", cal);

		driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
		Select year = new Select(driver.findElement(By.xpath("//Select[@class='ui-datepicker-year']")));
		year.selectByVisibleText("1992");
		
		String Gmonth = "July";
		String Gdate ="21";
		
		List<WebElement> Month = driver.findElements(By.xpath("//span[@class='ui-datepicker-month']"));
		
		
		List<WebElement> date = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
		
		for(WebElement m : Month)
		{
			
			String mo = m.getText();
			driver.findElement(By.xpath("//a[@class='ui-datepicker-prev ui-corner-all']")).click();
			if(mo.equals(Gmonth))
			{
				for(WebElement d : date)
				{
					String da = d.getText();
					if(da.equals(Gdate))
					{
						d.click();
					}
				}
				
				
			}
		}
		
		
	}

}
