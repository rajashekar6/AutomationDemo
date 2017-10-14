package practiceothers;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class cloudtest {
	
	
	@Test
public void setup() throws MalformedURLException
{
	DesiredCapabilities dc= DesiredCapabilities.firefox();
	dc.setCapability("version", "5");
	dc.setCapability("platform", "XP");

WebDriver driver = new RemoteWebDriver(
    //            new ("http://rahul1:e950d779-1817-4c3c-b122-06715b814dfd@ondemand.saucelabs.com:80/wd/hub"),
                dc);

driver.get("http://ebay.com");
System.out.println(driver.getTitle());

	
	
}   //http://saucelabid:Accesskey@ondemand.saucelabs.com:80/wd/hub
	
	//seleniumrajashekar/raja123   raj 9666  
}
