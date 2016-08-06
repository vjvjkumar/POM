
package com.wordpress.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**PageObjectModel with selenium pagefactory.
 * @author VJ
  */
public class LoginPageNew 
{
	WebDriver driver;
	
	public LoginPageNew (WebDriver local_driver) //creating a constructor, WebDriver as an argument & this driver will-  
												//-come from PageFactory and we'll initialize to the local driver
	{
		this.driver = local_driver;
	}
	@FindBy (id = "user_login")  // this is one-way of using @FindBy, and the standard way is by using "how=How" keyword
	WebElement username;
	
	@FindBy (how =How.ID, using = "user_pass") 
	WebElement password;
	
	@FindBy (how =How.XPATH, using = ".//*[@id='wp-submit']") 
	WebElement submitButton;
	
	@FindBy (how =How.LINK_TEXT, using = "Lost your password? ") 
	WebElement forget_password_link;
	
	public void login_wordpress(String uname, String pass)
	{
		username.sendKeys(uname);
		password.sendKeys(pass);
		submitButton.click();
	}
}
