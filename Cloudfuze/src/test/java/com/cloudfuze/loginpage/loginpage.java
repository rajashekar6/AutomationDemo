package com.cloudfuze.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginpage {
	
	public static void main(String[] args) throws InterruptedException {

		// open the firefoxbrowser
			WebDriver driver=new FirefoxDriver();
		//maximize the browser
			driver.manage().window().maximize();
		
			 driver.navigate().to("https://webapp.cloudfuze.com");
			 
			 driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[1]"));
			

			driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/input")).sendKeys("raja@cloudfuze.com");

			driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[2]/input")).sendKeys("cloudfuze");
			
			driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[1]/input']")).click();
		
			Thread.sleep(5000);
		//dsd
			//new commit

		//2nd from other
	
	}
}
