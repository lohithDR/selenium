package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class demowebshoplogin {
	WebDriver driver;
	@BeforeClass //its execute only once in class and same as @AfterClass
	//@BeforeMethod   //its execute every methods in class and same as @AfterMethod
	public void beforeMethod()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.09\\Desktop\\New folder\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterClass
	public void afterMethod()
	{
		driver.close();
	}
	@Test //(enabled=false) 
	public void Register()
	{
	driver.get("http://demowebshop.tricentis.com/register");
	//driver.navigate().to("http://demowebshop.tricentis.com/register");
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.id("FirstName")).sendKeys("lohith");
	driver.findElement(By.id("LastName")).sendKeys("ravi");
	driver.findElement(By.id("Email")).sendKeys("demowed@test17.com");
	driver.findElement(By.name("Password")).sendKeys("abcd123");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("abcd123");
	driver.findElement(By.id("register-button")).click();
	String result=driver.findElement(By.className("result")).getText();
	System.out.println("Result : "+result);
	Assert.assertEquals(result, "Your registration completed");
	//driver.findElement(By.className("button-1 register-continue-button")).click();
	driver.findElement(By.className("ico-logout")).click();
	
	}
	
	@Test (dependsOnMethods ={"Register"})
	public void login()
	{		
		driver.get("http://demowebshop.tricentis.com/");
		//driver.findElement(By.className("button-1 register-continue-button")).click();
		//driver.findElement(By.className("ico-logout")).click();
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("demowed@test7.com");
		driver.findElement(By.id("Password")).sendKeys("abcd123");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		String name=driver.findElement(By.className("account")).getText();
		//Assert.assertEquals(name, "demowed@test7.com");
		Assert.assertNotNull(name);
		System.out.println("Login ID" +name);
	
		
	}
}
