package com.testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class NewTest {

WebDriver driver;//'driver' is a Global variable
 @Test
 public void f() {
//Actual Test Case
 driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
 String title = driver.getTitle();
 System.out.println(title);
 if(title.equals("OrangeHRM - New Level of HR Management"))
 {
 System.out.println("Pass");
 }
 else
 {
 System.out.println("Failed");
 }
 	driver.findElement(By.name("txtUserName")).sendKeys("selenium");

	driver.findElement(By.name("txtPassword")).sendKeys("selenium123");
	
	driver.findElement(By.name("Submit")).click();
	
 }
 
 
 @BeforeClass
 public void beforeClass() {
//Launch the Browser
 driver = new FirefoxDriver();
 driver.manage().window().maximize();
 }


 @AfterClass

 public void afterClass() {
	
 //Close the Browser

 }

}