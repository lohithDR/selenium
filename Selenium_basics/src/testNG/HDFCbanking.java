package testNG;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class HDFCbanking {


	
	@Test
	public void windowalerthandle() {
		WebDriver driver=drivers.getDriver("chrome");
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("loginsubmit")).click();
		String home=driver.getWindowHandle();//only current window
		Set<String> set=driver.getWindowHandles();//all window
		Object[] s=set.toArray();
		driver.switchTo().window(s[1].toString());
		
		/*
		 for(String s:set)
		 		{
			driver.switchTo().window(s);
		}
		*/
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/a")).click();
		driver.switchTo().frame(driver.findElement(By.name("login_page")));//frame handling 
		//driver.findElement(By.name("fldLoginUserId")).sendKeys("cust123");
		driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[6]/td[2]/a/img")).click();
		if(ExpectedConditions.alertIsPresent()!=null)
		{
			Alert alt=driver.switchTo().alert();
			String errormsg=alt.getText();
			System.out.println(errormsg);
			alt.accept();
		}
		driver.findElement(By.name("fldLoginUserId")).sendKeys("cust123");
		driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[6]/td[2]/a/img")).click();
		
		 driver.switchTo().window(s[0].toString());
		 
		//driver.switchTo().window(home);
		//Thread.sleep(2000);
		//driver.close();
		driver.quit();
	}

	
}
