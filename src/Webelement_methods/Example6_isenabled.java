package Webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6_isenabled 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean result = driver.findElement(By.xpath("(//a[@role='button'])[2]")).isEnabled();
		System.out.println(result);
		
		if(result)
		{
			System.out.println("Button is enabled");
		}
		else
		{
			System.out.println("Button is disabled");
		}
	}

}
