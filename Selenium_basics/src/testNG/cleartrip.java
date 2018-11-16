package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class cleartrip {
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
	public void testcleartrip() throws InterruptedException{
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("RoundTrip")).click();
		WebElement from=driver.findElement(By.id("FromTag"));
		from.sendKeys("hyd");
		Thread.sleep(6000);
		from.sendKeys(Keys.ENTER);
		WebElement to=driver.findElement(By.id("ToTag"));
		to.sendKeys("ban");
		Thread.sleep(3000);
		to.sendKeys(Keys.ARROW_DOWN);	
		to.sendKeys(Keys.ENTER);
		
		
		
	}

}
