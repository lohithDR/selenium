package testNG;

import org.testng.annotations.Test;

public class testgroup {
	
	

	@Test(groups={"smoke"})
	public void test1() {
		System.out.println("test1");
	}
	@Test(groups={"smoke"})
	public void test2() {
		System.out.println("test2");
	}
	@Test(groups={"dry"})
	public void test3() {
		System.out.println("test3");
	}
	@Test(groups={"smoke","dry"})
	public void test4() {
		System.out.println("test4");
	}
	

}
