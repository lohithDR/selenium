package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class drivers {
	public static WebDriver getDriver(String browserName)
	{
			if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.09\\Desktop\\New folder\\Drivers\\chromedriver.exe");
			return new ChromeDriver();
		}else
			if(browserName.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\training_b6b.01.09\\Desktop\\New folder\\Drivers\\geckodriver.exe");
				return new FirefoxDriver();
			}else
				if(browserName.equals("ie"))
				{
					System.setProperty("webdriver.ie.driver", "C:\\Users\\training_b6b.01.09\\Desktop\\New folder\\Drivers\\IEDriverServer.exe");
					return new InternetExplorerDriver();
				}else
					return null;
	}

}
