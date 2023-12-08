//sendKeys()

package Webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_sendkeys 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");
		
		WebElement a =driver.findElement(By.xpath("//input[@type='password']"));
		a.sendKeys("abc");
		Thread.sleep(2000);
		a.clear();
		Thread.sleep(2000);
		a.sendKeys("xyz");
		
	}

}
