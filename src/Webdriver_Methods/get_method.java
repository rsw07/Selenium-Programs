//get() --> it is used to open link/url in browser

package Webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_method 
{
	public static void main(String[] args) 
	{
		WebDriver obj = new ChromeDriver();
		obj.get("https://www.facebook.com/");
	}

}
