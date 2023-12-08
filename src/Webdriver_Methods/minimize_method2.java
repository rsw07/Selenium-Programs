package Webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class minimize_method2 
{
	public static void main(String[] args) 
	{
		WebDriver obj = new ChromeDriver();
		obj.get("https://www.zomato.com/india");
		
		obj.manage().window().minimize();
		
	}

}
