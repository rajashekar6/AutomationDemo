package b1;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotdemo {

	public static void main(String[] args) {

		
		
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File f = ts.getScreenshotAs(OutputType.FILE);
		File sf = new File(System.getProperty("user.dir")+"\\sss\\fpage.png");
		
		f.renameTo(sf);
	}

}  	
