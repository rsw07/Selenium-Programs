package Webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example10_isSelected 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		WebElement result=driver.findElement(By.xpath("//input[@type='radio']"));
		Thread.sleep(2000);
		boolean a = result.isSelected();
		if(a)
		{
			System.out.println("Radio button is selected");
		}
		else
		{
			System.out.println("Button is not selected");
			result.click();
			boolean b=result.isSelected();
			if(b)
			{
				System.out.println("Button is selected");
			}
			else
			{
				System.out.println("Button is not selected");
			}
			
		}
	}

}
