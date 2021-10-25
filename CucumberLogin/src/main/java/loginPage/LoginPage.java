package loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='userid']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='pwd']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginButton;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickLoginButton()
	{
		loginButton.submit();
	}
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public String getCurrentURL()
	{
		return driver.getCurrentUrl();
	}
	
	public String getUserName()
	{
		return username.getAttribute("value");
	}
	public String getPassword()
	{
		return password.getAttribute("value");
	}

}
