//isMultiple() => returns true if listbox is multiselectable
//             => returns false if listbox is single selectable

package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example12_ismultiple
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/wasdi/OneDrive/Desktop/Multiselected_Listbox.html");
		WebElement w = driver.findElement(By.xpath("//select[@multiple='true']"));
		Select s = new Select(w);
		boolean b = s.isMultiple();
		System.out.println(b);
		if(b)
		{
			System.out.println("Listbox is Multiselectable");
		}
		else
		{
			System.out.println("Listbox is Singleselectable");
		}
		
	}

}
