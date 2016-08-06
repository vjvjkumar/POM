/**
 * 
 */
package com.wordpress.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**PageObjectModel WITHOUT selenium pagefactory.
 * @author VJ
 *
 This class will store all the locators and methods of login page
*
*/
public class LoginPage 
{
		WebDriver driver;

		By username		=By.id("user_login");
		By password		=By.xpath(".//*[@id='user_pass']");
		By loginButton	=By.name("wp-submit");

	public LoginPage(WebDriver driver) // this is a constructor for login page (CLASS name & Constructor name should be always same) 
	{
		this.driver=driver;
	}
	public void loginToWordpress(String userid, String pass)
	{
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
	}
	public void typeUserName(String uid)
	{
		driver.findElement(username).sendKeys(uid);
	}
	public void typePassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void clickOnLoginButton()
	{
		driver.findElement(loginButton).click();
	}
}

