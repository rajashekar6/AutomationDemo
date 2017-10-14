package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseclass {


		public static WebDriver driver;	
		public static Properties prop;
		
		public static  WebDriver initializeDriver() throws IOException	
		{
		prop =new Properties();
		FileInputStream  fis=new FileInputStream("C:\\Users\\Exinent\\workspace\\cf123\\src\\main\\java\\resources\\xpaths.properties");
		FileInputStream  fis1=new FileInputStream("C:\\Users\\Exinent\\workspace\\cf123\\src\\main\\java\\resources\\xpaths2.properties");	
		prop.load(fis);	
		prop.load(fis1);
		
		String browserName=prop.getProperty("browser");	
		System.out.println(browserName);

		driver =new FirefoxDriver();
		
		if(browserName.equals("chrome"))
		{
		//execute in chrome	code
			System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//Google//Chrome//Application//chrome.exe");
			driver =new ChromeDriver();
			
			
		}
		else if(browserName.equals("firefox"))
		{
			//System.setProperty("webdriver.firefox.driver", "C://drivers//geckodriver-0.18.0");
				
		}
		else if(browserName.equals("IE"))
		{
			
		}
		
		
		//Timeouts for all testcases 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	
		
		return driver;
		}


		public void getScreenshot(String result) throws IOException
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("C://test//"+result+"screenshot.png"));
		}
		
		
		//window handles for clouds
		public static void windowhandle() {
			// TODO Auto-generated method stub
			
			String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
			String subWindowHandler = null;
			
			Set<String> handles = driver.getWindowHandles(); // get all window handles
			Iterator<String> iterator = handles.iterator();
			while (iterator.hasNext()){
			    subWindowHandler = iterator.next();
			    }
			
			driver.switchTo().window(subWindowHandler);
			
		}
		
		//default content from child windows
		public static void winHandleBefore() {
			// TODO Auto-generated method stub
			String winHandleBefore = driver.getWindowHandle();
			driver.switchTo().window(winHandleBefore);
		}

		
		public void deleteAllCookiesExample()
		{
			
		  driver.navigate().to(prop.getProperty("URL"));
			driver.manage().deleteAllCookies();
		}
		

		}

