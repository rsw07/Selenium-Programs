package Webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class minimize_method
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/india");
		
		Options o = driver.manage();
		Window w = o.window();
		w.minimize();
		
	}

}
