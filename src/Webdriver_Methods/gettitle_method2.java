package Webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettitle_method2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver obj = new ChromeDriver();
		
		Thread.sleep(2000);
		
		obj.get("https://www.zomato.com/india");
		
		Thread.sleep(2000);
		
		System.out.println(obj.getTitle());
		
		obj.close();
	}

}
