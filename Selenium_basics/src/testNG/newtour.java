package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class newtour {
	
	WebDriver driver;
  @Test(dataProvider = "login")
  public void onewaytrip(String Uname, String Pwd) {
	  driver.get("http://newtours.demoaut.com/");
	  driver.findElement(By.name("userName")).sendKeys(Uname);
	  driver.findElement(By.name("password")).sendKeys(Pwd);
	  driver.findElement(By.name("login")).click();
	  driver.findElement(By.cssSelector("input[value='oneway']")).click();
	  driver.findElement(By.name("passCount")).sendKeys("3");
	  Select sel=new Select(driver.findElement(By.name("fromPort")));  
	  List<WebElement> list=sel.getOptions();
	  for(WebElement e:list)
	  {
		  String city=e.getText();
		  if(city.equals("paris"))
		  {
			  sel.selectByVisibleText(city);
			  break;
		  }
	  }
	  
			  }

  @DataProvider
  public Object[][] login() {
     Object[][] obj={
    		 {"marcury","marcury"},
    		 {"marcury","marcury"},
    		 {"marcury","marcury"},
    		 {"marcury","marcury"}
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
