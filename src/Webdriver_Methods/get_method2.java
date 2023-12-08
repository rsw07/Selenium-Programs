//get()

package Webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class get_method2
{
	public static void main(String[] args) 
	{
		WebDriver obj1 = new FirefoxDriver();
		obj1.get("https://www.instagram.com/");
		
	}

}
