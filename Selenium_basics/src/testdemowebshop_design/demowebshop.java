package testdemowebshop_design;

import org.testng.annotations.Test;

import pages.loginpage;
import pages.registerpage;
import pages.welcomepage;
import testNG.drivers;

import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class demowebshop {
	WebDriver driver;
	welcomepage welcomepage;
	loginpage loginpage;
	registerpage registerpage;
  @Test (priority=1)
  public void testwelcome() {
	  welcomepage.sendurl("http://demowebshop.tricentis.com/");
	  String url=welcomepage.clickRegister();
	  Assert.assertTrue(url.contains("register"));
	   
  }
 
  
  @Test (priority=3)
  public void testlogin(){
	  welcomepage.clicklogin();
	  String result=loginpage.signin();
	  Assert.assertTrue(result.contains("login"));
	  
	  
  }
  @Test (priority=2)
  public void testregister(){
	 String result=registerpage.sendregister();
	 Assert.assertTrue(result.contains("completed"));
	 registerpage.signout();
	  
  }
  
  
  
  
  @BeforeClass
  //@Parameters("browserName")
  public void beforeClass() {
	  driver=drivers.getDriver("firefox");
	 welcomepage=PageFactory.initElements(driver, welcomepage.class);
	  loginpage=PageFactory.initElements(driver, loginpage.class);
	  registerpage=PageFactory.initElements(driver, registerpage.class);
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  welcomepage=null;
	  loginpage=null;
	  registerpage=null;
	  
  }

}
