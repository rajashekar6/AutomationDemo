package b1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascritpte {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement e= driver.findElement(By.xpath("//input[@id='name']"));
		WebElement e2= driver.findElement(By.xpath("//input[@id='email']"));
		
		WebElement e3= driver.findElement(By.xpath("//input[@id='male']"));
		
		//scroll bar
		WebElement e4= driver.findElement(By.xpath("//h2[normalize-space()='Pagination Table']"));


		//e.sendKeys("ss");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value', 'raj')", e);
		
		js.executeScript("arguments[0].setAttribute('value', 'beeram@gmail.com')", e2);
		
		//click 
		js.executeScript("arguments[0].click()", e3);
		
		//scroll the page 
		//pixel number, till webelement, till endof page
		//js.executeScript("window.scrollby(0,3000)", ""); //pixels
		//System.out.println(js.executeScript("return window.pageYoffset;"));
		
		//till webelement 
		js.executeScript("arguments[0].scrollIntoView();", e4);
	}

}
