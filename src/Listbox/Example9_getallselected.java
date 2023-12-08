package Listbox;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example9_getallselected
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/wasdi/OneDrive/Desktop/Multiselected_Listbox.html");
		WebElement ele = driver.findElement(By.xpath("//select[@multiple='true']"));
		Select s = new Select(ele);
		s.selectByIndex(3);
		Thread.sleep(2000);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByIndex(0);
		List<WebElement> lw = s.getAllSelectedOptions();
		for(WebElement w :lw)
		{
			System.out.println(w.getText());
		}
		
	}

}
