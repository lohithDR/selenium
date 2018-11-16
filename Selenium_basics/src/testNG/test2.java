package testNG;

import org.testng.annotations.Test;

public class test2 {
	@Test
	public void test()
	{
		System.out.println("test 1");
	}
	@Test
	public void abs()
	{
		System.out.println("test abs");
	}	
		@Test
		public void google()
		{
			System.out.println("test Google");
			
		}
		@Test(dependsOnMethods= {"abs", "google"})
		public void apple()
		{
			System.out.println("test Apple");
		}
}
	


