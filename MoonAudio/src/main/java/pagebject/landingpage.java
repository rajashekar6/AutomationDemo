package pagebject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.baseclass;

public class landingpage extends baseclass {
	
	public WebDriver driver;
		
	By login = By.xpath(".//*[@id='header-account']/div/a[2]");
	By search= By.xpath(".//*[@id='header-search']/form/div[1]/div[1]/input");
	By clicksearch = By.xpath(".//*[@id='header-search']/form/div[2]/button");
	
	public landingpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	
		this.driver=driver;
	}



	public  WebElement getlogin()
	{
		
		return driver.findElement(login);
		
		
	}
	
	public  WebElement getsearch()
	{
		
		return driver.findElement(search);
		
		
	}
	
	public  WebElement getsearchclick()
	{
		
		return driver.findElement(clicksearch);
		
		
	}
	
}
