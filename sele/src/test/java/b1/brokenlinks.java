package b1;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int nofblinks=0;
		for(WebElement e : links)
		{
			String l= e.getAttribute("href");
			
			if(l==null || l.isEmpty())
			{
				System.out.println("links are not proper or empty");
				continue;
				
			}
			
			try
			{
				URL url = new URL(l);
				HttpURLConnection con= (HttpURLConnection)url.openConnection();
				con.connect();
				
				if(con.getResponseCode()>=400)
				{   
					System.out.println(l+"is valid");
					nofblinks++;
				}
				else {
					System.out.println(l+"not valid");
				}
			}
				catch(Exception e1)
				{
					
				}
			
		}
		
	}

}
