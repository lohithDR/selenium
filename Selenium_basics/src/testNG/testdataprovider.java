package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class testdataprovider {
	WebDriver driver;
  @Test(dataProvider = "login")
  public void loginwebshop(String Uname,String Pwd) {
	  driver.get("http://demowebshop.tricentis.com");
	  
	  driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys(Uname);
		driver.findElement(By.id("Password")).sendKeys(Pwd);
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		String name=driver.findElement(By.className("account")).getText();
		Assert.assertNotNull(name);
		driver.findElement(By.cssSelector("a[href='/logout']")).click();
  }

  @DataProvider
  public Object[][] login() {
     Object[][] obj={
    		 {"demowed@test7.com","abcd123"},
    		 {"demowed@test7.com","abcd123"},
    		 {"demowed@test7.com","abcd123"},
    		 {"demowed@test7.com","abcd123"}
     };
     return obj;
  }
  @BeforeClass
  @Parameters("browserName")
  public void beforeClass(String value) {
	  driver=drivers.getDriver(value);
	driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
