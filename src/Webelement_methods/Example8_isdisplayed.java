package Webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example8_isdisplayed
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean result = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		System.out.println(result);
		if(result)
		{
			System.out.println("Webelement is displayed");
		}
		else
		{
			System.out.println("Webelement is not displayed");
		}
	}

}
