//getText()  --> return type is string
//           --> returns the text of element 

package Webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_gettext 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.findElement(By.xpath("//button[@value='1']")).getText());
		
		String s = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
		System.out.println(s);
	}

}
