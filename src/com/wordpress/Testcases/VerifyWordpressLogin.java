/**
 * 
 */
package com.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wordpress.Pages.LoginPage;

/**PageObjectModel WITHOUT selenium pagefactory.
 * @author VJ
 
 */
public class VerifyWordpressLogin 
{
	@Test
	public void verifyValidLogin()
	{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://en.wordpress.com/wp-login.php");
	
	LoginPage login = new LoginPage(driver);

	login.clickOnLoginButton();
	driver.quit();
	}
}
