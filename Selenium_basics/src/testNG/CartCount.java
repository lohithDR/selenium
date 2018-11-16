package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CartCount {
	WebDriver driver;
	
	@BeforeClass
	public void beforclass()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.09\\Desktop\\New folder\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterClass //(enabled=false)
	public void afterclass()
	{
		driver.close();
	}
	@Test
	public void testcartcount() throws InterruptedException
	{
		driver.get("http://demowebshop.tricentis.com/");
		//driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("demowed@test7.com");
		driver.findElement(By.id("Password")).sendKeys("abcd123");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		WebElement table=driver.findElement(By.className("cart"));
		List<WebElement> list=table.findElements(By.tagName("tr"));
		Assert.assertEquals(list.size()-1, 3);
		Thread.sleep(100);
	}
	
}
