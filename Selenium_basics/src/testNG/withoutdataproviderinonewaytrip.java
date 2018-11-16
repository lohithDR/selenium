package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class withoutdataproviderinonewaytrip {
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
	public void withoutdataprovider() throws InterruptedException{
	driver.get("http://newtours.demoaut.com/");
	  driver.findElement(By.name("userName")).sendKeys("marcury");
	  driver.findElement(By.name("password")).sendKeys("marcury");
	  driver.findElement(By.name("login")).click();
	  driver.findElement(By.cssSelector("input[value='oneway']")).click();
	  driver.findElement(By.name("passCount")).sendKeys("3");
	  Select sel=new Select(driver.findElement(By.name("fromPort")));  
	  List<WebElement> list=sel.getOptions();
	  for(WebElement e:list)
	  {
		  String city=e.getText();
		  if(city.equals("Paris"))
		  {
			  sel.selectByVisibleText(city);
			  System.out.println("city Name  "  +city);
			  Assert.assertEquals(city, "Paris");
			  break;
		  }
		  
		 
	  }
	  
	  
			  }
}
