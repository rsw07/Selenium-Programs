package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example4_Multiselectable_listbox 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/wasdi/OneDrive/Desktop/Multiselected_Listbox.html");
		WebElement ele = driver.findElement(By.xpath("//select[@multiple='true']"));
		Select s = new Select(ele);
		s.selectByIndex(0);   //selects india
		s.selectByVisibleText("USA");   //Selects USA
		s.selectByVisibleText("England");   //selects england
		
	}

}
