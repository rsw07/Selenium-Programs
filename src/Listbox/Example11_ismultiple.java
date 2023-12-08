//isMultiple() => returns true if listbox is multiselectable
//             => returns false if listbox is single selectable

package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example11_ismultiple
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		WebElement w = driver.findElement(By.xpath("//select[@id='month']"));
		Select s = new Select(w);
		boolean b = s.isMultiple();
		System.out.println(b);
		
	}

}
