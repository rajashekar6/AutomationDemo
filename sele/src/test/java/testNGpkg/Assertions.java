package testNGpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	
	@Test
	void Test1() {
		
		String s= "t22";
		String s1= "t22";
		
		Assert.assertEquals(s, s1);
		
		

		System.out.println("Test1");
	}

}
