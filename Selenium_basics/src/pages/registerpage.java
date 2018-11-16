package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class registerpage {
WebDriver driver;
@FindBy(id="gender-male")
WebElement gender;
@FindBy(id="FirstName")
WebElement fname;
@FindBy(id="LastName")
WebElement lname;
@FindBy(id="Email")
WebElement email;
@FindBy(id="Password")
WebElement password;
@FindBy(id="ConfirmPassword")
WebElement confirmpassword;
@FindBy(id="register-button")
WebElement registerbutton;
@FindBy(className="result")
WebElement result;
@FindBy(linkText="Log out")
WebElement signout;


public registerpage(WebDriver driver) {
	super();
	this.driver = driver;
}
public String sendregister()
{
	gender.click();
	fname.sendKeys("lohith");
	lname.sendKeys("ravi");
	email.sendKeys("demowed@test25.com");
	password.sendKeys("abcd123");
	confirmpassword.sendKeys("abcd123");
	registerbutton.click();
	return result.getText();
	
}
public void signout()
{
	signout.click();
}
}
