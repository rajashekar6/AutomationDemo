package ma.MoonAudio;

import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class footerlinks {

	public static void main(String[] args) throws Exception
 {
		// TODO Auto-generated method stub
			
			{
				   WebDriver driver = new FirefoxDriver();
				   try{
					   
				driver.manage().window().maximize();
			
				driver.navigate().to("https://www.flirtyaprons.com/");
				Thread.sleep(4000);
				driver.switchTo().window(driver.getWindowHandle());
				
				//driver.findElement(By.xpath(".//*[@id='popup-newsletter-form']/input")).sendKeys("hai"); 
				
				driver.findElement(By.cssSelector(".dialogClose.style3.overlay2")).click(); 
				
				System.out.println("Links in the entire page");
				System.out.println(driver.findElements(By.tagName("a")).size());
				
				WebElement Footer= driver.findElement(By.xpath("html/body/footer/div"));
				System.out.println("Links in the footer section of flirty approns");
				System.out.println(Footer.findElements(By.tagName("a")).size());
				
				WebElement Policycol = driver.findElement(By.xpath("html/body/footer/div/div/div[2]"));
				
				System.out.println("Links in the policy col");
				System.out.println(Policycol.findElements(By.tagName("a")));
				
				
				String BeforeClicking = null;
				String Afterclikcing;
			
				
				for(int i=0;i<Policycol.findElements(By.tagName("a")).size();i++)
				{
					//System.out.println(Policycol.findElements(By.tagName("a")).get(i).getText());
					
					
					if(Policycol.findElements(By.tagName("a")).get(i).getText().contains("Become a Distributor")){
						
					
						BeforeClicking=driver.getTitle();
						Policycol.findElements(By.tagName("a")).get(i).click();
						break;
					}	
					}
					
				
				//System.out.println(driver.getTitle());
				Afterclikcing = driver.getTitle();
				 if(BeforeClicking !=Afterclikcing)
				 {
					System.out.println("testcase pass");
					  
				 }
				 else
				 {
					 System.out.println("testcase fail");
				 }
				 }
				   
				  
				   catch (UnhandledAlertException e){
				       System.err.println("Caught UnhandledAlertException: ");   
				      
				       
				   }

	}

 }
}

