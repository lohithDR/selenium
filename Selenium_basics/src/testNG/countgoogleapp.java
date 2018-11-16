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

public class countgoogleapp {
WebDriver driver;
	
	@BeforeClass
	public void beforclass()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.09\\Desktop\\New folder\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterClass (enabled=false)
	public void afterclass()
	{
		driver.close();
	}
	@Test

	public void testcountgoogleapp(){
		driver.get("https://www.google.com/");
		driver.findElement(By.cssSelector("a[href='https://www.google.co.in/intl/en/options/']")).click();
		WebElement table=driver.findElement(By.cssSelector("ul[aria-dropeffect='move']"));
		List<WebElement> list=table.findElements(By.tagName("li"));
		Assert.assertEquals(list.size(), 13);
		//driver.findElement(By.xpath("//div[@aria-label='Google apps']/ul/li[5]")).click(); /* find the play app in google apps and click operation */
		
		
	}

}
