package testNGpkg;

import org.testng.annotations.Test;

public class test1 {
	
	
		@Test(priority=1)
		
		void login()
		{
			System.out.println("t11");
		}

		@Test(priority=14)
			
			void login1()
			{
				System.out.println("2");
			}
		
		@Test(priority=12)
		
		void login3()
		{
			System.out.println("3");
		}
		
		@Test(priority=2)
		
		void login4()
		{
			System.out.println("4");
		}
		

}
