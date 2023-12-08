package Webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5_getattribute 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");
		String a = driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
		System.out.println(a);
	}

}
