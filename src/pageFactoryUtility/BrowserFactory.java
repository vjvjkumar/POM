/*This is OPTIONAL part, i can skip this if am working with PAGEFACTORY, but this will reduce the code and
maintainability will be very less*/

package pageFactoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory 
{
		static WebDriver driver; // creating a static global variable
	
	public static WebDriver startBrowser(String browserName, String url) throws InterruptedException //passing browserName & url as parameters
		{
		if (browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "V:\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "V:\\SeleniumJars\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get(url);
		return driver;
		}
}