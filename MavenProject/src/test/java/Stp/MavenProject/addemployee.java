package Stp.MavenProject;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;

public class addemployee {

	
	public static void main(String[] args) throws InterruptedException {

	
	// open the firefoxbrowser
		WebDriver driver=new FirefoxDriver();
	//maximize the browser
		driver.manage().window().maximize();
	
		driver.navigate().to("http://opensource.demo.orangehrmlive.com/");	

		driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("admin");

		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("admin");
		
		driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
	
		//go to category > then mouse hover > choose sub category
		
		WebElement pim = driver.findElement(By.xpath(".//*[@id='menu_pim_viewPimModule']/b"));
		
		WebElement addEmp = driver.findElement(By.xpath(".//*[@id='menu_pim_addEmployee']"));
	
		Actions act = new Actions(driver);

		Thread.sleep(5000);
		act.moveToElement(pim).moveToElement(addEmp).build().perform();
		act.click().build().perform();
		Thread.sleep(10000);
	
		driver.findElement(By.xpath(".//*[@id='firstName']']")).sendKeys("rajashekar");
		Thread.sleep(6000);
		driver.findElement(By.xpath(".//*[@id='lastName']']")).sendKeys("shekar");
		driver.findElement(By.xpath(".//*[@id='employeeId']")).sendKeys("1050");
		
		driver.findElement(By.xpath(".//*[@id='btnSave']")).click();
		
		
	}
}	