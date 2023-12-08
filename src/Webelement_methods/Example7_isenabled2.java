package Webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example7_isenabled2 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		boolean result = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).isEnabled();
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
