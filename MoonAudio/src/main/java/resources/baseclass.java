package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseclass {

public 	WebDriver driver;	
public Properties prop;


public WebDriver initializeDriver() throws IOException	
{
	

prop =new Properties();
FileInputStream  fis=new FileInputStream("C:\\Users\\Exinent\\workspace\\MoonAudio\\src\\main\\java\\resources\\data.properties");
	
prop.load(fis);	
String browserName=prop.getProperty("browser");	
System.out.println(browserName);

if(browserName.equals("chrome"))
{
//execute in chrome	code
	System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//Google//Chrome//Application//chrome.exe");
	driver =new ChromeDriver();
	
	
}
else if(browserName.equals("firefox"))
{
	//System.setProperty("webdriver.firefox.driver", "C://drivers//geckodriver-0.18.0");
	driver =new FirefoxDriver();	
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



	
}
