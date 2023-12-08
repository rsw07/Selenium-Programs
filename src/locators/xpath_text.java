//facebook forgotten password using xpath by text
//xpath by text ---> //tagname[text()='text value']

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_text 
{
	public static void main(String[] args) 
	{
		WebDriver obj = new ChromeDriver();
		obj.get("https://www.facebook.com/");
		obj.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
	}

}
