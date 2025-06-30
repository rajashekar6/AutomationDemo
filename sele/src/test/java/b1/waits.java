package b1;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//WebDriver driver = new EdgeDriver();

		//driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(15));
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
		
		
		Wait<WebDriver> fw = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		WebElement s=fw.until(new Function<WebDriver, WebElement>(){
			

					public WebElement apply(WebDriver driver) {
						// TODO Auto-generated method stub
						
						WebElement s  = driver.findElement(By.xpath(""));
						
						return s;
					}
					});
				   
				 s.sendKeys("Admin");

			}

		


				
		}
		
		
