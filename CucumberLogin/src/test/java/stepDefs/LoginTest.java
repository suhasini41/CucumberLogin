package stepDefs;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import loginPage.LoginPage;

public class LoginTest 
{
	BaseClass bs = BaseClass.getBaseClassInstance();
	WebDriver driver = bs.getDriver();
	String uname,pass;
	
	LoginPage login = new LoginPage(driver);
	
	@Given("^the user in on login page with title \"([^\"]*)\"$")
	public void the_user_in_on_login_page_with_title(String expectedTitle) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://assignmentbucket123.s3.us-east-2.amazonaws.com/pom/Login.html");
		//System.out.println(login.getTitle());
		Assert.assertTrue(login.getTitle().contains(expectedTitle));
	}

	@When("^the user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_and(String username, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    login.enterUserName(username);
	    login.enterPassword(password);
	    uname=username;
	    pass = password;
	    System.out.println("username: "+uname);
	    System.out.println("password: "+pass);
	}

	@When("^clicks on Login button$")
	public void clicks_on_Login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    login.clickLoginButton();
	}

	@Then("^validate login successfull only with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void validate_login_successfull_only_with_username_and_password(String validUsername, String validPassword) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    if((uname.equals(validUsername))&&(pass.equals(validPassword)))
//	    {
//	    	Assert.assertTrue(login.getTitle().contains("assignment"));
//	    }
//	    else
//	    {
//	    	Util.waitTillAlertPresent(driver);
//	    	System.out.println(Util.getAlertText(driver));
//	    	Util.switchToAlertOk(driver);
//	    }
		
		//Assert.assertTrue(login.getTitle().contains("assignment"));
		Thread.sleep(2000);
		System.out.println(login.getCurrentURL());
		Assert.assertTrue(login.getCurrentURL().contains("index.html"));
	}

}
