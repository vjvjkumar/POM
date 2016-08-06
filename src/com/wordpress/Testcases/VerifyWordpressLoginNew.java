package com.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.Pages.LoginPage;
import com.wordpress.Pages.LoginPageNew;

import pageFactoryUtility.BrowserFactory;

public class VerifyWordpressLoginNew 
{
	@Test
	public void checkValidUser() throws InterruptedException
	{
	//this will launch browser and specific url
	WebDriver driver=BrowserFactory.startBrowser("Chrome","https://en.wordpress.com/wp-login.php");
	
	//created PageObject using Page Factory
	LoginPageNew login_page = PageFactory.initElements(driver, LoginPageNew.class); 
											//this will return me the PageObjects of "LoginPageNew" class only
	
	//call the method
	login_page.login_wordpress("admin", "demo123");
	}
}
