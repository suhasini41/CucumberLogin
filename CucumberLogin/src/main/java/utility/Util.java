package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util 
{
	public static void switchToAlertOk(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public static String getAlertText(WebDriver driver)
	{
		return driver.switchTo().alert().getText();
	}
	
	public static void waitTillAlertPresent(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
	}

}
