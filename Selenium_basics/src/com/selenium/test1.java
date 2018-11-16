package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class test1 {
	public static void main(String[] args)
	{
		/* Chrome Driver */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.09\\Desktop\\New folder\\Drivers\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		/* IE */
		System.setProperty("webdriver.ie.driver", "C:\\Users\\training_b6b.01.09\\Desktop\\New folder\\Drivers\\IEDriverServer.exe");
		WebDriver Driver1=new InternetExplorerDriver();
		//Driver1.close();
		/* Firefox */
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\training_b6b.01.09\\Desktop\\New folder\\Drivers\\geckodriver.exe");
		WebDriver Driver2=new FirefoxDriver();
		System.out.println("opened window");
		Driver.manage().window().maximize();
		System.out.println("Maximize window");
		//Driver.close();
		System.out.println("Closed window");
	}

}