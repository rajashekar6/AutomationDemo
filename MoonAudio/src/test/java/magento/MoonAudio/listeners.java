package magento.MoonAudio;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.baseclass;

public class listeners implements ITestListener {
baseclass b =new baseclass();

public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	//Screenshot
	try{
		b.getScreenshot(result.getName());
	}catch (IOException e) {
	// TODO Auto-generated catch block
	
	e.printStackTrace();
	}
	}
	
	
	

public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	
}

public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	
}
}
