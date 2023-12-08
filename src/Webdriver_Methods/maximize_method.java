package Webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize_method 
{
	public static void main(String[] args)
	{
		WebDriver obj = new ChromeDriver();
		
		obj.get("https://www.zomato.com/india");
		
		Options o = obj.manage(); //upcasting --> manage is method of webdriver interface and returns options interface
		
		Window w = o.window();  //upcasting --> window is method of options interface and returns window interface
		
		w.maximize();          //maximize is a method of window interface.	
	}
}
