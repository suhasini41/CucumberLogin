package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	WebDriver driver = null;
	static BaseClass bs = null;
	
	private BaseClass()
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static BaseClass getBaseClassInstance()
	{
		if(bs==null)
		{
			bs = new BaseClass();
		}
		return bs;
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}

}
