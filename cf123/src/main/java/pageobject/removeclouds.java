package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.baseclass;

public class removeclouds extends baseclass {

	public WebDriver driver;
	
	By Clouds 	    = By.xpath(prop.getProperty("Clouds"));
	By Manageclouds = By.xpath(prop.getProperty("Manageclouds"));
	
	By DeletmultiCloud1 = By.xpath(prop.getProperty("DeletmultiCloud1"));  //source cloud1
	By DeletmultiCloud2 = By.xpath(prop.getProperty("DeletmultiCloud2")); // destination cloud1
			
	public removeclouds(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	
	//source and destination
	public  WebElement Clouds(){
		return driver.findElement(Clouds);
		}
	
	public  WebElement Manageclouds(){
		return driver.findElement(Manageclouds);
		}

	public  WebElement DeletmultiCloud1(){
		return driver.findElement(DeletmultiCloud1);
		}
	public  WebElement DeletmultiCloud2(){
		return driver.findElement(DeletmultiCloud1);
		}
	

}