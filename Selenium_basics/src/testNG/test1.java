package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {
	
	@Test
	public void testDemowebshop()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.09\\Desktop\\New folder\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/registerresult/1");
	String Result=driver.findElement(By.className("result")).getText();
	Assert.assertEquals(Result, "Your registration completed");
	driver.close();
	System.out.println("Test code cont....");
	}
}
