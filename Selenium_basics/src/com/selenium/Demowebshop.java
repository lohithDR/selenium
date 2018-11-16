package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebshop {

	public static void main(String[] args)
	{
		/* Chrome Driver */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.09\\Desktop\\New folder\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://demowebshop.tricentis.com/register");
		driver.navigate().to("http://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("lohith");
		driver.findElement(By.id("LastName")).sendKeys("Ravi");
		driver.findElement(By.id("Email")).sendKeys("demowed@test3.com");
		driver.findElement(By.name("Password")).sendKeys("abcd123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("abcd123");
		driver.findElement(By.id("register-button")).click();
		String result=driver.findElement(By.className("result")).getText();
		System.out.println("Result : "+result);
		if(result.equals("Your registration completed"))
		{
			System.out.println("Test case pass");
		}
			else				
			{
				System.out.println("Test case fail");
			}
		System.out.println("Test case cont...");
		driver.close();
		System.out.println("Window get Close");
	}

}
