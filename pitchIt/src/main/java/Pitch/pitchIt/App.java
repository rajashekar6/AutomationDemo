package Pitch.pitchIt;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class App 
{

	public static void main( String[] args ) throws MalformedURLException
    {
    	/*String f= "C:/drivers/appium/PitchIt1.apk";
    	File fs = new File(f);*/
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus");
        cap.setCapability(MobileCapabilityType.APP, "C:/drivers/appium/PitchIt1.apk");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
       
    }
}
