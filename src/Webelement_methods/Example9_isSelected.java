//isSelected()

package Webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example9_isSelected 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		boolean result = driver.findElement(By.xpath("//input[@type='radio']")).isSelected();
		if(result)
		{
			System.out.println("radio button is selected");
		}
		else
		{
			System.out.println("radio button is not selected");
		}
	}

}
