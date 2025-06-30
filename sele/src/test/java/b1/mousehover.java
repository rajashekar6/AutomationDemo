package b1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//WebDriver driver = new EdgeDriver();
		//ArrayList 
		
		//driver.get("https://www.google.com");
		driver.get("https://demo.opencart.com");
		
		
		Thread.sleep(6000);
		WebElement dt =driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(dt).moveToElement(mac).build().perform();
		mac.click();
		
		a.contextClick(mac).perform();
		a.dragAndDrop(dt, mac).build().perform();
		a.doubleClick(mac);
		a.clickAndHold(mac);
		
		
		a.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform() ;
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		
	}

}
