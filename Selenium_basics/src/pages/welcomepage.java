package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class welcomepage {
WebDriver driver;
@FindBy(linkText="Register")
WebElement register;
@FindBy(linkText="Log in")
WebElement login;
@FindBy(partialLinkText="Shopping cart")
WebElement shoppingcart;
public welcomepage(WebDriver driver) {
	super();
	this.driver = driver;
}
public String clickRegister()
{
	register.click();
	return driver.getCurrentUrl();
}
public String clicklogin()
{
	login.click();
	return driver.getCurrentUrl();
}
public void sendurl(String url)
{
	driver.get(url);
	driver.manage().window().maximize();
}

}


