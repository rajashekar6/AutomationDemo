package pagebject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
	
	public WebDriver driver;
		
	By LoginEmail = By.xpath(".//*[@id='email']");
	By LoginPwd   = By.xpath(".//*[@id='pass']");
	By Loginsbmt   = By.xpath(".//*[@id='send2']");

	public loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	
		this.driver=driver;
	}



	public  WebElement getemail()
	{
		
		return driver.findElement(LoginEmail);
		
		
	}
	
	public  WebElement getpassword()
	{
		
		return driver.findElement(LoginPwd);
		
		
	}
	
	public  WebElement getloginsbmt()
	{
		
		return driver.findElement(Loginsbmt);
		
		
	}
	
	
	
	
	
	
}
