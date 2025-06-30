package testNGpkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class allannot {

	
	@BeforeSuite
	void BeforeSuite1()
	{
		System.out.println("BeforeSuite1");
	}
	

	
	@BeforeTest
	void BeforeTest1() {
		System.out.println("BeforeTest1");
	}
	
	
	@BeforeClass
	void BeforeClass1() {
		System.out.println("BeforeClass1");
	}      
	
	
	@BeforeMethod
	void BeforeMethod1() {
		System.out.println("BeforeMethod1");
	}
	
	
	
	
	
	@Test
	void Test1() {
		System.out.println("Test1");
	}
	
	
	@AfterMethod
	
	void AfterMethod1() {
		System.out.println("AfterMethod1");
	}
	
	
	@AfterClass
	void AfterClass1() {
		System.out.println("AfterClass1");
	}
	
	@AfterTest
	void AfterTest1() {
		System.out.println("AfterTest1");
	}
	
	@AfterSuite
	void AfterSuite1() {
		System.out.println("AfterSuite1");
	}
	
	
	
	
}
