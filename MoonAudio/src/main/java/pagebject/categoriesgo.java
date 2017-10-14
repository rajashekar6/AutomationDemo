package pagebject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.baseclass;

public class categoriesgo extends baseclass {
	
	public WebDriver driver;
		
	By Headphones =By.xpath(".//*[@id='nav']/li[kk2]/a/span[1]");
	By addproduct =By.cssSelector(".button.btn-cart");
	

	public categoriesgo(WebDriver driver) {
		// TODO Auto-generated constructor stub
	
		this.driver=driver;
	}
	
	public  WebElement catheadphones()
	{
		
		return driver.findElement(Headphones);
		
		
	}

	public  WebElement addproduct()
	{
		
		return driver.findElement(addproduct);
		
		
	}
	
	
	
}
