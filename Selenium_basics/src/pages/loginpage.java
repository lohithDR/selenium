package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage {
WebDriver driver;
@FindBy(id="Email")
WebElement email;
@FindBy(id="Password")
WebElement password;
@FindBy(className="ico-login")
WebElement loginbutton;
@FindBy(linkText="Log out")
WebElement logout;

public loginpage(WebDriver driver) {
	super();
	this.driver = driver;
}

public String signin()
{
	email.sendKeys("demowed@test17.com");
	password.sendKeys("abcd123");
	loginbutton.click();
	return driver.getCurrentUrl();
}


}
